package Aula19_Livro;

public class Livro implements Publicacao{

	private String titulo;
	private String autor;
	private int totPg;
	private int pgAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// Construtor
	Livro(){
		this.aberto = false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPg() {
		return totPg;
	}
	public void setTotPg(int totPg) {
		this.totPg = totPg;
	}
	public int getPgAtual() {
		return pgAtual;
	}
	public void setPgAtual(int pgAtual) {
		this.pgAtual = pgAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public void detalhes() {
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de páginas: " + this.getTotPg());
		System.out.println("Página atual: " + this.getPgAtual());
		System.out.println("Aberto: " + this.getAberto());
		System.out.println("Leitor: " + this.getLeitor());
	}
	
	@Override
	public void abrir() {
		if (this.getAberto() == false) {
			this.setAberto(true);
		}
		else {
			System.out.println("O livro já está aberto!");
		}
	}
	
	@Override
	public void fechar() {
		if (this.getAberto() == true) {
			this.setAberto(false);
		}
		
		else {
			System.out.println("O livro já está fechado!");
		}
		
	}
	
	@Override
	public void folhear() {
		this.setPgAtual(this.getPgAtual() + 1);
	}
	
	@Override
	public void avancarPg() {
		this.setPgAtual(this.getPgAtual() + 1);
	}
	@Override
	public void voltarPg() {
		this.setPgAtual(this.getPgAtual() - 1);
	}	
	
}
