package Aula11;

public class Bolsista extends Aluno{
	
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa do aluno: " + this.getNome());
	}
	
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " É bolsista! pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	

}
