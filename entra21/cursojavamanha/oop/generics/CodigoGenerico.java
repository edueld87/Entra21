package com.entra21.cursojavamanha.oop.generics;

public class CodigoGenerico <T> {

	private String codigo;

	public CodigoGenerico(String cod, long sequencial) {
		
		codigo = cod + Long.valueOf(sequencial).toString(); //concatenar string com número, tudo virando String.
	}
}
