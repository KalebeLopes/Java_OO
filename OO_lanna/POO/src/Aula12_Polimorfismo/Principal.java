package Aula12_Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Peixe p = new Peixe();
		
		m.setCorPelo("Marrom");
		m.alimentar();
		m.emitirSom();
		m.locomover();
		
		p.alimentar();
		p.emitirSom();
		p.locomover();
		
		
		
	}

}
