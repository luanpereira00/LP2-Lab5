import java.util.Random;


public class Main {

	public static void main(String[] args) {
		RepositorioFormas repo = new RepositorioFormas();

		Random r = new Random();
		int quantidade = r.nextInt(20)+1;
	
		for(int i=0; i<quantidade; i++){
			switch(r.nextInt(3)+1){
				case 1:
					repo.add(new Retangulo(r.nextInt(10)+1, r.nextInt(10)+1));
				break;
				case 2:
					repo.add(new Circulo(r.nextInt(10)+1));
				break;
				case 3:
					repo.add(new Quadrado(r.nextInt(10)+1));
				break;
			}
		}

		repo.print();

	}
}