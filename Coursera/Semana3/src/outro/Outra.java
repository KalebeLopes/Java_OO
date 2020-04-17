package outro;

import pacote.Referencia;

public class Outra {
	
	public void testaAcesso() {		// Só consigo acessar atributos de outra classe através de método
		Referencia r = new Referencia();
		r.modificadorPublic = 3; // Só consigo acessar o Public
	}
	
	
	

}
