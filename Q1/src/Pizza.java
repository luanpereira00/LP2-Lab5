import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Pizza extends ProdutoNaoDuravel{
	private String sabor;
	private String tamanho;
	
	public Pizza() {
		super();
		sabor="";
		tamanho="";
	}
	
	public Pizza(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			Date dataDeValidade, Genero genero, String sabor, String tamanho) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.sabor=sabor;
		this.tamanho=tamanho;
	}

	
	public String getSabor() {
		return sabor;
	}
	public String getTamanho() {
		return tamanho;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean estaDisponivelParaVenda(){
		return true;
	}

	public boolean estaNaValidade(Date dataDeHoje){
		Calendar d = new GregorianCalendar();
		d.setTime(dataDeHoje);
		if(getDataDeValidade().compareTo(d)<=0) return true;
		else return false;
	}

	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Preco: "+preco);
		System.out.println("Sabor: "+sabor);
		System.out.println("Tamanho: "+tamanho);
		System.out.println("Descricacao: "+descricao);
	}
	
}