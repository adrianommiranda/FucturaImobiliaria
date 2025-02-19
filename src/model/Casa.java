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
	    // C�lculo da �rea (m�) = Largura (m) x Comprimento (m)
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
		return "CASA \n\nMatricula - " + getMatricula() + "\nTipo de edifica��o - " + getTipo() + "\nEndere�o - "
				+ getEndereco() + "\nValor do im�vel - " + getPreco() + "\n�rea do terreno - " + getCalArea()
				+ "\nDescri��o do im�vel - " + getDescricao();
	}

}
