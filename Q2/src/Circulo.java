import java.lang.Math;
import java.lang.Double;

public class Circulo extends Forma{
	private float raio;


	public Circulo(float raio){
		if(raio>0) this.raio=raio;
		else this.raio=0;
	}

	public float getRaio(){
		return raio;
	}
	public void setRaio(float raio){
		if(raio>0){
			this.raio=raio;
		}
	}

	public float getDiametro(){
		return 2*raio;
	}

	public float calcularPerimetro(){
		Double result = new Double(2*raio*Math.PI);
		return result.floatValue();
	}

	public float calcularArea(){
		Double result = new Double(Math.PI*Math.pow(raio, 2));
		return result.floatValue();
	}

	public void print(){
		System.out.println("Circulo");
		System.out.println("Area: "+calcularArea());
		System.out.println("Perimetro: "+calcularPerimetro());
		System.out.println();
	}
}