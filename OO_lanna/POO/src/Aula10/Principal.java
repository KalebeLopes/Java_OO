package Aula10;

public class Principal {

	public static void main(String[] args) {
		
		// Pessoa p1 = new Pessoa(); ñ pode ser instanciada pq é abstrata
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		//p1.setSexo("Masculino");
		
		//p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudia");
		p4.setNome("Fabiana");
		
		//System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}

}
