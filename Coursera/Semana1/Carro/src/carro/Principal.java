package carro;
public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		
		corridaDaAmizade.adicionaCarro(new CarroSoma(10, 110, "carro1"));
		corridaDaAmizade.adicionaCarro(new CarroSoma(8, 140, "carro2"));
		corridaDaAmizade.adicionaCarro(new CarroMultiplica(1.7, 100, "carro3"));
		corridaDaAmizade.adicionaCarro(new CarroMultiplica(1.4, 110, "carro4"));
		corridaDaAmizade.partida();
	}

}
