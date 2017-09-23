import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public abstract class ProdutoNaoDuravel extends Produto{
	protected Calendar dataDeValidade;
	protected Genero genero;
	
	/**
	* Construtor parametrizado
	* @param id O identificador do produto
	* @param nome O nome do produto
	* @param preco O preco do produto
	* @param marca A marca do produto
	* @param descricao Uma descricao do produto
	* @param dataDeFabricacao A data de fabricacao do produto
	* @param dataDeValidade A data de validade do produto
	* @param genero O genero do produto (alimenticio, roupa, etc.)
	*/
	public ProdutoNaoDuravel(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao, Date dataDeValidade, Genero genero){
		super(id, nome, preco, marca, descricao, dataDeFabricacao);
		this.dataDeValidade = new GregorianCalendar();
		this.dataDeValidade.setTime(dataDeValidade);
		this.genero=genero;
	}
	
	/**
	* Metodo de modificacao para a data de validade
	* @param dataDeValidade A nova data de validade
	*/
	public void setDataDeValidade(Date dataDeValidade){
		this.dataDeValidade.setTime(dataDeValidade);
	}
	
	/**
	* Metodo de modificacao para o genero
	* @param genero O novo genero
	*/
	public void setGenero(Genero genero){
		this.genero=genero;
	}
	
	/**
	* Metodo de acesso para a data de validade
	* @return A data de validade
	*/
	public Calendar getDataDeValidade(){
		return dataDeValidade;
	}
	
	/**
	* Metodo de acesso para genero
	* @return O genero
	*/
	public Genero setGenero(){
		return genero;
	}
	
	/**
	* Imprime de uma forma mais legivel
	*/
	public void print(){
		System.out.println("ID: "+id);
		System.out.println("Nome: "+nome);
		System.out.println("Preco: "+preco);
		System.out.println("Marca: "+marca);
		System.out.println("Descricacao: "+descricao);
		System.out.println("Data de fabricacao: "+dataDeFabricacao);
		System.out.println("Data de validade: "+dataDeValidade);
		System.out.println("Genero: "+genero);
	}

	/**
	* Indica se o produto dentro do prazo de validade
	* @return True, se estiver no prazo; False, se não estiver
	*/
	public abstract boolean estaNaValidade(Date dataDeHoje);
}
