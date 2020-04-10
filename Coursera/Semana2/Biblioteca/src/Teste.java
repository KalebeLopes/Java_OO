import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void TesteArrayList() {
		Biblioteca biblioteca = new Biblioteca();
		Usuario user = new Usuario();
		
		user.nome = "Kalebe";
		
		biblioteca.registraUsuario(user);
		System.out.println(biblioteca.listaUsuario.get(0).nome);
	}
	
	@Test
	void TesteArrayListLivro() {
		Biblioteca biblioteca = new Biblioteca();
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		l1.titulo = "Matematica";
		l2.titulo = "Portugues";
		
		biblioteca.addLivroCatalogo(l1);
		biblioteca.addLivroCatalogo(l2);
		System.out.println(biblioteca.catalogoLivro.get(1).titulo);
	}

}
