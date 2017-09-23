import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Celular extends ProdutoDuravel{
	private float tamanhoDaTela;
	private String sistemaOperacional;

	public Celular(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			String materialPredominante, String durabilidade, boolean avaria, float tamanhoDaTela, String sistemaOperacional) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade, avaria);
		this.tamanhoDaTela=tamanhoDaTela;
		this.sistemaOperacional=sistemaOperacional;
	}
	
	public float getTamanhoDaTela() {
		return tamanhoDaTela;
	}
	
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	
	public void setTamanhoDaTela(float tamanhoDaTela) {
		this.tamanhoDaTela = tamanhoDaTela;
	}
	
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public boolean estaDisponivelParaVenda(){
		return !getAvaria();
	}

	public boolean ehEletroEletronico(){
		return true;
	}
	
	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Marca: "+marca);
		System.out.println("Tela: "+tamanhoDaTela);
		System.out.println("SO: "+sistemaOperacional);
		System.out.println("Preco: "+preco);
		System.out.println("Descricacao: "+descricao);
	}
	
}