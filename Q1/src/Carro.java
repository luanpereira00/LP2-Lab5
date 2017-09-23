import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Carro extends ProdutoDuravel{
	private String modelo;
	private float potenciaDoMotor;
	
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
	* @param modelo O modelo do carro
	* @param potenciaDoMotor A potencia do motor do carro
	*/
	public Carro(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			String materialPredominante, String durabilidade, boolean avaria, String modelo, float potenciaDoMotor) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade, avaria);
		this.modelo=modelo;
		this.potenciaDoMotor=potenciaDoMotor;
	}

	/**
	* Metodo de acesso para modelo
	* @return O modelo
	*/
	public String getModelo() {
		return modelo;
	}

	/**
	* Metodo de acesso para a potencia do motor
	* @return A potencia do motor
	*/
	public float getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	/**
	* Metodo de modificacao para o modelo
	* @param modelo O novo modelo
	*/
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	* Metodo de modificacao para a potencia do motor
	* @param potenciaDoMotor A nova potencia
	*/
	public void setPotenciaDoMotor(float potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}
	
	/**
	* Indica se o produto esta disponivel para venda
	* @return True, se estiver disponivel; False, se não estiver disponivel
	*/
	public boolean estaDisponivelParaVenda(){
		return !getAvaria();
	}

	/**
	* Indica se o produto eh um eletro-eletronico
	* @return True, se for eletro-eletronico; False, se não
	*/
	public boolean ehEletroEletronico(){
		return false;
	}


	/**
	* Imprime o carro de uma forma mais legivel
	*/
	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Potencia: "+potenciaDoMotor);
		System.out.println("Preco: "+preco);
		System.out.println("Descricacao: "+descricao);
	}
}