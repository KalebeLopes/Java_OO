package lista30;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta();		
		c1.saldo = 100;
		
		Conta c2 = c1;
		c2.saldo += 50;
		
		System.out.println("saldo: " + c1.saldo);
	}

}
