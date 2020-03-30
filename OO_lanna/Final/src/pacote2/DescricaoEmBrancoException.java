package pacote2;

import java.util.Arrays;

public class DescricaoEmBrancoException extends Exception {

	public DescricaoEmBrancoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DescricaoEmBrancoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DescricaoEmBrancoException " + getMessage();
	}

}
