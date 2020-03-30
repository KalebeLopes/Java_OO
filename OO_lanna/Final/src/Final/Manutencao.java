package Final;

import javax.swing.JOptionPane;

public class Manutencao extends Despesa{
	
	private float quilometragem;

	public float getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}

	
	public void detalheManutencao() {
		JOptionPane.showMessageDialog(null, "------------------------------\nManutencao \n"+"Nome despesa: " + this.getNomeDespesa()+"\n"+"Valor total da despesa: "+this.getValorTotal()+"\n"
				+"Data da despesa: " + this.getData()+"\nQuilometragem da despesa: "+ this.getQuilometragem()+"\n------------------------------");
//		JOptionPane.showMessageDialog(null, "------------------------------");
//		//JOptionPane.showMessageDialog(null, "Manutencao: " + Proprietario.this.nm);
//		JOptionPane.showMessageDialog(null, this.getNomeDespesa());
//		JOptionPane.showMessageDialog(null, this.getValorTotal());
//		JOptionPane.showMessageDialog(null, this.getData());
//		JOptionPane.showMessageDialog(null, "------------------------------");
	}


	
	
}
