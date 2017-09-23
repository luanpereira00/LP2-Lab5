import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Celular extends ProdutoDuravel{
	private float tamanhoDaTela;
	private String sistemaOperacional;

	/**
	* Construtor parametrizado
	* @param id O identificador do produto
	* @param nome O nome do produto
	* @param preco O preco do produto
	* @param marca A marca do produto
	* @param descricao Uma descricao do produto
	* @param dataDeFabricacao A data de fabricacao do produto
	* @param materialPredominante O material que predomina na construcao do produto
	* @param durabilidade A durabilidade esperada
	* @param avaria Uma flag para indicar se o produto esta com avarias
	* @param tamanhoDaTela O tamanho da tela
	* @param sistemaOperacional O SO que roda no celular
	*/
	public Celular(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			String materialPredominante, String durabilidade, boolean avaria, float tamanhoDaTela, String sistemaOperacional) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade, avaria);
		this.tamanhoDaTela=tamanhoDaTela;
		this.sistemaOperacional=sistemaOperacional;
	}
	
	/**
	* Metodo de acesso para tamanho da tela
	* @return O tamanho da tela
	*/
	public float getTamanhoDaTela() {
		return tamanhoDaTela;
	}
	
	/**
	* Metodo de acesso para sistema operacional
	* @return O sistema operacional
	*/
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	
	/**
	* Metodo de modificacao para o tamanho da tela
	* @param tamanhoDaTela O novo tamanho da tela
	*/
	public void setTamanhoDaTela(float tamanhoDaTela) {
		this.tamanhoDaTela = tamanhoDaTela;
	}
	
	/**
	* Metodo de modificacao para o sistema operacional
	* @param sistemaOperacional O novo sistema operacional
	*/
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	/**
	* Indica se o produto esta disponivel para venda
	* @return True, se estiver disponivel; False, se não estiver disponivel
	*/
	public boolean estaDisponivelParaVenda(){
		return !getAvaria();
	}

	/**
	* Indica se o produto eh um eletro-eletronico
	* @return True, se for eletro-eletronico; False, se não
	*/
	public boolean ehEletroEletronico(){
		return true;
	}
	
	/**
	* Imprime de uma forma mais legivel
	*/
	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Marca: "+marca);
		System.out.println("Tela: "+tamanhoDaTela);
		System.out.println("SO: "+sistemaOperacional);
		System.out.println("Preco: "+preco);
		System.out.println("Descricacao: "+descricao);
	}
	
}