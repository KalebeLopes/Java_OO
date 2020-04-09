package Pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAddIngrediente {

	@Test
	void valorPizza() {
		Pizza p1 = new Pizza();
		
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("calabresa");
		assertEquals(20, p1.getPreco());
	
	}
	
//	@Test
//	void engredienteTotal() {
//		Pizza p1 = new Pizza();
//		
//		p1.adicionaIngrediente("tomate");
//		p1.adicionaIngrediente("tomate");
//		p1.adicionaIngrediente("calabresa");
//		assertEquals(7, Pizza.contabiliza.get("calabresa"));
//	
//	}
	
	@Test
	void carrinhoDeCompra() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		p1.adicionaIngrediente("tomate");
		p2.adicionaIngrediente("tomate");
		p2.adicionaIngrediente("calabresa");
		p2.adicionaIngrediente("queijo");
		
		carrinho.addPizza(p1);
		carrinho.addPizza(p2);
		
		assertEquals(35, carrinho.getValorCarrinho());
	
	}

}
