package lista1;

public class Quadrado {
	float lado, 
		  area, 
		  perimetro;
	
	
	Quadrado(){
		
	}
	
	Quadrado(float l){
		this.lado = l;
		}
	
	float calcArea(){
		this.area = this.lado * this.lado;
		return this.area;
	}
	
	float calcPerimetro() {
		this.perimetro = this.lado * 4;
		return this.perimetro;
	}
	
	void imprimir() {
		//String resposta;
		System.out.println("Lado: " + this.lado);
		System.out.println("Area: " + this.area);
		System.out.println("Perimetro: " + this.perimetro);
		//return resposta;
		
	}
	
	
	
}
