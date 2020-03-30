package Aula3;

public class Caneta {
	public String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public Caneta() {  // método construtor
		this.tampar();
		this.cor = "Azul";
	}
	
	public Caneta(String m, String c, float p) {  // método construtor
		this.setModelo(m);
		this.cor = c;
		this.ponta = p;
	}
	
	public void status() {
		System.out.println("Uma caneta: " + this.getModelo());
		System.out.println("cor: " + this.cor);
		System.out.println("ponta; " + this.getPonta());
		System.out.println("carga: " + this.carga);
		System.out.println("tampada: " + this.tampada);
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	
	public void rabiscar() {
	
		if (this.tampada == true) {
			System.out.println("ERRO, CANETA TAMPADA");
		}
		
		else
			System.out.println("POSSO RABISCAR");
		
	}
	
	public void alterarCor(String a) {
		this.cor = a;
	}
	
	public void tampar() {	
		this.tampada = true;
	
	} 
	public void destampar() {
		this.tampada = false;
	}

	
	
	
	
}
