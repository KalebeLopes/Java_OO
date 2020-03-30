package Aula14_UFC;

public class Principal {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
				
		l[0] = new Lutador("Pretty", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador("Puts", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		l[2] = new Lutador("Snap", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		l[3] = new Lutador("Dead", "Austria", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador("Cobol", "Brasil", 37, 1.70f, 119.3f, 5,4,3);
		l[5] = new Lutador("Nerd", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		//l[0].status();
		//l[1].status();
		//l[1].perderLuta();
		//l[1].status();
		
		Luta Ufc = new Luta();
		Ufc.marcarLuta(l[0], l[1]);
		Ufc.Lutar();
		l[0].status();
		l[1].status();

		
	
		
		
	}

}
