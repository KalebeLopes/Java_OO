package pacote;

public class OutraMesmoPacote {

	public void testeAcesso() {		// Só consigo acessar atributos de outra classe através de métodos
		Referencia r = new Referencia();
		
		r.modificadorDefault = 3;
		r.modificadorProtected = 3;
		r.modificadorPublic = 3;		
	}
	
}
