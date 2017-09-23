import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public abstract class ProdutoNaoDuravel extends Produto{
	protected Calendar dataDeValidade;
	protected Genero genero;
	
	public ProdutoNaoDuravel(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao, Date dataDeValidade, Genero genero){
		super(id, nome, preco, marca, descricao, dataDeFabricacao);
		this.dataDeValidade = new GregorianCalendar();
		this.dataDeValidade.setTime(dataDeValidade);
		this.genero=genero;
	}
	public ProdutoNaoDuravel(){
		super();
		this.dataDeValidade = new GregorianCalendar();
		this.dataDeValidade.setTime(new Date());
		genero=Genero.DESCONHECIDO;
	}
	
	public void setDataDeValidade(Date dataDeValidade){
		this.dataDeValidade.setTime(dataDeValidade);
	}
	
	public void setGenero(Genero genero){
		this.genero=genero;
	}
	
	public Calendar getDataDeValidade(){
		return dataDeValidade;
	}
	
	public Genero setGenero(){
		return genero;
	}
	
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

	public abstract boolean estaNaValidade(Date dataDeHoje);
}
