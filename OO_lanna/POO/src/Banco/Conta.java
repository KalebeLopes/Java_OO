package Banco;

public class Conta {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	Conta(){
		this.saldo = 0;
		this.status = false;
	}
	
	public void abrirConta(String x, int y) {
		if (x == "CC") { 
			this.tipo = "CC";
			this.saldo += 50;
			//this.status = true;
			this.setStatus(true);
			this.numConta = y;
		}
		
		if (x == "CP") {
			this.tipo = "CP";
			this.saldo += 150;
			this.status = true;
			this.numConta = y;
		}
		
	}

	public void fecharConta() {
		if (this.getSaldo() > 0 && this.getSaldo() < 0)
			System.out.println("Conta n pode ser fechada");
		else
			System.out.println("Conta fechada");
			this.setStatus(false);
	}
	
	public void depositar(float x) {
		if (this.status == true) {
			System.out.println("Depósito feito");
			this.setSaldo(this.getSaldo() + x);
		}
		
		else
			System.out.println("N pode depositar");
	}
	
	public void sacar(float x) {
		if (this.saldo > 0 && this.saldo >= x) {
			this.setSaldo(this.getSaldo() - x);
			System.out.println("Saque feito");
		}
		else
			System.out.println("N pode sacar");
		
	}
	
	public void pagarMensal() {
		if (this.getTipo() == "CC") {
			this.setSaldo(this.getSaldo() - 12); 
		}
		
		if (this.getTipo() == "CP") {
			this.setSaldo(this.getSaldo() - 20); 
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	} 
	
	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status="
				+ status + "]";
	}

}
