package Banco;

public class Principal {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.setDono("kalebe");
		c1.abrirConta("CC", 1111);
		c1.depositar(100);
		//c1.sacar(230);
		//c1.pagarMensal();
		//c1.fecharConta();
		//c1.sacar(8);
		//c1.fecharConta();
		System.out.println("" + c1.toString());
		
		Conta c2 = new Conta();
		c2.setDono("Creuza");
		c2.abrirConta("CP", 2222);
		//c2.sacar(20);
		c2.depositar(100);
		System.out.println("" + c2.toString());
		
		
	}

}
