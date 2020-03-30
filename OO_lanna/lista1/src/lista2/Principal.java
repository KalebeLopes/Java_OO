package lista2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas: "));
		
		Pessoa p[] = new Pessoa[valor];
		
		
		for (int i = 0; i < valor ; i++) {
			p[i] = new Pessoa();

			p[i].nome = JOptionPane.showInputDialog("Pessoa " + (i+1) + ":"+"\nInforme seu Nome: ");
			p[i].peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu Peso: "));
			p[i].altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua Altura"));
			//p[i].calcImc();
		}
		
		for (int i = 0; i < valor ; i++) {
			System.out.println("Pessoa " + (i+1) +": ");
			p[i].print();
			
			if (p[i].calcImc() <= 18.5 ) {
				System.out.printf("IMC: %.2f - Baixo peso", p[i].calcImc());
			}
			if (p[i].calcImc() >= 18.5 && p[i].calcImc() < 25) {
				System.out.printf("IMC: %.2f - Normal" , p[i].calcImc());
			}
			
			if (p[i].calcImc() >= 25 && p[i].calcImc() < 30) {
				System.out.println("IMC: " + p[i].calcImc() + " - Sobrepeso");
			}
			
			if (p[i].calcImc() >= 30 && p[i].calcImc() < 35) {
				System.out.println("IMC: " + p[i].calcImc() + " - Obesidade grau 1");
			}
			if (p[i].calcImc() >= 35 && p[i].calcImc() < 40) {
				System.out.println("IMC: " + p[i].calcImc() + " - Obesidade grau 2");
			}
			
			if (p[i].calcImc() >= 40) {
				System.out.println("IMC: " + p[i].calcImc() + " - Obesidade grau 3");
			}
			
			
		}
		
		
		
		
	}

}