import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

//	@Test
//	void TesteArrayList() {
//		Biblioteca biblioteca = new Biblioteca();
//		Usuario user = new Usuario();
//		
//		user.nome = "Kalebe";
//		
//		biblioteca.registraUsuario(user);
//		System.out.println(biblioteca.listaUsuario.get(0).nome);
//	}
//	
//	@Test
//	void TesteArrayListLivro() {
//		Biblioteca biblioteca = new Biblioteca();
//		Livro l1 = new Livro();
//		Livro l2 = new Livro();
//		
//		l1.titulo = "Matematica";
//		l2.titulo = "Portugues";
//		
//		biblioteca.addLivroCatalogo(l1);
//		biblioteca.addLivroCatalogo(l2);
//		System.out.println(biblioteca.catalogoLivro.get(1).titulo);
//	}
	
//	@Test
//	void testaAnexalivroUsuario() {
//		
//		Usuario u1 = new Usuario();
//		Livro l1 = new Livro();
//		
//		l1.titulo = "asdas";
//		u1.anexalivro(l1);
//		u1.anexalivro(l1);
//		
//		u1.listarLivros();
//		
//		
//	}
	
	@Test
	void testeDesanexaLivroUsuario() {
		Usuario u1 = new Usuario();
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		Livro l3 = new Livro();
		
		l1.titulo = "a";
		l1.codLivro = 1;
		l2.titulo = "b";
		l2.codLivro = 2;
		l3.titulo = "c";
		l3.codLivro = 3;
		
		u1.anexalivro(l1);
		u1.anexalivro(l2);
		u1.listarLivros();
		assertEquals(0, u1.desanexalivro(l3));
		u1.listarLivros();
		
	}

}
