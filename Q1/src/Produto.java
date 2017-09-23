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
	
	
	public Produto(){
		id=0;
		nome="";
		preco=0;
		marca="";
		descricao="";
		dataDeFabricacao = new GregorianCalendar();
		dataDeFabricacao.setTime(new Date());
	}
	
	public Produto(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao){
		this.id=id;
		this.nome=nome;
		this.preco=preco;
		this.marca=marca;
		this.descricao=descricao;
		this.dataDeFabricacao = new GregorianCalendar();
		this.dataDeFabricacao.setTime(dataDeFabricacao);
	}
	
	public int getID(){
		return id;
	}
	public String getNome(){
		return nome;
	}
	public double getPreco(){
		return preco;
	}
	public String getMarca(){
		return marca;
	}
	public String getDescricao(){
		return descricao;
	}
	public Calendar getDataDeFabricacao(){
		return dataDeFabricacao;
	}
	
	public void setID(int id){
		this.id=id;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setPreco(double preco){
		this.preco=preco;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public void setDescricao(String descricao){
		this.descricao=descricao;
	}
	public void setDataDeFabricacao(Calendar dataDeFabricacao){
		this.dataDeFabricacao=dataDeFabricacao;
	}
	
	public void print(){
		System.out.println("ID: "+id);
		System.out.println("Nome: "+nome);
		System.out.println("Preco: "+preco);
		System.out.println("Marca: "+marca);
		System.out.println("Descricacao: "+descricao);
		System.out.println("Data de fabricacao: "+dataDeFabricacao);
	}

	public abstract boolean estaDisponivelParaVenda();
}
