package OO;
	
public class Principal {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 80;
		c1.destampar();
		c1.status();
		c1.rabiscar();

		
		Caneta c2 = new Caneta("Compacto", "verde", 0.7f, 100, true);
		
		System.out.println("c2" + c2.modelo);
		
		
	}
	

}
