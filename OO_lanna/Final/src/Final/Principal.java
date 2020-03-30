package Final;


//import java.util.Scanner;

import javax.swing.JOptionPane;

import pacote2.*;


public class Principal {
	
	public static void main(String[] args) {
		
		//ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();
		
		//Scanner input = new Scanner(System.in);
		Proprietario p1 = new Proprietario();
	
		int anoFab, anoMod, renavam, q = 0, i, entrada, qtdm = 0, vei = 0, lis = 0, des = 0, iabs=0, anoDes, tq, a = 0;
		String marca, modelo, tipoCombustivel, cor, placa, nomDes, tipoC, dataDes;
		float motorizacao, coMed, odom, valL, valDes, quilo, quilometragem;
		//boolean ;
		
		
	do {
	
		entrada = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar novo veículo\n2 - Cadastrar Abastecimento\n3"
				+ " - Cadastrar Taxas\n4 - Cadastrar Manutencao\n5 - Relatório Simples\n6 - Relatório de Desempenho\n"
				+ "7 - Relatório custo km"
				+ "\n\n0 - Sair"));
		
		
		
//		System.out.print("| 1 - Cadastrar novo veículo	|	");
//		System.out.println("5 - Relatório Simples		|");
//		System.out.print("| 2 - Cadastrar Abastecimento	|	");
//		System.out.println("6 - Relatório de Desempenho	|");
//		System.out.print("| 3 - Cadastrar Taxas		|	");
//		System.out.println("				|");
//		System.out.print("| 4 - Cadastrar Manutencao	|");
//		System.out.println("					|");
//		System.out.print(" -----------------------------------------------------------------------");
//		System.out.println();
//		
//		entrada = input.nextInt();
		
		
		
