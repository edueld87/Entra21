package com.entra21.cursojavamanha.oop.generics;

public class Codigo {
	
	private String codigo;

	public Codigo(String cod, long sequencial) {

		codigo = cod + Long.valueOf(sequencial).toString(); //concatenar string com número, tudo virando String.
	}

	@Override
	public String toString() {
		return "" + codigo;

	}
}	
