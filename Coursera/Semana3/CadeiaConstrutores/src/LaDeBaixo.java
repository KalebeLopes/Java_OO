
public class LaDeBaixo extends DoMeio {

	public LaDeBaixo() {
		super();	// POR PADRAO O JAVA FAZ ISSO, SE A CLASSE DoMeio NAO TIVER CONSTRUTOR, POR PADRAO É CRIADO UM SEM PARÂMETRO
		System.out.println("Construtor lá de Baixo Padrao");
	}
	
	public LaDeBaixo(int x) {
		this("asd");
		System.out.println("int");
	}
	
	public LaDeBaixo(String x) {
		System.out.println("string");
	}

}
