package Aula11;

public class Principal {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(); n pode pq é abstrata
		
		Visitante v1 = new Visitante();
		v1.setNome("Kalebe");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Pedro");
		a1.setMatricula(1234);
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Araujo");
		b1.setMatricula(3123213);
		b1.setBolsa(12.5f);
		b1.pagarMensalidade(); 
		
		
		

	}	

}
