package Final;

public class Proprietario {
	
	private String nome;
	int i = 0;
	
	Veiculo[] v = new Veiculo[10];
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public void cadastrarVeiculo(int q, Veiculo vei){
		v[q] = vei;
		
	}
	
//	public void cadastrarVeiculo(int q, String marca, String modelo, int anoFab, int anoMod, float motorizacao, 
//								 String tipoCombustivel, String cor, String placa, int renavam, float quilometragem) {
//			
//			v[q] = new Veiculo();
//			
//			//System.out.println(q);
//			v[q].setMarca(marca);
//			v[q].setModelo(modelo);
//			v[q].setAnoFab(anoFab);
//			v[q].setAnoMod(anoMod);
//			v[q].setMotorizacao(motorizacao);
//			v[q].setTipoCombustivel(tipoCombustivel);
//			v[q].setCor(cor);
//			v[q].setPlaca(placa);
//			v[q].setRenavam(renavam);
//			v[q].setQuilometragem(quilometragem);
//		
//		
//	}
	public int nm = 0;
	public void cadastrarManu(int vei, String nomeDespesa, String data, float valorTotal, float quilometragem) {
			
			for (i = 0 ; i < 1000 ; i++) {
				if (v[vei].m[i] == null) {
					v[vei].m[i] = new Manutencao();
					
					v[vei].m[i].setNomeDespesa(nomeDespesa);
					v[vei].m[i].setData(data);
					v[vei].m[i].setValorTotal(valorTotal);
					v[vei].m[i].setQuilometragem(quilometragem);
					
					nm = nm +1;
					break;
					
				}
			}
	}
	
	
	public void cadastrarAbs(int vei, String nomeDespesa, String data, float valorTotal, int tanqueCheio, 
							float valorLitro, String tipoAbastecido, float odometro) {
		
			for (i = 0 ; i < 1000 ; i++) {
				if (v[vei].a[i] == null) {
					v[vei].a[i] = new Abastecimento();
					
					v[vei].a[i].setNomeDespesa(nomeDespesa);
					v[vei].a[i].setData(data);
					v[vei].a[i].setValorTotal(valorTotal);
					
					v[vei].a[i].setTanqueCheio(tanqueCheio);
					v[vei].a[i].setValorLitro(valorLitro);
					v[vei].a[i].setTipoAbastecido(tipoAbastecido);
					v[vei].a[i].setOdometro(odometro);;
					break;
					
				}
			}	
	}
	
	public void cadastrarTaxa(int vei, String nomeDespesa, String data, float valorTotal, int ano) {
		
		for (i = 0 ; i < 1000 ; i++) {
			if (v[vei].t[i] == null) {
				v[vei].t[i] = new Taxas();
				
				v[vei].t[i].setNomeDespesa(nomeDespesa);
				v[vei].t[i].setData(data);
				v[vei].t[i].setValorTotal(valorTotal);
				v[vei].t[i].setAno(ano);
				break;
				
			}
		}	
	}
	

}
