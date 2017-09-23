import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public abstract class Produto{
	protected int id;
	protected String nome;
	protected double preco;
	protected String marca;
	protected String descricao;
	protected Calendar dataDeFabricacao;
	
	/**
	* Construtor parametrizado
	* @param id O identificador do produto
	* @param nome O nome do produto
	* @param preco O preco do produto
	* @param marca A marca do produto
	* @param descricao Uma descricao do produto
	* @param dataDeFabricacao A data de fabricacao do produto
	*/
	public Produto(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao){
		this.id=id;
		this.nome=nome;
		this.preco=preco;
		this.marca=marca;
		this.descricao=descricao;
		this.dataDeFabricacao = new GregorianCalendar();
		this.dataDeFabricacao.setTime(dataDeFabricacao);
	}
	
	/**
	* Metodo de acesso para ID
	* @return O ID
	*/
	public int getID(){
		return id;
	}

	/**
	* Metodo de acesso para nome
	* @return O nome
	*/
	public String getNome(){
		return nome;
	}

	/**
	* Metodo de acesso para preco
	* @return O preco
	*/
	public double getPreco(){
		return preco;
	}

	/**
	* Metodo de acesso para a marca
	* @return A marca
	*/
	public String getMarca(){
		return marca;
	}

	/**
	* Metodo de acesso para a descricao
	* @return A descricao
	*/
	public String getDescricao(){
		return descricao;
	}

	/**
	* Metodo de acesso para a data de fabricacao
	* @return A data de fabricacao
	*/
	public Calendar getDataDeFabricacao(){
		return dataDeFabricacao;
	}
	
	/**
	* Metodo de modificacao para o id
	* @param id O novo id
	*/
	public void setID(int id){
		this.id=id;
	}

	/**
	* Metodo de modificacao para o nome
	* @param nome O novo nome
	*/
	public void setNome(String nome){
		this.nome=nome;
	}

	/**
	* Metodo de modificacao para o preco
	* @param preco O novo preco
	*/
	public void setPreco(double preco){
		this.preco=preco;
	}

	/**
	* Metodo de modificacao para o marca
	* @param marca A nova marca
	*/
	public void setMarca(String marca){
		this.marca=marca;
	}

	/**
	* Metodo de modificacao para o descricao
	* @param descricao A nova descricao
	*/
	public void setDescricao(String descricao){
		this.descricao=descricao;
	}

	/**
	* Metodo de modificacao para o data de fabricacao
	* @param dataDeFabricacao A nova data de fabricacao
	*/
	public void setDataDeFabricacao(Calendar dataDeFabricacao){
		this.dataDeFabricacao=dataDeFabricacao;
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
	}

	/**
	* Indica se o produto esta disponivel para venda
	* @return True, se estiver disponivel; False, se não estiver disponivel
	*/
	public abstract boolean estaDisponivelParaVenda();
}
