package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteContaCorrente {

	ContaCorrente n1 = new ContaCorrente();
	
	@Test
	void deposito() {
		//ContaCorrente n1 = new ContaCorrente();
		
		n1.depositar(200);
		assertEquals(200, n1.saldo);
	}
	
	@Test
	void saque() {
		//ContaCorrente n1 = new ContaCorrente();
		
		n1.depositar(200);
		n1.sacar(100);
		assertEquals(100, n1.saldo);
	}
	
	@Test
	void saqueMaior() {
		//ContaCorrente n1 = new ContaCorrente();
		
		n1.depositar(200);
		n1.sacar(250);
		assertEquals(200, n1.saldo);
	}
	

}
