package decolarpacotes;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HotelCarro {

	
	
	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "/Users/llobo/workspace/decolarpacotes/chromedriver.exe");
		driver = new ChromeDriver(); // instancia ChromeDriver
		driver.get("https://www.decolar.com/pacotes/"); // pegar url
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // maximizar pagina

	}

	@Test
	public void HotelMaisCarro() throws InterruptedException, IOException, ParseException
	{
		
		Json nw =new Json ("dados.json");
		nw.LerJson("dados.json");
		
		Thread.sleep(3000);		
		WebElement ClickFecha=driver.findElement(By.xpath("/html/body/div[15]/div/div[1]/span"));
		ClickFecha.click();
		
		Thread.sleep(3000);	
		WebElement ClickEscolhe=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[2]/div/div[3]/label/div"));
		ClickEscolhe.click();
		
		WebElement DestinoHotel = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div/input"));
		DestinoHotel.click();
		DestinoHotel.sendKeys(nw.GetDestinoViagem());
		
		WebElement ClickEscolhedata=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[4]/div[1]/div/div[2]/div[1]/div[1]/div/div/input"));
		ClickEscolhedata.click();
						
		WebElement ClickData1=driver.findElement(By.className("input-tag sbox-checkin-date -sbox-3-no-radius-right"));
		ClickData1.click();				
		
		WebElement ClickEscolheData2=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[4]/div[3]/div/div[2]/div/div[2]/div/div[1]/div/div/input"));
		ClickEscolheData2.click();
		
		WebElement ClickData2=driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[1]/div[4]/span[12]"));
		ClickData2.click();
		
		
		WebElement AluguelClick=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[4]/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div/select"));
		AluguelClick.click();
		
		WebElement AluguelHora=driver.findElement(By.xpath("06:30"));
		AluguelHora.click();
		
		WebElement AluguelClick1=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[4]/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div/select"));
		AluguelClick1.click();
		
		WebElement AluguelHora1=driver.findElement(By.xpath("06:30"));
		AluguelHora1.click();
		
		Thread.sleep(3000);	
		WebElement ProcurarClick=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[7]/a/em"));
		ProcurarClick.click();
		
	}
}
