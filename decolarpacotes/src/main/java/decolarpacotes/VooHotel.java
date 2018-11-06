package decolarpacotes;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




		public class VooHotel {
		
				 


					private WebDriver driver;

					@Before
					public void setUp() {

						System.setProperty("webdriver.chrome.driver","/Users/llobo/workspace/decolarpacotes/chromedriver.exe");
						driver = new ChromeDriver(); // instancia ChromeDriver
						driver.get("https://www.decolar.com/pacotes/"); // pegar url
						driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
						driver.manage().window().maximize(); // maximizar pagina
						
					}

					@Test
					public void VooHotel1() throws InterruptedException, IOException, ParseException
					{			
						
						
						
						WebElement ClickFecha=driver.findElement(By.xpath("/html/body/div[15]/div/div[1]/span"));
						ClickFecha.click();
						
						Json VooHotel=new Json("dados.json");
						VooHotel.LerJson("dados.json");
						
						
						
						WebElement OrigemHotel = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/input"));
				        OrigemHotel.clear();
						OrigemHotel.sendKeys(VooHotel.GetOrigemViagem());
						
						
						WebElement Click=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/ul/li[1]/a"));
						Click.click();
						
						
						WebElement DestinoHotel = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div/input"));
						DestinoHotel.click();
						DestinoHotel.sendKeys(VooHotel.GetDestinoViagem());
						
						WebElement ClickEscolhe2=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div[1]/ul/li[1]/a"));
						ClickEscolhe2.click();
						
						
						WebElement ClickData=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[4]/div[1]/div/div[2]/div[1]/div[1]/div/div/input"));
						ClickData.click();
						
						
						WebElement ClickData1=driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[2]/div[4]/span[9]"));
						ClickData1.click();
						
						Thread.sleep(1000);
						ClickData1=driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[2]/div[4]/span[16]"));
						ClickData1.click();
						
						WebElement ClickFinal=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[7]/a/em"));
						ClickFinal.click();
					
						// nova tela ver hotel
						
						String winHandleBefore = driver.getWindowHandle();
						WebElement ClickVerHotel=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div/dp-package-cluster/div/dp-package-fare/div/div[3]/a"));
						ClickVerHotel.click();
						
						for(String winHandle : driver.getWindowHandles()){
						    driver.switchTo().window(winHandle);
						}
						
						Thread.sleep(1000);
						WebElement ClickVerHotel1=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[2]/div/d-hotel-hero/div/d-hotel-hero-fare/div/div[4]/a"));
						ClickVerHotel1.click();
						
						
						WebElement ClickVerHotel2=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[5]/div[2]/div/div[1]/div/div[4]/eva-button/button"));
						ClickVerHotel2.click();
						
						
						
						
					}
						
					
		
		}