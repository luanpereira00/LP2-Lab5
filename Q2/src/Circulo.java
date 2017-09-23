import java.lang.Math;
import java.lang.Double;

public class Circulo extends Forma{
	private float raio;

	/**
	* Construtor parametrizado
	* @param raio O raio do circulo
	*/
	public Circulo(float raio){
		if(raio>0) this.raio=raio;
		else this.raio=0;
	}

	/**
	* Metodo de acesso para o raio
	* @return O raio
	*/
	public float getRaio(){
		return raio;
	}

	/**
	* Metodo de modificacao para o raio
	* @param raio O raio
	*/
	public void setRaio(float raio){
		if(raio>0){
			this.raio=raio;
		}
	}

	/**
	* Metodo de obtencao do diametro
	* @return O diametro
	*/
	public float getDiametro(){
		return 2*raio;
	}

	/**
	* Metodo para calcular o perimetro
	* @return O perimetro
	*/
	public float calcularPerimetro(){
		Double result = new Double(2*raio*Math.PI);
		return result.floatValue();
	}

	/**
	* Metodo para calcular a area
	* @return A area
	*/
	public float calcularArea(){
		Double result = new Double(Math.PI*Math.pow(raio, 2));
		return result.floatValue();
	}

	/**
	* Imprime de uma forma mais legivel
	*/
	public void print(){
		System.out.println("Circulo");
		System.out.println("Area: "+calcularArea());
		System.out.println("Perimetro: "+calcularPerimetro());
		System.out.println();
	}
}