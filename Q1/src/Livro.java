import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Livro extends ProdutoDuravel{
	private String autor;
	private String genero;
	
	public Livro(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			String materialPredominante, String durabilidade, boolean avaria, String autor, String genero) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade, avaria);
		this.autor=autor;
		this.genero=genero;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean estaDisponivelParaVenda(){
		return !getAvaria();
	}

	public boolean ehEletroEletronico(){
		return false;
	}
	
	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Autor: "+autor);
		System.out.println("Genero: "+genero);
		System.out.println("Marca: "+marca);
		System.out.println("Preco: "+preco);
		System.out.println("Descricacao: "+descricao);
	}
}