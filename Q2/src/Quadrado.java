public class Quadrado extends Retangulo{
	
	/**
	* Construtor parametrizado
	* @param lado O lado do quadrado
	*/
	Quadrado(float lado){
		super(lado, lado);
	}

	/**
	* Imprime de uma forma mais legivel
	*/
	public void print(){
		System.out.println("Quadrado");
		System.out.println("Area: "+calcularArea());
		System.out.println("Perimetro: "+calcularPerimetro());
		System.out.println();
	}
}