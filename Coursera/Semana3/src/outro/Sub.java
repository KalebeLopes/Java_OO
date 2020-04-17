package outro;
import pacote.Referencia;

public class Sub extends Referencia{
	
	public void testeAcesso() {		// Subclasse pode acessar responsabilidades publicas e protegidas da Superclasse
		
		modificadorPublic = 4;		
		modificadorProtected = 4;

	}
	
}
