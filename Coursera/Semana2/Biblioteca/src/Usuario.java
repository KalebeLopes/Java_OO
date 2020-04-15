import java.util.ArrayList;
public class Usuario {
	
	String nome;
	int idUsuario;
	ArrayList<Livro> livroEmprestado = new ArrayList<Livro>();
	
	void anexalivro(Livro book) {
		livroEmprestado.add(book);
	}
	
	void desanexalivro(Livro book) {
		
	}
	
	public void listarLivros() {
		for (int i = 0; i < livroEmprestado.size(); i++)
			System.out.println(livroEmprestado.get(i).titulo);
	}

}
