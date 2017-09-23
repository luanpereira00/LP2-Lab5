public class Retangulo extends Forma {
	private float base;
	private float altura;

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

	public float getBase(){
		return base;
	}
	public float getAltura(){
		return altura;
	}
	public void setAltura(float altura){
		if(altura>0){
			this.altura = altura;
		}
	}
	public void setBase(float base){
		if(base>0){
			this.base = base;
		}
	}

	public float calcularPerimetro(){
		return (base*2 + altura*2);
	}

	public float calcularArea(){
		return base*altura;
	}

	public void print(){
		System.out.println("Retangulo");
		System.out.println("Area: "+calcularArea());
		System.out.println("Perimetro: "+calcularPerimetro());
		System.out.println();
	}
}