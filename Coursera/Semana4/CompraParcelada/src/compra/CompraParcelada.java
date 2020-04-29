package compra;

public class CompraParcelada extends Compra{
	
	int qtdParcelas;
	double jurosMensal;

	public CompraParcelada(double val, int qtdParcelas, double jurosMensal){	// PASSAR VALOR DA PORCENTAGEM. Ex.: 1 (1%)
		super(val);
		this.qtdParcelas = qtdParcelas;
		this.jurosMensal = jurosMensal/100;
	}
	
	@Override
	public double total() {
		double valorComJuros = 1;
		
		for (int i = 1; i <= qtdParcelas; i++) {
			valorComJuros *= (1 + jurosMensal);
		}
		
		valorComJuros *= super.total();
		
		return valorComJuros;
	}
	
}
