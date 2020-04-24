package carro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarroMult {

	CarroDeCorrida c1;
	
	@Before
	public void CriarCarro(){
		c1 = new CarroMultiplica(1.5, 100, "gol");
	}
	
	@Test
	public void testeAcelerar1() {
		c1.acelerar();
		assertEquals(10, c1.getVelocidade());
	}
	
	@Test
	public void testeAcelerar2() {
		c1.acelerar();
		c1.acelerar();
		assertEquals(15, c1.getVelocidade());
	}
	
	@Test
	public void testeAcelerarMaximo() {
		for (int i=0;i<10;i++) {
			c1.acelerar();
		}
		assertEquals(100, c1.getVelocidade());
	}
	
	@Test
	public void testeFrear() {
		c1.acelerar();
		c1.frear();
		assertEquals(5, c1.getVelocidade());
	}
	
	@Test
	public void testeFrearAteZero() {
		c1.acelerar();
		c1.frear();
		c1.frear(); 
		c1.frear();
		c1.frear();
		assertEquals(0, c1.getVelocidade());
	}

}
