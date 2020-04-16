package banco;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TesteContaCorrente{

	@Before
	public void inicializaConta() {
		System.out.println("asd");
		n1 = new ContaEspecial(100);
		n1.depositar(200);
	}

	@Test
	public void saqueMaiorSaldo() {
		int valorSacado = n1.sacar(350);
		assertEquals(200, n1.saldo);
		assertEquals(0, valorSacado);
	}
	
	@Test
	public void saqueMaiorSaldoDentroDoLimite() {
		int valorSacado = n1.sacar(250);
		assertEquals(-50, n1.saldo);
		assertEquals(1, valorSacado);
	}

}
