import java.util.ArrayList;
public class Usuario {
	
	String nome;
	int idUsuario;
	ArrayList<Livro> livroEmprestado = new ArrayList<Livro>();
	
	void anexalivro(Livro book) {
		livroEmprestado.add(book);
	}
	
	int desanexalivro(Livro book) {
		for(int i = 0; i < livroEmprestado.size(); i++) {
			if (book.codLivro == livroEmprestado.get(i).codLivro) {
				livroEmprestado.remove(i);
				return 1;
			}		
		}
		return 0;
	}
	
	public void listarLivros() {
		for (int i = 0; i < livroEmprestado.size(); i++)
			System.out.println(livroEmprestado.get(i).titulo);
	}

}
