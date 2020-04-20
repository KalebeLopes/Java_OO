package carros;

public class Carro {
	public int potencia;
	int velocidade;
	String nome;
	
	
	public void acelerar() {
		velocidade += potencia;
	}
	
	public void frear() {
		velocidade /= 2;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void imprimir() {
		System.out.println("O carro "+nome+ " está a velocidade de "+getVelocidade()+" km/h");
	}
	
}
