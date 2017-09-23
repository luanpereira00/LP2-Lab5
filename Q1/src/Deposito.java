import java.util.ArrayList;

public class Deposito {
	private ArrayList<Produto> produtos;
	
	public Deposito(){
		produtos = new ArrayList<Produto>();
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}
	public int quantosProdutos() {
		return produtos.size();
	}
	public boolean estaVazio() {
		return produtos.isEmpty();
	}
	public Produto maiorValor() {
		int indice=-1;
		if(!estaVazio()) {
			indice=0;
			for(int i=0; i<produtos.size(); i++) {
				if(produtos.get(indice).getPreco() < produtos.get(i).getPreco()) {
					indice = i;
				}
			}
		}
		return produtos.get(indice);
	}
	public void printList() {
		for(int i=0; i<produtos.size(); i++) {
			produtos.get(i).print();
			System.out.println();
		}
	}
	
}