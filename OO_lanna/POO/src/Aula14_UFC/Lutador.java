package Aula14_UFC;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// Método Construtor
	
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	// Métodos
	
	public void apresentar() {
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Peso: " + this.getPeso());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		System.out.println("-----------------------");
		
	}
	
	public void status() {
		
		System.out.println(this.getNome() + " É um peso: " + this.getCategoria() + ", " +
							this.getVitorias() + " Vitórias, " + this.getDerrotas() + " Derrotas, e " +
							this.getEmpates() + " Empates.");
		
	}
	
	public void ganharLuta() {
		
		this.setVitorias(this.getVitorias() + 1);
		
	}
	
	public void perderLuta() {
		
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	
	public void empatarLuta() {
		
		this.setEmpates(this.getEmpates() + 1);
		
	}
	
	// Métodos Acessores

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		}
		
		else if (this.getPeso() < 70.3) {
			this.categoria = "Leve";
		}
		
		else if (this.getPeso() < 83.9) {
			this.categoria = "Médio";
		}
		
		else if (this.getPeso() < 120.2) {
			this.categoria = "Pesado";
		}
		
		else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	

}
