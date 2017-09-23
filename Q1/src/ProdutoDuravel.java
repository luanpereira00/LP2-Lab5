import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public abstract class ProdutoDuravel extends Produto{
	protected String materialPredominante;
	protected String durabilidade;
	protected String avaria;
	
	public ProdutoDuravel(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao, String materialPredominante, String durabilidade, String avaria){
		super(id, nome, preco, marca, descricao, dataDeFabricacao);
		this.materialPredominante=materialPredominante;
		this.durabilidade=durabilidade;
		this.avaria=avaria;
	}
	public ProdutoDuravel(){
		super();
		materialPredominante="";
		durabilidade="";
	}
	
	public String getMaterialPredominante(){
		return materialPredominante;
	}
	public String getDurabilidade(){
		return durabilidade;
	}
	public String getAvaria(){
		return avaria;
	}

	public void setMaterialPredominante(String materialPredominante){
		this.materialPredominante=materialPredominante;
	}
	public void setDurabilidade(String durabilidade){
		this.durabilidade=durabilidade;
	}
	public void setAvaria(String avaria){
		this.avaria=avaria;
	}
	

	public void print(){
		System.out.println("ID: "+id);
		System.out.println("Nome: "+nome);
		System.out.println("Preco: "+preco);
		System.out.println("Marca: "+marca);
		System.out.println("Descricacao: "+descricao);
		System.out.println("Data de fabricacao: "+dataDeFabricacao);
		System.out.println("Material Predominante: "+materialPredominante);
		System.out.println("Durabilidade: "+durabilidade);
		System.out.println("Avaria: "+avaria);	
	}

	public abstract boolean ehEletroEletronico();
}
