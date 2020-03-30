package pacote2;

public class ValorInvalidoException extends Exception {

	public ValorInvalidoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValorInvalidoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ValorInvalidoException" + getMessage();
	}

}
