import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Livro extends ProdutoDuravel{
	private String autor;
	private String genero;
	
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
	* @param autor O autor do livro
	* @param genero O genero do livro
	*/
	public Livro(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			String materialPredominante, String durabilidade, boolean avaria, String autor, String genero) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade, avaria);
		this.autor=autor;
		this.genero=genero;
	}
	
	/**
	* Metodo de acesso para autor
	* @return O autor
	*/
	public String getAutor() {
		return autor;
	}
	
	/**
	* Metodo de acesso para genero
	* @return O genero
	*/
	public String getGenero() {
		return genero;
	}
	
	/**
	* Metodo de modificacao para o autor
	* @param autor O novo autor
	*/
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	* Metodo de modificacao para o genero
	* @param genero O novo genero
	*/
	public void setGenero(String genero) {
		this.genero = genero;
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
		return false;
	}
	
	/**
	* Imprime de uma forma mais legivel
	*/
	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Autor: "+autor);
		System.out.println("Genero: "+genero);
		System.out.println("Marca: "+marca);
		System.out.println("Preco: "+preco);
		System.out.println("Descricacao: "+descricao);
	}
}