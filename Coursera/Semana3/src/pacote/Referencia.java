package pacote;

public class Referencia {
	
	int modificadorDefault = 1;
	protected int modificadorProtected = 1;
	private int modificadorPrivate = 1;
	public int modificadorPublic = 1;
	
	public void testeAcesso() {
		
		modificadorDefault = 2;
		modificadorProtected = 2;
		modificadorPrivate = 2;
		modificadorPublic = 2;
		
	}

}
