package Pizzaria;

import java.util.HashMap;

public class Pizza {
	
	public static HashMap<String, Integer> contabiliza = new HashMap<String, Integer>();	// Array list 
	public static int totalIngrediente = 0;
	
	int ingredientePizza = 0;
	
	public static void zeraQtdingredientes() {
		totalIngrediente = 0;
	}
	
	public static void zeraIngredientes() {
		contabiliza.clear();
	}
	
	public static void contabilizaIngrediente(String ingrediente) {		
		if (contabiliza.get(ingrediente) == null) 
			contabiliza.put(ingrediente, 1);
		
		else
			contabiliza.put(ingrediente, (contabiliza.get(ingrediente) + 1));	
		
		totalIngrediente += 1;
	}
	
	public void adicionaIngrediente(String ingrediente){
		
		ingredientePizza++;
		
		contabilizaIngrediente(ingrediente);
		
	}
	
	public int getPreco(){
		
		if (ingredientePizza <= 2)
			return 15;
		
		else if (ingredientePizza > 2 && ingredientePizza <= 5)
			return 20;
		
		else
			return 23;
		
	}
	
}
