package paciente;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(70, 1.75);
		Paciente p2 = new Paciente(80, 1.75);
		Paciente p3 = new Paciente(150, 1.75);
		
		System.out.println("IMC: " + p1.calcularIMC());
		System.out.print("Diagnóstico: ");
		p1.diagnostico();
		
		System.out.println("IMC: " + p2.calcularIMC());
		System.out.print("Diagnóstico: ");
		p2.diagnostico();
		
		System.out.println("IMC: " + p3.calcularIMC());
		System.out.print("Diagnóstico: ");
		p3.diagnostico();
		
	}

}