	switch(entrada) {
			
		case 1 : // CADASTRAR VEICULO
					
//					System.out.println("Marca: "); marca = input.next();
//					System.out.println("Modelo: "); modelo = input.next();
//					System.out.println("Ano de fabricacao: "); anoFab = input.nextInt();
//					System.out.println("Ano do Modelo: "); anoMod = input.nextInt();
//					System.out.println("Motorizacao: "); motorizacao = input.nextFloat();
//					System.out.println("Tipo do Combustível: "); tipoCombustivel = input.next();
//					System.out.println("Cor: "); cor = input.next();
//					System.out.println("Placa: "); placa = input.next();
					//System.out.println("Renavam: "); renavam = input.nextInt();
					//System.out.println("Quilometragem: "); quilometragem = input.nextFloat();
//					
			p1.cadastrarVeiculo(q, new Veiculo());
					
					//p1.cadastrarVeiculo(q, marca, modelo, anoFab, anoMod, motorizacao, tipoCombustivel, cor, placa, renavam, quilometragem);
					
					//System.out.println(p1.v[q].getModelo());
					
			q = q + 1;
					
					// add veiculos na lista
					 //for (i=0;i<q;i++) {
					 //	listaDeVeiculos.add(p1.v[i]);
					 //}
					 
					// listaDeVeiculos.add();
					
			break;
				
		case 2 : // CADASTRAR ABASTECIMENTO
						
			try {
				
				vei = Integer.parseInt(JOptionPane.showInputDialog("Informe qual veículo deseja cadastrar o abastecimento: "));
				
				
				if (p1.v[vei] != null) {
					
					nomDes = JOptionPane.showInputDialog("Nome da Despesa: ");
					if(nomDes.isEmpty()){
						throw new DescricaoEmBrancoException("Nome da despesa em branco");
					}
					for (i = 0; i < nomDes.length(); i++) {
				          if (Character.isDigit(nomDes.charAt(i))==true){
				        	  throw new ValorInvalidoException("O nome só pode conter letras");
				          }

					}
					
					dataDes = JOptionPane.showInputDialog("Data da despesa: ");
					if(dataDes.isEmpty()){
						throw new DescricaoEmBrancoException("Data da despesa em branco");
					}
					
					valDes = Float.parseFloat(JOptionPane.showInputDialog("Valor total da despesa: "));
					if(valDes == 0 || valDes < 0){
						throw new ValorInvalidoException("Valor nao pode ser nulo ou negativo");
					}
					
					tq = JOptionPane.showConfirmDialog(null, "Tanque cheio: ");
//					if(tq == 0){
//						throw new DescricaoEmBrancoException("Tipo de abastecimento nao informado");
//					}
					
					valL = Float.parseFloat(JOptionPane.showInputDialog("Valor do litro do combustivel: "));
					if(valL == 0){
						throw new DescricaoEmBrancoException("Valor do litro em branco");
					}
					
					tipoC = JOptionPane.showInputDialog("Tipo de combustivel: ");
					if(tipoC.isEmpty()){
						throw new DescricaoEmBrancoException("Tipo de combustivel em branco");
					}
					
					for (i = 0; i < tipoC.length(); i++) {
				          if (Character.isDigit(tipoC.charAt(i))==true){
				        	  throw new ValorInvalidoException("O nome só pode conter letras");
				          }

					}
					
					if(!tipoC.equalsIgnoreCase(p1.v[vei].getTipoCombustivel())){
						if(p1.v[vei].getTipoCombustivel().equalsIgnoreCase("flex")) {
							//System.out.println("kalebe");
							if (!(tipoC.equalsIgnoreCase("alcool") || tipoC.equalsIgnoreCase("gasolina"))) {
							//	System.out.println("kalebe");
								throw new CombustívelIncompativelException("Tipo de combustível incompativel");
							}
							//else {
								//System.out.println("lopes");
							//	break;
							//}
						}
						else {
							throw new CombustívelIncompativelException("Tipo de combustível incompativel");
						}
					}
					
					odom = Float.parseFloat(JOptionPane.showInputDialog("Informe o km do odometro: "));
					if(odom == 0){
						throw new DescricaoEmBrancoException("Odometro em branco");
					}
					if(a>0) {
						if(odom < p1.v[vei].a[a-1].getOdometro()){
							throw new ValorInvalidoException("Valor do odometro nao pode ser menor que o anterior");
						}
					}
					if(odom <= p1.v[vei].getQuilometragem()) {
						throw new ValorInvalidoException("Valor do odometro nao pode ser menor que o valor cadastrado");
					}
					
					p1.cadastrarAbs(vei, nomDes, dataDes, valDes, tq, valL, tipoC, odom);
					a = a + 1;
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Veiculo " + vei + " nao foi cadastrado");
					break;
				}
			
			}
			
			catch(ValorInvalidoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}
			
			catch(CombustívelIncompativelException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}
		
			catch(DescricaoEmBrancoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}	
				
					
		break;
				

		case 3 : // CADASTRAR TAXAS

			try {
				
				vei = Integer.parseInt(JOptionPane.showInputDialog("Informe qual veículo deseja cadastrar a taxa: "));
				
				if (p1.v[vei]!= null) {
					
					nomDes = JOptionPane.showInputDialog("Nome da despesa: ");
					if(nomDes.isEmpty()){
						throw new DescricaoEmBrancoException("Nome da despesa em branco");
					}
					for (i = 0; i < nomDes.length(); i++) {
				          if (Character.isDigit(nomDes.charAt(i))==true){
				        	  throw new ValorInvalidoException("O nome só pode conter letras");
				          }

					}
					
					dataDes = JOptionPane.showInputDialog("Data da despesa: ");
					if(dataDes.isEmpty()){
						throw new DescricaoEmBrancoException("Data da despesa em branco");
					}
					
					valDes = Float.parseFloat(JOptionPane.showInputDialog("Valor da despesa: "));
					if(valDes == 0){
						throw new DescricaoEmBrancoException("Valor da despesa em branco");
					}
					
					anoDes = Integer.parseInt(JOptionPane.showInputDialog("Ano da despesa: "));
					if(anoDes == 0){
						throw new DescricaoEmBrancoException("Ano da despesa em branco");
					}
			
					p1.cadastrarTaxa(vei, nomDes, dataDes, valDes, anoDes);;
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Veiculo " + vei + " nao foi cadastrado");
					break;
				}
				
			}
			
			catch(DescricaoEmBrancoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch(ValorInvalidoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}
			
			
		break;
				
							
		case 4 : // CADASTRAR MANUTENCAO
			
		//	int vei = 0;
			try {
				
				vei = Integer.parseInt(JOptionPane.showInputDialog("Informe qual veículo deseja cadastrar a manutencao: "));
				
				if (p1.v[vei]!= null) {
					
					nomDes = JOptionPane.showInputDialog("Nome da despesa: ");
					if(nomDes.isEmpty()){
						throw new DescricaoEmBrancoException("Nome da despesa em branco");
					}
					for (i = 0; i < nomDes.length(); i++) {
				          if (Character.isDigit(nomDes.charAt(i))==true){
				        	  throw new ValorInvalidoException("O nome só pode conter letras");
				          }

					}
					
					dataDes = JOptionPane.showInputDialog("Data da despesa: ");
					if(dataDes.isEmpty()){
						throw new DescricaoEmBrancoException("Data da despesa em branco");
					}
					
					valDes = Float.parseFloat(JOptionPane.showInputDialog("Valor da despesa: "));
					if(valDes == 0){
						throw new DescricaoEmBrancoException("Valor da despesa em branco");
					}
					
					quilo = Float.parseFloat(JOptionPane.showInputDialog("Informe a quilometragem do veiculo: "));
					if(quilo == 0){
						throw new DescricaoEmBrancoException("Quilometragem do veiculo em branco");
					}
					if(quilo <= p1.v[vei].getQuilometragem()) {
						throw new ValorInvalidoException("Valor do odometro nao pode ser menor que o valor cadastrado");
					}
					
					p1.cadastrarManu(vei, nomDes, dataDes, valDes, quilo);
					
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Veiculo " + vei + " nao foi cadastrado");
					break;
				}
			}
			
			catch(DescricaoEmBrancoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			catch(ValorInvalidoException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				
			}
			
		break;
				
		case 5 : // RELATORIO SIMPLES
			
			
			
			lis = Integer.parseInt(JOptionPane.showInputDialog("Informe qual veículo a ser listado: "));
			
			
			if (p1.v[lis] != null) {
				for(i = 0 ; i < 100 ; i++) {
					
					
					if (p1.v[lis].m[i] != null) {
						
						p1.v[lis].m[i].detalheManutencao();	
						
					}
				
				}
	
				for(i = 0 ; i < 100 ; i++) {	
					if (p1.v[lis].a[i] != null) {
						
						p1.v[lis].a[i].detalheAbastecimento();	
						
					}
				}
				
				for(i = 0 ; i < 100 ; i++) {
					
					if (p1.v[lis].t[i] != null) {
						
						p1.v[lis].t[i].detalheTaxa();
						
					}	
				}
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Veiculo " + lis + " nao foi cadastrado");
				break;
			}
			
		break;
		
		case 6 : // RELATORIO DE DESEMPENHO
			
			des = Integer.parseInt(JOptionPane.showInputDialog("Informe o veículo para cálculo do consumo médio: "));
			
			if (p1.v[des]!= null) {
				
				iabs = Integer.parseInt(JOptionPane.showInputDialog("Informe o o índice do abastecimento: (índice maior ou igual a 1)"));
				
				//for (i = iabs ; i < 1000 ; i++) {
					
					if ((p1.v[des].a[iabs] != null) && (iabs >= 1)) { 
						
						if (p1.v[des].a[iabs].getTanqueCheio() == 0 && p1.v[des].a[iabs-1].getTanqueCheio() == 0) {
							coMed = p1.v[des].a[iabs].getOdometro() - p1.v[des].a[iabs-1].getOdometro();
							coMed = coMed / (p1.v[des].a[iabs].getValorTotal() / p1.v[des].a[iabs].getValorLitro());
							JOptionPane.showMessageDialog(null, "Consumo médio do abastecimento: " + iabs+": " + coMed + " Litros/Km");
	
						}
						
						else {
							JOptionPane.showMessageDialog(null, "Abastecimento anterior nao foi tanque cheio");
						}

					}
					
					else {
						JOptionPane.showMessageDialog(null, "Consumo médio nao pode ser calculado");
					}
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Veiculo " + des + " nao foi cadastrado");
				break;
			}
				
		break;
				
		case 7 : // RELATORIO CUSTO KM
			
			try {
			float valor = 0, qui = 0;
			
			
			lis = Integer.parseInt(JOptionPane.showInputDialog("Informe o veículo para cálculo do custo KM: "));
			
			if (p1.v[lis]!= null) {
				qui = Float.parseFloat(JOptionPane.showInputDialog("Informe a quilometragem: "));
				
					if (qui < p1.v[lis].getQuilometragem()) {
						throw new ValorInvalidoException("Valor do odometro nao pode ser menor que o valor cadastrado");
					}
				
				for(i = 0 ; i < 100 ; i++) {
										
					if (p1.v[lis].m[i] != null) {
						
						valor = valor + p1.v[lis].m[i].getValorTotal();
						
					}
							
					if (p1.v[lis].a[i] != null) {
						
						valor = valor + p1.v[lis].a[i].getValorTotal();	
						
					}						
					
					if (p1.v[lis].t[i] != null) {
						
						valor = valor + p1.v[lis].t[i].getValorTotal();
						
					}

				}
				
				qui = qui - p1.v[lis].getQuilometragem();
				JOptionPane.showMessageDialog(null,"Valor KM: " + valor/qui + " R$");
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Veiculo " + lis + " nao foi cadastrado");
				break;
			}
			
		break;
		}
		
		catch(ValorInvalidoException e) {
		
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
			
	}
	
			
	} while (entrada != 0);
	

  }
}