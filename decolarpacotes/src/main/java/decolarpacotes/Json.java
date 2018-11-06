package decolarpacotes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	
	private static final String PagamentoParcelas1 = null;
	private String OrigemViagem;public String GetOrigemViagem() {return OrigemViagem;}
	private String DestinoViagem;public String GetDestinoViagem() {return DestinoViagem;}
	
	
	
	
	    //https://www.decolar.com/trips/book/checkout/64784248b170f0f12b478f81
		//campo adulto1 Primeiro Nome
	    private String Adulto1PrimeiroNome;public String GetAdulto1PrimeiroNome() {return Adulto1PrimeiroNome;}
	    
	    //campo adulto1 ultimo Nome
	    private String Adulto1UltimoNome; public String GetAdulto1UltimoNome() {return Adulto1UltimoNome;}
	    
	    //campo cpf
	    private String Adulto1CPF; public String GetAdulto1CPF() {return Adulto1CPF;}
	    
	    // campo adulto 2 primeiro nome
	    private String Adulto2PrimeiroNome;public String GetAdulto2PrimeiroNome() {return Adulto2PrimeiroNome;}
	    
	    // campo adulto 2 primeiro nome
	    private String Adulto2UltimoNome;  public String GetAdulto2UltimoNome() {return Adulto2UltimoNome;}
	    
	    // campo adulto 2 cpf
	    private String Adulto2CPF;public String GetAdulto2CPF() {return Adulto2CPF;}
	    
	    //-----------------------------------------------------------------------------
	    
	    // campo condutor nome
	    private String CondutorNome;public String GetCondutorNome() {return CondutorNome;}
	    
	    //campo condutor  ultimo sobrenome
	    private String CondutorUltimoSobrenome;public String GetCondutorUltimoSobrenome() {return CondutorUltimoSobrenome;}
	    
	    //campo condutor idade
	    private String CondutorIdade;public String GetCondutorIdade() {return CondutorIdade;}
	    
	     //-----------------------------------------------------------------------------
	    
	    
	    
	    // campos pagamento  Visa
	    
	    //campo tipo cartão parcelas
	    private String PagamentoParcelas;public String GetPagamentoParcelas() {return PagamentoParcelas;}
	    
	    //campo parcelas
	    private String Pagamento01Parcelas;public String GetPagamento01Parcelas() {return Pagamento01Parcelas;}
	    
	    // campo numero do cartao
	    private String PagamentoNumCartao;public String GetPagamentoNumCartao() {return PagamentoNumCartao;}
	    
	     // campo mes de validade do cartao
	    private String PagamentoMesValidadeCartao;public String GetPagamentoMesValidadeCartao() {return PagamentoMesValidadeCartao;}
	    
	    // campo ano de validade do cartao
	    private String PagamentoAnoValidadeCartao;public String GetPagamentoAnoValidadeCartao() {return PagamentoAnoValidadeCartao;}
	    
	    // campo codigo de seguranca
	    private String PagamentoCartaoCod;public String GetPagamentoCartaoCod() {return PagamentoCartaoCod;} 
	    
	    
	   
	    //campo nome do titular do cartao
	    private String PagamentoTitCartao;public String GetPagamentoTitCartao() {return PagamentoTitCartao;} 
	    
	    
	    // campo cpf do titular do cartao
	     private String PagamentoCpfCartao;public String GetPagamentoCpfCartao() {return PagamentoCpfCartao;}
	
	       
	     
	     private String  CartaoTitularPais ;public String GetCartaoTitularPais() {return CartaoTitularPais;}
	     
	     private String CartaoTitularEstado;public String GetCartaoTitularEstado() {return CartaoTitularEstado;}
	     
	     private String  CartaoTitularCidade;public String GetCartaoTitularCidade() {return CartaoTitularCidade;}
	     
	     private String  CartaoTitularCEP;public String GetCartaoTitularCEP() {return CartaoTitularCEP;}
	     private String  CartaoTitularEndereco;public String GetCartaoTitularEndereco() {return CartaoTitularEndereco;}
	     private String  CartaoTitularEnderecoNumero;public String GetCartaoTitularEnderecoNumero() {return CartaoTitularEnderecoNumero;}
	     private String  NotaFiscalEstado;public String GetNotaFiscalEstado() {return NotaFiscalEstado;}
	     
	     private String  NotaFiscalCidade;public String GetNotaFiscalCidade() {return NotaFiscalCidade;}
	     
	     private String  NotaFiscalEndereco;public String GetNotaFiscalEndereco() {return NotaFiscalEndereco;}
	     
	     private String  NotaFiscalNumero;public String GetNotaFiscalNumero() {return NotaFiscalNumero;}
	     
	     private String  NotaFiscalAndar;public String GetNotaFiscalAndar() {return NotaFiscalAndar;}
	     
	     private String  NotaFiscalApto;public String GetNotaFiscalApto() {return NotaFiscalApto;}
	     
	     private String  NotaFiscalCEP;public String GetNotaFiscalCEP() {return NotaFiscalCEP;}
	     
	     private String  ContatoEmail;public String GetContatoEmail() {return ContatoEmail;}
	     
	     private String  ContatoEmailConfirmacao;public String GetContatoEmailConfirmacao() {return ContatoEmailConfirmacao;}
	     
	     private String  ContatoNumero;public String GetContatoNumero() {return ContatoNumero;}
	   

	     
	     
	     
	     
	       
	       
	public Json(String nameJson) throws IOException, ParseException
	{
	        LerJson(nameJson);
	}
	
	public void LerJson(String nameJson) throws IOException, ParseException 
	{
	   JSONParser parser=new JSONParser();
	   
	   try 
	   {
		   
		   Object obj=parser.parse(new FileReader("/Users/llobo/workspace/decolarpacotes/src/main/java/decolarpacotes/dados.json"));
		   JSONObject jsonObject= (JSONObject) obj;
		   
		    OrigemViagem= (String) jsonObject.get("origem");
		    DestinoViagem=(String) jsonObject.get("destino");
		    
		    Adulto1PrimeiroNome=(String)jsonObject.get("Adulto1PrimeiroNome");
		    Adulto1UltimoNome=(String)jsonObject.get("Adulto1UltimoNome");	
		    Adulto1CPF=(String)jsonObject.get("Adulto1CPF");
		    
		    
		    Adulto2PrimeiroNome=(String) jsonObject.get("Adulto2PrimeiroNome");
		    Adulto2UltimoNome=(String)jsonObject.get("Adulto2UltimoNome");	
		    Adulto2CPF=(String)jsonObject.get("Adulto2CPF");
            
		    
		    CondutorNome= (String)   jsonObject.get("CondutorNome");
		    CondutorUltimoSobrenome=(String)jsonObject.get("CondutorUltimoSobrenome");
		    
		    CondutorIdade=(String)jsonObject.get("CondutorIdade");
		    
		    PagamentoParcelas=(String)jsonObject.get("PagamentoParcelas");

		    Pagamento01Parcelas=(String)jsonObject.get("Pagamento01Parcelas");
		    
		    PagamentoNumCartao=(String)jsonObject.get("PagamentoNumCartao");
		    
		    PagamentoMesValidadeCartao = (String)jsonObject.get("PagamentoMesValidadeCartao");
		    
		    PagamentoAnoValidadeCartao=(String)jsonObject.get("PagamentoAnoValidadeCartao");
	        
		    PagamentoCartaoCod=(String)jsonObject.get("PagamentoCartaoCod");
		    
		    PagamentoTitCartao=(String)jsonObject.get("PagamentoTitCartao");
		    
		    PagamentoCpfCartao=(String)jsonObject.get("PagamentoCpfCartao");
		    
		    CartaoTitularPais=(String)jsonObject.get("CartaoTitularPais");
		    
		    CartaoTitularEstado=(String)jsonObject.get("CartaoTitularEstado");
	     
		    CartaoTitularCidade=(String)jsonObject.get("CartaoTitularCidade");
		    CartaoTitularCEP=(String)jsonObject.get("CartaoTitularCEP");
	       
		    CartaoTitularEndereco=(String)jsonObject.get("CartaoTitularEndereco");
		    
		    CartaoTitularEnderecoNumero=(String)jsonObject.get("CartaoTitularEnderecoNumero");
		    
		    NotaFiscalEstado=(String)jsonObject.get("NotaFiscalEstado");
		    NotaFiscalCidade=(String)jsonObject.get("NotaFiscalCidade");
		    NotaFiscalEndereco=(String)jsonObject.get("NotaFiscalEndereco");
		    NotaFiscalNumero=(String)jsonObject.get("NotaFiscalNumero");
		    NotaFiscalAndar=(String)jsonObject.get("NotaFiscalAndar");
		    NotaFiscalApto=(String)jsonObject.get("NotaFiscalApto");
		    NotaFiscalCEP=(String)jsonObject.get("NotaFiscalCEP");
		    ContatoEmail=(String)jsonObject.get("ContatoEmail");
		    ContatoEmailConfirmacao=(String)jsonObject.get("ContatoEmailConfirmacao");
		    ContatoNumero=(String)jsonObject.get("ContatoNumero");
		    
		    
		    
	   
	   }
	   
	   
	   
	   catch(FileNotFoundException e)
	   {
          e.printStackTrace();		   
	   }
	   
	   
	}
		
	

}
