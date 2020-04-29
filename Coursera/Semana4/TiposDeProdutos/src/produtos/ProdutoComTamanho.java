package produtos;

public class ProdutoComTamanho extends Produto{

	int numeracao;
	
	public ProdutoComTamanho(String nome, int codigo, float preco, int numeracao){
		super(nome, codigo, preco);
		this.numeracao = numeracao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeracao + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (codigo == other.codigo && numeracao != other.numeracao)
			return false;
		return true;
	}
	
	
}
