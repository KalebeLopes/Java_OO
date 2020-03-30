package Aula12_Polimorfismo;

public class Ave extends Animal{
	
	String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	public void fazerNinho() {
		System.out.println("construiu o ninho");
	}
	
	@Override
	public void locomover() {
		System.out.println("voando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("comendo frutas");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("som de ave");
	}

}
