package pacote2;

import java.util.Arrays;

public class CombustívelIncompativelException extends Exception {

	public CombustívelIncompativelException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CombustívelIncompativelException(String message) {
		super(message);
			
	}

	@Override
	public String toString() {
		return "CombustívelIncompativelException" + getMessage();
	}
	
	
	

}
