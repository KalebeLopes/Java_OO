package paciente;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(70, 1.75);
		
		p1.calcularIMC();
		System.out.println(p1.calcularIMC());
		p1.diagnostico();
		
	}

}
