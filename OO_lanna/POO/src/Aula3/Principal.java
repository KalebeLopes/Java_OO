package Aula3;

public class Principal {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic";
		c1.carga = 20;
		c1.tampar();		
		//c1.cor = "Verde";
		//c1.alterarCor("Azul");
		//c1.tampada = true; 
		//c1.status();
		//c1.rabiscar();
		
		c1.setModelo("BIC");
		c1.setPonta(0.6f);
		System.out.println("Modelo: " + c1.getModelo());
		c1.status();
		
		System.out.println("--------");
		Caneta c2 = new Caneta("Compacto", "Verde", 0.7f);
		
		c2.status();
		 
		
	}

}
