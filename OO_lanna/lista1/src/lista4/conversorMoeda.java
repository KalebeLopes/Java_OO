package lista4;

public class conversorMoeda {

	double total;
	
	Pessoa pessoa;
	Dolar dolar;
	
	
	public double converter(double a, double b) {
		total = a * b;
		return (total * 0.06) + total;
	}
	
}
