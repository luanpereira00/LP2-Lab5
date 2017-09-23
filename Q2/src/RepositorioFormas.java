import java.util.ArrayList;

public class RepositorioFormas{
	private ArrayList<Forma> listaDeFormas;

	/**
	* Construtor padrao
	*/
	public RepositorioFormas(){
		listaDeFormas = new ArrayList<Forma>();
	}

	/**
	* Metodo que adiciona formas ao repositorio
	* @param f A forma que ser adicionada
	*/
	public void add(Forma f){
		listaDeFormas.add(f);
	}

	/**
	* Imprime toda a lista de formas
	*/
	public void print(){
		for(Forma f : listaDeFormas){
			f.print();
		}
	}
}