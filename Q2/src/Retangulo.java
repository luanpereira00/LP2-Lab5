public class Retangulo extends Forma {
	private float base;
	private float altura;

	/**
	* Construtor parametrizado
	* @param base A base do retangulo
	* @param altura A altura do retangulo
	*/
	Retangulo(float base, float altura){
		if(base>0){
			this.base = base;
		} else {
			this.base = 0;
		}
		if(altura>0){
			this.altura = altura;
		} else {
			this.altura = altura;
		}
	}

	/**
	* Metodo de acesso a base
	* @return A base
	*/
	public float getBase(){
		return base;
	}

	/**
	* Metodo de acesso a altura
	* @return A altura
	*/
	public float getAltura(){
		return altura;
	}

	/**
	* Metodo de modificacao da altura
	* @param altura A nova altura
	*/
	public void setAltura(float altura){
		if(altura>0){
			this.altura = altura;
		}
	}

	/**
	* Metodo de modificacao da base
	* @param base A nova base
	*/
	public void setBase(float base){
		if(base>0){
			this.base = base;
		}
	}

	/**
	* Metodo para calcular o perimetro
	* @return O perimetro
	*/
	public float calcularPerimetro(){
		return (base*2 + altura*2);
	}

	/**
	* Metodo para calcular a area
	* @return A area
	*/
	public float calcularArea(){
		return base*altura;
	}

	/**
	* Imprime de uma forma mais legivel
	*/
	public void print(){
		System.out.println("Retangulo");
		System.out.println("Area: "+calcularArea());
		System.out.println("Perimetro: "+calcularPerimetro());
		System.out.println();
	}
}