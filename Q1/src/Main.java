import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Deposito deposito = new Deposito();
		deposito.addProduto(new Pizza(1, "Pizza a moda da casa", 20, "Pizza Hut", "Pizza com ingredientes secretos da casa", new Date(), new Date(), Genero.ALIMENTICIO, "A moda da casa", "Media"));
		deposito.addProduto(new Celular(2, "Samsung Galaxy", 800.0, "Samsung", "Quad-core", new Date(), "Plastico", "2 anos", "Bom estado",4.3f, "Android"));
		deposito.printList();	
	}
}