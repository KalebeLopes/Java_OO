package carro;

public class CarroSoma extends CarroDeCorrida{
	
	private int potencia;
	
	public CarroSoma(int potencia, int velocidadeMaxima, String nome){
		super(velocidadeMaxima, nome);
		this.potencia = potencia;
		this.velocidade = 0;
	}
	
	@Override
	public void acelerar() {
		velocidade += potencia;
		
		if (velocidade > velocidadeMaxima)
			velocidade = velocidadeMaxima;
			
	}
	
	
	
}
