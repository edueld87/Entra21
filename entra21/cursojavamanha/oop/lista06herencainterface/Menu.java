package com.entra21.cursojavamanha.oop.lista06herencainterface;

public enum Menu {
	
	CADASTRAR_PROJETO(1), INSERIR_PROFESSOR(2), INSERIR_ALUNO(3), SAIR(4);
	
	private final int valor;
	Menu(int valorOpcao) {
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}

}
