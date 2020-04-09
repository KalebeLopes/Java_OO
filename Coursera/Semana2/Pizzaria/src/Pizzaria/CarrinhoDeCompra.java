package Pizzaria;

public class CarrinhoDeCompra {

	int total = 0;
	
	void addPizza(Pizza p) {
		if (p.ingredientePizza == 0) {
			System.out.println("Pizza n foi adicionada porque n contem ingredientes");
			total += 0;
		}
			
		else
		total += p.getPreco();
	}
	
	int getValorCarrinho() {
		return total;
	}
	
}
