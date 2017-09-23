import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Chocolate extends ProdutoNaoDuravel{
	private String formato;
	private String sabor;
	
	/**
	* Construtor parametrizado
	* @param id O identificador do produto
	* @param nome O nome do produto
	* @param preco O preco do produto
	* @param marca A marca do produto
	* @param descricao Uma descricao do produto
	* @param dataDeFabricacao A data de fabricacao do produto
	* @param dataDeValidade A data de validade do produto
	* @param genero O genero do produto (alimenticio, roupa, etc.)
	* @param formato O formato
	* @param sabor O sabor
	*/
	public Chocolate(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			Date dataDeValidade, Genero genero, String formato, String sabor) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.formato=formato;
		this.sabor=sabor;
	}
	
	/**
	* Metodo de acesso para formato
	* @return O formato
	*/
	public String getFormato() {
		return formato;
	}
	
	/**
	* Metodo de acesso para sabor
	* @return O sabor
	*/
	public String getSabor() {
		return sabor;
	}
	
	/**
	* Metodo de modificacao para o formato
	* @param formato O novo formato
	*/
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	/**
	* Metodo de modificacao para o sabor
	* @param sabor O novo sabor
	*/
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	/**
	* Indica se o produto esta disponivel para venda
	* @return True, se estiver disponivel; False, se não estiver disponivel
	*/
	public boolean estaDisponivelParaVenda(){
		return estaNaValidade(new Date());
	}

	/**
	* Indica se o produto dentro do prazo de validade
	* @return True, se estiver no prazo; False, se não estiver
	*/
	public boolean estaNaValidade(Date dataDeHoje){
		Calendar d = new GregorianCalendar();
		d.setTime(dataDeHoje);
		if(getDataDeValidade().compareTo(d)<=0) return true;
		else return false;
	}

	/**
	* Imprime de uma forma mais legivel
	*/
	public void print(){
		System.out.println("Nome: "+nome);
		System.out.println("Preco: "+preco);
		System.out.println("Sabor: "+sabor);
		System.out.println("Formato: "+formato);
		System.out.println("Descricacao: "+descricao);
	}
	
}