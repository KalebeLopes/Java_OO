package carro;
public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro(10, 0, "jetta");	
		
		Carro c2 = new Carro(15, 0, "golf");
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c2.acelerar();
		c2.acelerar();
		
	}

}
