package produtos;

import java.util.HashMap;

public class CarrinhoDeCompras {

	private HashMap<Produto, Integer> carrinho = new HashMap<>();

	public void adicionaProduto(Produto prod, int qtd) {
		if (carrinho.containsKey(prod)) {
			carrinho.put(prod, carrinho.get(prod).intValue() + qtd);
		} else {
			carrinho.put(prod, qtd);
		}
	}
	
	public void removeProduto(Produto prod, int qtd) {
		
	}
	
	public void ImprimeCarrinho() {
		for (Produto i : carrinho.keySet()) {
			System.out.println(carrinho.get(i));
		}
	}
	
}

