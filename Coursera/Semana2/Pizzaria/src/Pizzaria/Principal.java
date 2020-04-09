package Pizzaria;

public class Principal {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		p1.adicionaIngrediente("azeitona");
		p2.adicionaIngrediente("queijo");
		p3.adicionaIngrediente("presunto");
		p3.adicionaIngrediente("presunto");
		
		carrinho.addPizza(p1);
		carrinho.addPizza(p2);
		carrinho.addPizza(p3);
		
		System.out.println("Valor do carrinho: " + carrinho.getValorCarrinho());
		
		System.out.println("Qtd de azeitona: " + Pizza.contabiliza.get("azeitona"));
		System.out.println("Qtd de queijo: " + Pizza.contabiliza.get("queijo"));
		System.out.println("Qtd de presunto: " + Pizza.contabiliza.get("presunto"));
		

	}

}
