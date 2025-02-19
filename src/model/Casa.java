package model;

public class Casa extends Imovel {

	public Casa(int matricula, String nome, String tipo, String endereco, double preco) {
		super(matricula, nome, tipo, endereco, preco);
	}

	@Override
	public double calcularAreaInterface(double largura, double comprimento) {
	    if (largura <= 0 || comprimento <= 0) {
	        throw new IllegalArgumentException("Largura e comprimento devem ser maiores que zero.");
	    }
	    // Cálculo da área (m²) = Largura (m) x Comprimento (m)
	    double areaCalculada = largura * comprimento;
	    this.setCalArea(areaCalculada);
	    
	    return this.getCalArea();
	}
	
	

	@Override
	public String descricaoInterface(String descricao) {
		this.setDescricao(descricao);
		return getDescricao();
	}

	@Override
	public String toString() {
		return "CASA \n\nMatricula - " + getMatricula() + "\nTipo de edificação - " + getTipo() + "\nEndereço - "
				+ getEndereco() + "\nValor do imóvel - " + getPreco() + "\nÁrea do terreno - " + getCalArea()
				+ "\nDescrição do imóvel - " + getDescricao();
	}

}
