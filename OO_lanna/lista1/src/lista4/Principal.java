package lista4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		conversorMoeda c = new conversorMoeda();
		Pessoa p = new Pessoa();
		Dolar d = new Dolar();
		
		JOptionPane.showMessageDialog(null, "Venda de dóllar");
		d.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do dólar: "));
		p.dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos dólares vc quer: "));
		//c.iof = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor IOF: "));
		
		System.out.println("Valor em Reais: " + c.converter(d.valor, p.dinheiro));
		//Double.parseDouble(JOptionPane.showInputDialog("Valor em Reais: " + c.converter(d.valor, p.dinheiro));
		
	}

}
