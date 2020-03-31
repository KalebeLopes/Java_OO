import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	void compraAvista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumParcelas());	// PRIMEIRO COLOCO O QUE EU ESPERO (JUNIT)
		assertEquals(500, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
	}
	
	void compraParcelado() {
		Compra c = new Compra(4, 250);
		assertEquals(4, c.getNumParcelas());	
		assertEquals(1000, c.getValorTotal());
		assertEquals(250, c.getValorParcela());
	}

}
