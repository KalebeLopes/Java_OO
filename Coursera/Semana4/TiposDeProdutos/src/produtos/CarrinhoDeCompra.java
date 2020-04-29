package produtos;

import java.util.Collection;
import java.util.HashMap;

public class CarrinhoDeCompra {

	private HashMap<Produto, Integer> carrinho = new HashMap<>();

	public void adicionaProduto(Produto prod, int qtd) {
		
		if (carrinho.containsKey(prod)) {
			carrinho.put(prod, carrinho.get(prod).intValue() + qtd);
		} else {
			carrinho.put(prod, qtd);
		}
	}
	
	public void adicionaProdutoComTamanho(ProdutoComTamanho prod, int qtd) {
		
		if (carrinho.containsKey(prod)) {
			carrinho.put(prod, carrinho.get(prod).intValue() + qtd);
		} else {
			carrinho.put(prod, qtd);
		}
	}
	
	public void removeProduto(Produto prod, int qtd) {
		if (carrinho.containsKey(prod)) {
			if (qtd == carrinho.get(prod).intValue()) {
				carrinho.remove(prod);
			}
			else if (qtd > 0 && qtd < carrinho.get(prod).intValue()) {
				carrinho.put(prod, carrinho.get(prod).intValue() - qtd);
			}
		} else {
			System.out.println("Impossivel retirar Produto do carrinho");
		}
			
	}
	
	public void removeProdutoComTamanho(Produto prod, int qtd) {
		if (carrinho.containsKey(prod)) {
			if (qtd == carrinho.get(prod).intValue()) {
				carrinho.remove(prod);
			}
			else if (qtd > 0 && qtd < carrinho.get(prod).intValue()) {
				carrinho.put(prod, carrinho.get(prod).intValue() - qtd);
			}
		} else {
			System.out.println("Impossivel retirar Produto do carrinho");
		}
			
	}
	
	public Collection<Integer> CalculaValor() {
		Collection<Integer> valor = null;
		for (int i: carrinho.values()) {
			valor = carrinho.values();
		}
		return valor;
	}
	
	public void ImprimeCarrinho() {
		for (Produto i : carrinho.keySet()) {
			System.out.println(carrinho.get(i));
		}
	}
	
}

