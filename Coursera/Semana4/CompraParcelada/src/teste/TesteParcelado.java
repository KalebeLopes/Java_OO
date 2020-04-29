package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import compra.CompraParcelada;

public class TesteParcelado {

	@Test
	public void ValorCompraParcelada() {
		CompraParcelada c1 = new CompraParcelada(1000, 1, 1);
		CompraParcelada c2 = new CompraParcelada(1000, 2, 1);
		CompraParcelada c3 = new CompraParcelada(1000, 5, 1);
		CompraParcelada c4 = new CompraParcelada(1000, 10, 1);
		
		assertEquals(1040,60, c1.total());
		assertEquals(1010,0, c2.total());
		assertEquals(1050,98, c3.total());
		assertEquals(1104,54, c4.total());
	}

}
