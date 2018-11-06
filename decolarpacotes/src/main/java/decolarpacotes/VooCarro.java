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

public class VooCarro 
{

	private WebDriver driver;

	@Before
	public void setUp() 
	{

		System.setProperty("webdriver.chrome.driver","/Users/llobo/workspace/decolarpacotes/chromedriver.exe");
		driver = new ChromeDriver(); // instancia ChromeDriver
		driver.get("https://www.decolar.com/pacotes/"); // pegar url
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // maximizar pagina
		
	}

	
  //  public static void takeScreenshot(String fileName){
    //  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      // Date data = new Date(0);
       //try {
         //  FileUtils.copyFile(scrFile, new File(&amp;quot;D:\\SeleniumScreenShots\\&amp;quot;+fileName+ data.getTime()+&amp;quot;.jpeg&amp;quot;),true);
       //} catch (IOException e) {
        //   e.printStackTrace();
      // }
   //}
	
	@Test
	public void VooMaisCarro() throws InterruptedException, IOException, ParseException
	
	{			
		Json nw=new Json("dados.json");
		nw.LerJson("dados.json");
		
		
	   
		
		
		WebElement ClickFecha=driver.findElement(By.xpath("/html/body/div[15]/div/div[1]/span"));
		ClickFecha.click();
		
		Thread.sleep(3000);
		WebElement ClickEscolhe=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[2]/div/div[2]/label/div"));
		ClickEscolhe.click();
		
		WebElement OrigemHotel = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/input"));
        OrigemHotel.clear();
		OrigemHotel.sendKeys(nw.GetOrigemViagem());
		
		
		WebElement Click=driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/ul/li[1]/a"));
		Click.click();
		
		WebElement DestinoHotel = driver.findElement(By.xpath("//*[@id=\"searchbox-sbox-all-boxes\"]/div/div/div[3]/div/div[1]/div/div[2]/div/div[2]/div/div/input"));
		DestinoHotel.click();
		DestinoHotel.sendKeys(nw.GetDestinoViagem());
		
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
		
		Thread.sleep(1000);
		WebElement PassagemClik=driver.findElement(By.xpath("//*[@id=\"ux-flights-clusters\"]/div[1]/div[2]/div[2]/div[2]/ul/li[1]/a[1]/span[2]"));
		PassagemClik.click();
		
		//analisar o de baixo carro click
		
		Thread.sleep(1000);
		WebElement CarroClick=driver.findElement(By.xpath("//*[@id=\"ux-cars-clusters\"]/div/div[2]/div[2]/div/ul/li[3]/a/span[2]"));
		CarroClick.click();
		
		Thread.sleep(1000);		
		
		// TelaCadastroInformacoes
		WebElement CampoNome=driver.findElement(By.xpath("//*[@id=\"traveler-first-name-0\"]"));
		CampoNome.click();
		CampoNome.sendKeys(nw.GetAdulto1PrimeiroNome());
		
		
		WebElement CampoSegundoNome=driver.findElement(By.xpath("//*[@id=\"traveler-last-name-0\"]"));
		CampoSegundoNome.click();
		CampoSegundoNome.sendKeys(nw.GetAdulto1UltimoNome());
		
		WebElement CampoCPF=driver.findElement(By.xpath("//*[@id=\"input-document-number-0\"]"));
		CampoCPF.click();
		CampoCPF.sendKeys(nw.GetAdulto1CPF());
		
		
		WebElement  Adulto2Nome=driver.findElement(By.xpath("//*[@id=\"traveler-first-name-1\"]"));
		Adulto2Nome.click();
		Adulto2Nome.sendKeys(nw.GetAdulto2PrimeiroNome());
		
		WebElement  Adulto2Segundonome=driver.findElement(By.xpath("//*[@id=\"traveler-last-name-1\"]"));
		Adulto2Segundonome.click();
		Adulto2Segundonome.sendKeys(nw.GetAdulto2UltimoNome());
		
		
		WebElement  Adulto2CPF=driver.findElement(By.xpath("//*[@id=\"input-document-number-1\"]"));
		Adulto2CPF.click();
		Adulto2CPF.sendKeys(nw.GetAdulto2CPF());
		
		
		
		WebElement  CondutorNome=driver.findElement(By.xpath("//*[@id=\"inputDriverFirstName\"]"));
		CondutorNome.click();
		CondutorNome.sendKeys(nw.GetCondutorNome());
		
		
		WebElement  CondutorSobrenome=driver.findElement(By.xpath("//*[@id=\"inputDriverLastName\"]"));
		CondutorSobrenome.click();
		CondutorSobrenome.sendKeys(nw.GetCondutorUltimoSobrenome());
		
		
		
		WebElement  CondutorIdade=driver.findElement(By.xpath("//*[@id=\"ux-common-checkout-age\"]"));
		CondutorIdade.click();
		CondutorIdade.sendKeys(nw.GetCondutorIdade());
		CondutorIdade.click();
		
		Thread.sleep(1000);
		WebElement  CartaoPagamento=driver.findElement(By.xpath("//*[@id=\"singleCreditCardPayment\"]/div/ul/li[1]/label/div/span[1]/div/span"));
		CartaoPagamento.click();
		
		
		//aqui
		
		Thread.sleep(3000);
		WebElement  CartaoBanco=driver.findElement(By.xpath("//*[@id=\"single-card\"]"));
		CartaoBanco.click();
					
		//mexiabaixo
		
		Thread.sleep(1000);
		WebElement  CartaoParcelas=driver.findElement(By.xpath("//*[@id=\"ux-common-checkout-creditcard-fee-VI\"]"));
		CartaoParcelas.click();
		CartaoParcelas.sendKeys(nw.GetPagamento01Parcelas());
		
		Thread.sleep(1000);
		WebElement  CartaoNumero=driver.findElement(By.xpath("//*[@id=\"primaryPaymentSingleCardNumber\"]"));
		CartaoNumero.click();
		CartaoNumero.sendKeys(nw.GetPagamentoNumCartao());
		
		Thread.sleep(1000);
		WebElement  CartaoValidade=driver.findElement(By.xpath("//*[@id=\"primaryPaymentSingleCardExpirationMonth\"]"));
		CartaoValidade.sendKeys(nw.GetPagamentoMesValidadeCartao());
		CartaoValidade.click();
		
		Thread.sleep(1000);
		WebElement  CartaoAno=driver.findElement(By.xpath("//*[@id=\"primaryPaymentSingleCardExpirationYear\"]"));
		CartaoAno.sendKeys(nw.GetPagamentoAnoValidadeCartao());
		CartaoAno.click();
		
		Thread.sleep(1000);
		WebElement  CartaoCodigo=driver.findElement(By.xpath("//*[@id=\"primaryPaymentSingleCardSecurityCode\"]"));
		CartaoCodigo.click();
		CartaoCodigo.sendKeys(nw.GetPagamentoCartaoCod());
		
		
		Thread.sleep(1000);
		WebElement  CartaoTitular=driver.findElement(By.xpath("//*[@id=\"primaryPaymentSingleCardOwnerName\"]"));
		CartaoTitular.click();
		CartaoTitular.sendKeys(nw.GetPagamentoTitCartao());
		
		Thread.sleep(1000);
		WebElement  CartaoTitularCPF=driver.findElement(By.xpath("//*[@id=\"primaryPaymentSingleCardOwnerDocumentNumber\"]"));
		CartaoTitularCPF.click();
		CartaoTitularCPF.sendKeys(nw.GetPagamentoCpfCartao());
		
		Thread.sleep(1000);
		WebElement  CartaoTitularPais=driver.findElement(By.xpath("//*[@id=\"billing-country-name-primaryPayment\"]"));
		CartaoTitularPais.sendKeys(nw.GetCartaoTitularPais());
		
		Thread.sleep(1000);
		WebElement  CartaoTitularPaisClick=driver.findElement(By.xpath("//*[@id=\"billing-country-primaryPayment-select\"]/ul/li[1]/label"));
		CartaoTitularPaisClick.click();
		
		
		Thread.sleep(1000);
		WebElement  CartaoTitularEstado=driver.findElement(By.xpath("//*[@id=\"billing-state-primaryPaymentSingleCard\"]"));
		CartaoTitularEstado.sendKeys(nw.GetCartaoTitularEstado());
		CartaoTitularEstado.click();
		
		Thread.sleep(1000);
		WebElement  CartaoTitularCidade=driver.findElement(By.xpath("//*[@id=\"billing-address-city-primaryPaymentSingleCard\"]"));
		CartaoTitularCidade.click();
		
		CartaoTitularCidade.sendKeys(nw.GetCartaoTitularCidade());
		Thread.sleep(1000);
		WebElement  CartaoTitularCEP=driver.findElement(By.xpath("//*[@id=\"billing-address-postal-code-primaryPaymentSingleCard\"]"));
		CartaoTitularCEP.click();
		CartaoTitularCEP.sendKeys(nw.GetCartaoTitularCEP());
		
		Thread.sleep(1000);
		WebElement  CartaoTitularEndereco=driver.findElement(By.xpath("//*[@id=\"billing-address-street-primaryPaymentSingleCard\"]"));
		CartaoTitularEndereco.click();
		CartaoTitularEndereco.sendKeys(nw.GetCartaoTitularEndereco());
		
		Thread.sleep(1000);
		WebElement  CartaoTitularEnderecoNumero=driver.findElement(By.xpath("//*[@id=\"billing-address-number-primaryPaymentSingleCard\"]"));
		CartaoTitularEnderecoNumero.click();
		CartaoTitularEnderecoNumero.sendKeys(nw.GetCartaoTitularEnderecoNumero());
		
		Thread.sleep(1000);
		WebElement NotaFiscalEstado=driver.findElement(By.xpath("//*[@id=\"invoice-state-primaryPayment\"]"));
		NotaFiscalEstado.sendKeys(nw.GetNotaFiscalEstado());
		NotaFiscalEstado.click();
		
		Thread.sleep(1000);
		WebElement  NotaFiscalCidade=driver.findElement(By.xpath("//*[@id=\"invoice-city-name-primaryPayment\"]"));
		NotaFiscalCidade.sendKeys(nw.GetNotaFiscalCidade());
		
		Thread.sleep(1000);
		WebElement  NotaFiscalCidadeClick=driver.findElement(By.xpath("//*[@id=\"invoiceDataContainer\"]/ul/li[3]/div/div[2]/div/div/div/ul/li/ul/li/a/span[5]"));
		NotaFiscalCidadeClick.click();
		
		Thread.sleep(1000);
		WebElement  NotaFiscalEndereco=driver.findElement(By.xpath("//*[@id=\"invoice-address-street-primaryPayment\"]"));
		NotaFiscalEndereco.click();
		NotaFiscalEndereco.sendKeys(nw.GetNotaFiscalEndereco());
		
		Thread.sleep(1000);
		WebElement  NotaFiscalNumero=driver.findElement(By.xpath("//*[@id=\"invoice-address-number-primaryPayment\"]"));
		NotaFiscalNumero.click();
		NotaFiscalNumero.sendKeys(nw.GetNotaFiscalNumero());
		
		Thread.sleep(1000);
		WebElement  NotaFiscalAndar=driver.findElement(By.xpath("//*[@id=\"invoice-address-floor-primaryPayment\"]"));
		NotaFiscalAndar.click();
		NotaFiscalAndar.sendKeys(nw.GetNotaFiscalAndar());
		
		Thread.sleep(1000);
		WebElement  NotaFiscalApto=driver.findElement(By.xpath("//*[@id=\"invoice-address-department-primaryPayment\"]"));
		NotaFiscalApto.click();
		NotaFiscalApto.sendKeys(nw.GetNotaFiscalApto());
		
		Thread.sleep(1000);
		WebElement  NotaFiscalCEP=driver.findElement(By.xpath("//*[@id=\"invoice-address-postalCode-primaryPayment\"]"));
		NotaFiscalCEP.click();
		NotaFiscalCEP.sendKeys(nw.GetNotaFiscalCEP());
		
		Thread.sleep(1000);
		WebElement  ContatoEmail=driver.findElement(By.xpath("//*[@id=\"contact-email\"]"));
		ContatoEmail.click();
		ContatoEmail.sendKeys(nw.GetContatoEmail());
		
		
		Thread.sleep(1000);
		WebElement  ContatoEmailConfirmacao=driver.findElement(By.xpath("//*[@id=\"contact-email-repeat\"]"));
		ContatoEmailConfirmacao.click();
		ContatoEmailConfirmacao.sendKeys(nw.GetContatoEmailConfirmacao());
		
		
		Thread.sleep(1000);
		WebElement  ContatoNumero=driver.findElement(By.xpath("//*[@id=\"traveler-phone-number-0\"]"));
		ContatoNumero.click();
		ContatoNumero.sendKeys(nw.GetContatoNumero());
	
		
		Thread.sleep(1000);
		WebElement  LiConcordo=driver.findElement(By.xpath("//*[@id=\"ux-common-checkoutchange-agreement-cb\"]"));
		LiConcordo.click();
		
		
		Thread.sleep(1000);
		WebElement  ConfirmaClick=driver.findElement(By.xpath("//*[@id=\"ux-common-checkout-verifying-button\"]"));
		ConfirmaClick.click();
		
		
		
	}
	
	
}