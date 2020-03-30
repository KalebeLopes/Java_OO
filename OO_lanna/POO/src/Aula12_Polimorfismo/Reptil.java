package Aula12_Polimorfismo;

public class Reptil extends Animal{
	
	String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	@Override
	public void locomover() {
		System.out.println("rasjejando");
	}
	
	@Override
	public void alimentar() {
		System.out.println("comendo vegetais");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("som de réptil");
	}
	
	

}
