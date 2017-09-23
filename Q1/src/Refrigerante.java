import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Refrigerante extends ProdutoNaoDuravel{
	private int mililitros;
	private String tipoDeRecipiente;
	
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
	* @param mililitros A quantidade em mililitros do refrigerante
	* @param tipoDeRecipiente O tipo de material do recipiente
	*/
	public Refrigerante(int id, String nome, double preco, String marca, String descricao, Date dataDeFabricacao,
			Date dataDeValidade, Genero genero, int mililitros, String tipoDeRecipiente) {
		super(id, nome, preco, marca, descricao, dataDeFabricacao, dataDeValidade, genero);
		this.mililitros=mililitros;
		this.tipoDeRecipiente=tipoDeRecipiente;
	}
	
	/**
	* Metodo de acesso para os mililitros
	* @return Os mililitros
	*/
	public int getMililitros() {
		return mililitros;
	}
	
	/**
	* Metodo de acesso para tipo de recipiente
	* @return O tipo de recipiente
	*/
	public String getTipoDeRecipiente() {
		return tipoDeRecipiente;
	}
	
	/**
	* Metodo de modificacao para o mililitros
	* @param mililitros O novo mililitros
	*/
	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}
	
	/**
	* Metodo de modificacao para o tipo de recipiente
	* @param tipoDeRecipiente O novo tipo de recipiente
	*/
	public void setTipoDeRecipiente(String tipoDeRecipiente) {
		this.tipoDeRecipiente = tipoDeRecipiente;
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
		System.out.println("Mililitros: "+mililitros);
		System.out.println("Tipo do recipiente: "+tipoDeRecipiente);
		System.out.println("Descricacao: "+descricao);
	}
	
}