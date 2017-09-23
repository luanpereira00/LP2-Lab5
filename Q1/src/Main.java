import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Deposito deposito = new Deposito();
		deposito.addProduto(new Pizza(1, "Pizza a moda da casa", 20, "Pizza Hut", "Pizza com ingredientes secretos da casa", 
				new Date(), new Date(), Genero.ALIMENTICIO, "A moda da casa", "Media"));
		deposito.addProduto(new Chocolate(2, "Chocolate Nestle", 20, "Nestle", "Sabor que da gosto", 
				new Date(), new Date(), Genero.ALIMENTICIO, "Tablete", "Meio-amargo"));
		deposito.addProduto(new Celular(3, "Samsung Galaxy", 800.0, "Samsung", "Quad-core", 
				new Date(), "Plastico", "2 anos", false ,4.3f, "Android"));
		deposito.addProduto(new Refrigerante(4, "Dollynho", 2.8, "Dolly", "Sou dollynho, seu amiguinho", 
				new Date(), new Date(), Genero.ALIMENTICIO, 300, "Garrafa plastica"));
		deposito.addProduto(new Carro(5, "Fusca azul", 5000, "Fusca", "Fusca pra causar guerra na porta das escolas", 
				new Date(), "Ferrugem", "2 anos", true, "Fusca", 1.0f));
		deposito.addProduto(new Livro(6, "O Sol", 19.99, "Atica", "Livro que tem o sol denhado na capa", new Date(),
				"Papel", "Eterno", false, "O autor do sol", "Desenho"));
		deposito.printList();	
	}
}