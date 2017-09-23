import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Carro extends ProdutoDuravel{
	private String modelo;
	private float potenciaDoMotor;
	
	public Carro() {
		super();
		modelo="";
		potenciaDoMotor=0;
	}
	
	public Carro(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			String materialPredominante, String durabilidade, String avaria, String modelo, float potenciaDoMotor) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, materialPredominante, durabilidade, avaria);
		this.modelo=modelo;
		this.potenciaDoMotor=potenciaDoMotor;
	}

	public String getModelo() {
		return modelo;
	}

	public float getPotenciaDoMotor() {
		return potenciaDoMotor;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPotenciaDoMotor(float potenciaDoMotor) {
		this.potenciaDoMotor = potenciaDoMotor;
	}
	
	public boolean estaDisponivelParaVenda(){
		return true;
	}

	public boolean ehEletroEletronico(){
		return false;
	}

	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Potencia: "+potenciaDoMotor);
		System.out.println("Preco: "+preco);
		System.out.println("Descricacao: "+descricao);
	}
}