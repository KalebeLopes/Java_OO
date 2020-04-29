package teste;

import produtos.CarrinhoDeCompra;
import produtos.Produto;
import produtos.ProdutoComTamanho;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteCarrinho {
	
	CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
	Produto p1;
	Produto p2;
	
	@BeforeClass
	public static void inicializa() {
		
	}

	@Test 
	public void testeAdicionaHashMap() {
//		CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
		Produto p1 = new Produto("arroz", 123, 100);
		Produto p2 = new Produto("asd", 32, 100);
		ProdutoComTamanho p3 = new ProdutoComTamanho("feijao", 123, (float) 220.32, 10);
		
		
		carrinho.adicionaProduto(p1, 1);
		carrinho.adicionaProduto(p1, 1);
		carrinho.adicionaProduto(p2, 1);
		carrinho.adicionaProduto(p2, 3);
		carrinho.adicionaProdutoComTamanho(p3, 3);
		carrinho.removeProdutoComTamanho(p3, 2);
//		carrinho.ImprimeCarrinho();
	}
	
	@Test
	public void testeRemoveHashMap() {
		Produto p1 = new Produto("arroz", 123, 100);
		Produto p2 = new Produto("asd", 32, 100);
		
		carrinho.adicionaProduto(p1, 2);
		carrinho.adicionaProduto(p2, 1);
		carrinho.ImprimeCarrinho();
		carrinho.removeProduto(p1, 1);
//		carrinho.ImprimeCarrinho();
	}
	
	@Test
	public void calculaValor() {
		Produto p1 = new Produto("arroz", 123, 100);
		Produto p2 = new Produto("asd", 32, 100);
		
		carrinho.adicionaProduto(p1, 2);
		carrinho.adicionaProduto(p2, 1);
		
		System.out.println(carrinho.CalculaValor());
//		assertEquals(200, carrinho.CalculaValor());
	}

}
