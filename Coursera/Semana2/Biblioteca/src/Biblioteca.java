import java.util.ArrayList;
public class Biblioteca {

	String nome;	
	ArrayList<Livro> catalogoLivro = new ArrayList<Livro>();
	ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
	
	void registraUsuario(Usuario user) {
		listaUsuario.add(user);
	}
	
	void addLivroCatalogo(Livro book) {
		catalogoLivro.add(book);
	}
	
	void emprestaLivro(Usuario user, Livro book) {
		
	}
	
	void devolveLivro() {
		
	}
	
	void exibeLivrosDisponiveis() {
		
	}
	
	void exibeLivrosIisponiveis() {
		
	}
	
}
