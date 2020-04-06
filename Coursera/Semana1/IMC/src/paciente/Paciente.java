package paciente;
public class Paciente {

	double peso, altura;
	
	Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	double calcularIMC() {
		return peso / (altura * altura);
	}
	
	void diagnostico() {
		if (calcularIMC() < 16)
			System.out.println("Baixo peso muito grave\n");
		else if (calcularIMC() >= 16 && calcularIMC() <= 16.99)
			System.out.println("Baixo peso grave\n");
		else if (calcularIMC() >= 17 && calcularIMC() <= 18.49)
			System.out.println("Baixo peso\n");
		else if (calcularIMC() >= 18.50 && calcularIMC() <= 24.99)
			System.out.println("Peso normal\n");
		else if (calcularIMC() >= 25 && calcularIMC() <= 29.99)
			System.out.println("Sobrepeso\n");
		else if (calcularIMC() >= 30 && calcularIMC() <= 34.99)
			System.out.println("Obesidade grau 1\n");
		else if (calcularIMC() >= 35 && calcularIMC() <= 39.99)
			System.out.println("Obesidade grau 2\n");
		else 
			System.out.println("Obesidade grau 3 (obesidade mórbida)\n");
	}
	
}
