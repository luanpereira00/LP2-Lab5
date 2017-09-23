import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Chocolate extends ProdutoNaoDuravel{
	private String formato;
	private String sabor;
	
	public Chocolate(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			Date dataDeValidade, Genero genero, String formato, String sabor) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.formato=formato;
		this.sabor=sabor;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public String getSabor() {
		return sabor;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public boolean estaDisponivelParaVenda(){
		return estaNaValidade(new Date());
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
		System.out.println("Formato: "+formato);
		System.out.println("Descricacao: "+descricao);
	}
	
}