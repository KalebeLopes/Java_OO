
package Final;

import javax.swing.JOptionPane;

public class Taxas extends Despesa{
	
	private int ano;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void detalheTaxa() {
		JOptionPane.showMessageDialog(null, "------------------------------\nTaxa \n"+"Nome despesa: " + this.getNomeDespesa()+"\n"+"Valor total da despesa: "+this.getValorTotal()+"\n"
				+"Data da despesa: " + this.getData()+"\nAno da despesa: "+ this.getAno()+"\n------------------------------");
		
	}
	

}