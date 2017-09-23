import java.util.ArrayList;

public class RepositorioFormas{
	private ArrayList<Forma> listaDeFormas;

	public RepositorioFormas(){
		listaDeFormas = new ArrayList<Forma>();
	}

	public void add(Forma f){
		listaDeFormas.add(f);
	}

	public void print(){
		for(Forma f : listaDeFormas){
			f.print();
		}
	}
}