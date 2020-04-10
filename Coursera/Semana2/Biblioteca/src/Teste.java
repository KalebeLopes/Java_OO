import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void TesteArrayList() {
		Biblioteca biblioteca = new Biblioteca();
		Usuario user = new Usuario();
		
		user.nome = "Kalebe";
		
		biblioteca.registraUsuario(user);
		System.out.println(user.livroEmprestado);
	}

}
