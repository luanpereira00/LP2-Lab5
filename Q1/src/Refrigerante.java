import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Refrigerante extends ProdutoNaoDuravel{
	private int mililitros;
	private String tipoDeRecipiente;
	
	public Refrigerante(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			Date dataDeValidade, Genero genero, int mililitros, String tipoDeRecipiente) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.mililitros=mililitros;
		this.tipoDeRecipiente=tipoDeRecipiente;
	}
	
	public int getMililitros() {
		return mililitros;
	}
	
	public String getTipoDeRecipiente() {
		return tipoDeRecipiente;
	}
	
	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}
	
	public void setTipoDeRecipiente(String tipoDeRecipiente) {
		this.tipoDeRecipiente = tipoDeRecipiente;
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
		System.out.println("Mililitros: "+mililitros);
		System.out.println("Tipo do recipiente: "+tipoDeRecipiente);
		System.out.println("Descricacao: "+descricao);
	}
	
}