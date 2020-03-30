package lista2;

public class Pessoa {
	
	String nome;
	float altura, peso;
		
		//Pessoa(String nome, float altura, float peso){
		//	this.nome = nome;
		//	this.altura = altura;
		//	this.peso = peso;
		//}
		
		Pessoa(){
			
		}
		
		float calcImc(){
			return (this.peso/ (this.altura * this.altura)); //IMC
		}
		
		void print() {
			System.out.println("Nome: " + this.nome);
			System.out.println("Altura: " + this.altura);
			System.out.println("Peso : " + this.peso);
		}
		
}