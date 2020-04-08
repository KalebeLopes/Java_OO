package Escola;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.b1 = 70;
		a1.b2 = 60;
		a1.b3 = 80;
		a1.b4 = 70;
		
		System.out.println(a1.media());
		System.out.println(a1.passouDeAno());
		
	}
	
}
