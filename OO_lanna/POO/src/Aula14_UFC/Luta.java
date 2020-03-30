package Aula14_UFC;
import java.util.Random;

public class Luta {
	
	Random r1 = new Random();
	
	private Lutador desafiado;	// Tipo abstrato de dados
	private Lutador desafiante; // Tipo abstrato de dados
	int rounds;
	boolean aprovada;
	
	// métodos 
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if ((l1.getCategoria() == l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			
			this.desafiante = l2;
			System.out.println("Luta Marcada!");
		}
		
		else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Impossível marcar a luta!");
		}
			
	}
	
	public void Lutar() {
		
		if (this.aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();
			int vencedor = r1.nextInt(3);
			//System.out.println(vencedor);
			
			
			switch (vencedor){
				case 0: 
					System.out.println("Empatou!");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				
				case 1:
					System.out.println(desafiado.getNome() + " Ganhou");
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				
				case 2:
					System.out.println(desafiante.getNome() + " Ganhou");
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
			}
				
			
		}
		
	}
	

}
