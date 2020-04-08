package Escola;

public class Aluno {

	int b1, b2, b3, b4;
	
	public int media() {
		int total = 0;
		total += b1;
		total += b2;
		total += b3;
		total += b4;
	
		return total/4;
	}
	
	public boolean passouDeAno() {
		
		int media = media();
		
		if (media >= 60)
			return true;
		return false;
		
	
	}
}
