package Principal;

import pos.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Aluno[] a = new Aluno[10];
		a[0] = new Aluno();
		
		a[0].nome = "kalebe";
		
		System.out.println("nome: " + a[0].nome);
	}

}
