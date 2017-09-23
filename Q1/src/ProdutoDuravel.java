import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public abstract class ProdutoDuravel extends Produto{
	protected String materialPredominante;
	protected String durabilidade;
	protected boolean avaria;
	
	/**
	* Construtor parametrizado
	* @param id O identificador do produto
	* @param nome O nome do produto
	* @param preco O preco do produto
	* @param marca A marca do produto
	* @param descricao Uma descricao do produto
	* @param dataDeFabricacao A data de fabricacao do produto
	* @param materialPredominante O material que predomina na construcao do produto
	* @param durabilidade A durabilidade esperada
	* @param avaria Uma flag para indicar se o produto esta com avarias
	*/
	public ProdutoDuravel(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao, String materialPredominante, String durabilidade, boolean avaria){
		super(id, nome, preco, marca, descricao, dataDeFabricacao);
		this.materialPredominante=materialPredominante;
		this.durabilidade=durabilidade;
		this.avaria=avaria;
	}
	
	/**
	* Metodo de acesso para material predominante
	* @return O material predominante
	*/
	public String getMaterialPredominante(){
		return materialPredominante;
	}

	/**
	* Metodo de acesso para a durabilidade
	* @return A durabilidade
	*/
	public String getDurabilidade(){
		return durabilidade;
	}

	/**
	* Metodo de acesso para a flag de avaria
	* @return A flag de avaria
	*/
	public boolean getAvaria(){
		return avaria;
	}

	/**
	* Metodo de modificacao para o material predominante
	* @param materialPredominante O novo material predominante
	*/
	public void setMaterialPredominante(String materialPredominante){
		this.materialPredominante=materialPredominante;
	}

	/**
	* Metodo de modificacao para a durabilidade
	* @param durabilidade A nova durabilidade
	*/
	public void setDurabilidade(String durabilidade){
		this.durabilidade=durabilidade;
	}

	/**
	* Metodo de modificacao para a flag de avaria
	* @param avaria A nova flag de avaria
	*/
	public void setAvaria(boolean avaria){
		this.avaria=avaria;
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
		System.out.println("Material Predominante: "+materialPredominante);
		System.out.println("Durabilidade: "+durabilidade);
		System.out.println("Avaria: "+avaria);	
	}

	/**
	* Indica se o produto eh um eletro-eletronico
	* @return True, se for eletro-eletronico; False, se não
	*/
	public abstract boolean ehEletroEletronico();
}
