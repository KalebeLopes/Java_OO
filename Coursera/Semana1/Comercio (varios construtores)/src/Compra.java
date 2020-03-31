
public class Compra {

	int valorTotal;
	int numParcelas;
	
	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numParcelas = 1;
	}
	
	// parcelado
	public Compra(int qtdParcelas, int valorParcelas) {
		numParcelas = qtdParcelas;
		valorTotal = valorParcelas * qtdParcelas;
	}
	

	public int getValorTotal() {
		return valorTotal;
	}
	
	public int getNumParcelas() {
		return numParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal/numParcelas;
	}
	
	
}

