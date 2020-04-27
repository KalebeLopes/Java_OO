package Teste;

import produtos.CarrinhoDeCompras;
import produtos.Produto;


import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinho {

	@Test
	public void testHashMap() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Produto p1 = new Produto("arroz", 123, 100);
		Produto p2 = new Produto("asd", 32, 100);
		carrinho.adicionaProduto(p1, 1);
		carrinho.adicionaProduto(p1, 1);
		carrinho.adicionaProduto(p2, 1);
		carrinho.adicionaProduto(p2, 3);
		carrinho.ImprimeCarrinho();
	}

}
