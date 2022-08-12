package com.entra21.cursojavamanha.oop.exerciciopratica2;

public class Curso {
	
	private String codigo;
	private String nome;
	private int duracao;
	
	
	Curso() {
		
	}
	
	public Curso(String codigo, String nome, int duracao) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	

}
