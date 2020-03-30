package Final;

//import java.util.Scanner;

import javax.swing.JOptionPane;

import pacote2.DescricaoEmBrancoException;
import pacote2.ValorInvalidoException;

public class Veiculo {
	
	private String marca, modelo, tipoCombustivel, cor, placa;
	private int anoFab, anoMod, renavam;
	private float motorizacao, quilometragem;
	
	Taxas[] t = new Taxas[100];
	Manutencao[] m = new Manutencao[100];
	Abastecimento[] a = new Abastecimento[100];
	
	
	
	public Veiculo(){	
		
		
		//Scanner input = new Scanner(System.in);
		
		try {
			
			//System.out.println("Marca: "); marca = input.nextLine();
			marca = JOptionPane.showInputDialog("Marca: ");
			if(marca.isEmpty()){
				throw new DescricaoEmBrancoException("Marca em branco");
			}
			for (int i = 0; i < marca.length(); i++) {
	          if (Character.isDigit(marca.charAt(i))==true){
	        	  throw new ValorInvalidoException("O nome só pode conter letras");
	          }

		    }
			
			modelo = JOptionPane.showInputDialog("Modelo: ");
			if(modelo.isEmpty()){
				throw new DescricaoEmBrancoException("Modelo em branco");
			}
			for (int i = 0; i < modelo.length(); i++) {
		          if (Character.isDigit(modelo.charAt(i))==true){
		        	  throw new ValorInvalidoException("O nome só pode conter letras");
		          }

			}
			
			anoFab = Integer.parseInt(JOptionPane.showInputDialog("Ano de Fabricacao: "));
			if(anoFab == 0){
				throw new DescricaoEmBrancoException("Ano de Fabricacao em branco");
			}
			
			anoMod = Integer.parseInt(JOptionPane.showInputDialog("Ano do Modelo: "));
			if(anoMod == 0){
				throw new DescricaoEmBrancoException("ano do Modelo em branco");
			}
			
			motorizacao = Float.parseFloat(JOptionPane.showInputDialog("Motorizacao: "));
			if(motorizacao == 0){
				throw new DescricaoEmBrancoException("Motorizacao em branco");
			}
			
			tipoCombustivel = JOptionPane.showInputDialog("Tipo de Combustivel: ");
			if(tipoCombustivel.isEmpty()){
				throw new DescricaoEmBrancoException("Tipo de combustivel em branco");
			}
			for (int i = 0; i < tipoCombustivel.length(); i++) {
		          if (Character.isDigit(tipoCombustivel.charAt(i))==true){
		        	  throw new ValorInvalidoException("O nome só pode conter letras");
		          }

			}
			
			cor = JOptionPane.showInputDialog("Cor: ");
			if(cor.isEmpty()){
				throw new DescricaoEmBrancoException("Cor em branco");
			}
			for (int i = 0; i < cor.length(); i++) {
		          if (Character.isDigit(cor.charAt(i))==true){
		        	  throw new ValorInvalidoException("O nome só pode conter letras");
		          }

			}
			
			
			placa = JOptionPane.showInputDialog("Placa: ");
			if(placa.isEmpty()){
				throw new DescricaoEmBrancoException("Placa em branco");
			}
			
			
			renavam = Integer.parseInt(JOptionPane.showInputDialog("Renavam: "));
			if(renavam == 0){
				throw new DescricaoEmBrancoException("Renavam em branco");
			}
			
			quilometragem = Float.parseFloat(JOptionPane.showInputDialog("Quilometragem do Veículo: "));	
			if(quilometragem == 0){
				throw new DescricaoEmBrancoException("Quilometragem em branco");
			}
			
	
			
		}
		catch(ValorInvalidoException e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
		catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
		
		
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	public int getAnoMod() {
		return anoMod;
	}
	public void setAnoMod(int anoMod) {
		this.anoMod = anoMod;
	}
	public int getRenavam() {
		return renavam;
	}
	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}
	public double getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}
	
	public float getQuilometragem() {
		return quilometragem;
	}
	
	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}
	
}
