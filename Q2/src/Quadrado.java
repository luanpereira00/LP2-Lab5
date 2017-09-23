public class Quadrado extends Retangulo{
	Quadrado(float lado){
		super(lado, lado);
	}

	public void print(){
		System.out.println("Quadrado");
		System.out.println("Area: "+calcularArea());
		System.out.println("Perimetro: "+calcularPerimetro());
		System.out.println();
	}
}