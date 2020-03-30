package Aula12_Polimorfismo;

public class Peixe extends Animal{
	
	String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	@Override
	public void locomover() {
		System.out.println("nadando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("comendo substancias");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("peixe n emite som");	
	}
	
	
	public void soltarBolha() {
		
	}

}
