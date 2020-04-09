package Pizzaria;

import java.util.HashMap;

public class Pizza {
	
	static HashMap<String, Integer> contabiliza = new HashMap<String, Integer>();
	static int totalIngrediente = 0;
	
	int ingredientePizza = 0;
	
	static void contabilizaIngrediente(String ingrediente) {
		
		if (contabiliza.get(ingrediente) == null) {
			contabiliza.put(ingrediente, 1);
			totalIngrediente++;
		}
			
		else
			contabiliza.put(ingrediente, (contabiliza.get(ingrediente) + 1));
		
	}
	
	void adicionaIngrediente(String ingrediente){
		
		ingredientePizza++;
		
		contabilizaIngrediente(ingrediente);
		
	}
	
	int getPreco(){
		
		if (ingredientePizza <= 2)
			return 15;
		
		else if (ingredientePizza > 2 && ingredientePizza <= 5)
			return 20;
		
		else
			return 23;
		
	}
	
}
