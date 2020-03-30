package Final;

import javax.swing.JOptionPane;

public class Abastecimento extends Despesa{
	
	private String tipoAbastecido;
	private float valorLitro, odometro;
	private int tanqueCheio;
	
	
	public String getTipoAbastecido() {
		return tipoAbastecido;
	}
	public void setTipoAbastecido(String tipoAbastecido) {
		this.tipoAbastecido = tipoAbastecido;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	public float getOdometro() {
		return odometro;
	}
	public void setOdometro(float odometro) {
		this.odometro = odometro;
	}
	public int getTanqueCheio() {
		return tanqueCheio;
	}
	public void setTanqueCheio(int tanqueCheio) {
		this.tanqueCheio = tanqueCheio;
	}
	
	
	
	public void detalheAbastecimento() {
		if(this.getTanqueCheio() == 1) {
			JOptionPane.showMessageDialog(null, "------------------------------\nAbastecimento \n"+"Nome da Despesa: "+this.getNomeDespesa()+"\n"+"Data da despesa: "+this.getData()+
					"\n"+"Valor total da despesa: "+this.getValorTotal()+"\n"+"Tanque cheio: "+"Nao"+"\n"+"Valor do litro de combustivel: "+this.getValorLitro()+
					"\n"+"Tipo do combustivel abastecido: " + this.getTipoAbastecido()+"\n"+"Odometro: " + this.getOdometro()+
					"\n------------------------------");
		}
		else {
		JOptionPane.showMessageDialog(null, "------------------------------\nAbastecimento \n"+"Nome da Despesa: "+this.getNomeDespesa()+"\n"+"Data da despesa: "+this.getData()+
		"\n"+"Valor total da despesa: "+this.getValorTotal()+"\n"+"Tanque cheio: "+"Sim"+"\n"+"Valor do litro de combustivel: "+this.getValorLitro()+
		"\n"+"Tipo do combustivel abastecido: " + this.getTipoAbastecido()+"\n"+"Odometro: " + this.getOdometro()+
		"\n------------------------------");
		}
//		JOptionPane.showMessageDialog(null, "------------------------------");
//		JOptionPane.showMessageDialog(null, "Abastecimento: ");
//		JOptionPane.showMessageDialog(null, this.getNomeDespesa());
//		JOptionPane.showMessageDialog(null, this.getValorTotal());
//		JOptionPane.showMessageDialog(null, this.getTanqueCheio());
//		JOptionPane.showMessageDialog(null, this.getValorLitro());
//		JOptionPane.showMessageDialog(null, this.getOdometro());
//		JOptionPane.showMessageDialog(null, "------------------------------");
	
	
	}
}
