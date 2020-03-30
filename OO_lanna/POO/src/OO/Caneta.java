package OO;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta: " + this.modelo);
		System.out.println("cor: " + this.cor);
		System.out.println("ponta; " + this.ponta);
		System.out.println("carga: " + this.carga);
		System.out.println("tampada: " + this.tampada);
	}

	Caneta(){
		
	}
	
	Caneta(String modelo, String cor, float ponta, int carga, boolean tampada){
		this.modelo = modelo;
		
	}
	
	void rabiscar() {
	
		if (this.tampada == true) {
			System.out.println("ERRO, CANETA TAMPADA");
		}
		
		else
			System.out.println("POSSO RABISCAR");
		
	}
	
	void tampar() {	
		this.tampada = true;
	
	} 
	void destampar() {
		this.tampada = false;
	}
	
	
	
}
