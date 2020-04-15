package Teste;

import Pizzaria.*;

import static org.junit.Assert.*;
import org.junit.*;


public class TesteGeral {
	
	@Before
	public void zeraIngredienteAntes() {
		Pizza.zeraIngredientes();
	}
	
	@Before
	public void zeraQtdIngredientes() {
		Pizza.zeraQtdingredientes();
	}

	@Test
	public void valorPizza() {
		Pizza p1 = new Pizza();
		
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("calabresa");
		assertEquals(20, p1.getPreco());
	
	}
	
	@Test
	public void engredienteTotal() {
		Pizza p1 = new Pizza();
		
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("tomate");
		p1.adicionaIngrediente("calabresa");
		p1.adicionaIngrediente("calabresa");
		p1.adicionaIngrediente("cebola");
		p1.adicionaIngrediente("cebola");
		assertEquals(2, Pizza.contabiliza.get("cebola").intValue());
		assertEquals(6, Pizza.totalIngrediente);
	}
	
	@Test
	public void carrinhoDeCompra() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		
		p1.adicionaIngrediente("tomate");
		p2.adicionaIngrediente("tomate");
		p2.adicionaIngrediente("calabresa");
		p2.adicionaIngrediente("queijo");
		
		
		carrinho.addPizza(p1);
		carrinho.addPizza(p2);
		carrinho.addPizza(p3);
		
		assertEquals(35, carrinho.getValorCarrinho());
	
	}

}
