package model;

import interfaces.interfaceConstrucao;

public abstract class Imovel implements interfaceConstrucao{
	
	protected int matricula;
	private String nome;
	private String tipo;
	private String endereco;
	private double preco;
	
	private double calArea;
	private String descricao;
	
	public Imovel(int matricula, String nome, String tipo, String endereco, double preco) {
		this.matricula = matricula;
		this.nome = nome;
		this.tipo = tipo;
		this.endereco = endereco;
		this.preco = preco;
		this.calArea = 0;
		this.descricao="";		
	}
	
	public abstract double calcularAreaInterface(double largura, double comprimento);
	public abstract String descricaoInterface(String descricao);
	
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getCalArea() {
		return calArea;
	}

	public void setCalArea(double calArea) {
		this.calArea = calArea;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	

	
	
	
	
	
	
}
