
public class Principal {

	public static void main(String[] args) {
		Pilha p1 = new Pilha(10);
		p1.empilhar("Kalebe");
		p1.empilhar("Maria");
		p1.empilhar("Jose");
		System.out.println(p1.topo());
		System.out.println(p1.tamanho());
		p1.desempilar();
		System.out.println(p1.topo());
		System.out.println(p1.tamanho());
	}
	
	
	
}
