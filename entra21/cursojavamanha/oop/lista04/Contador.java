package com.entra21.cursojavamanha.oop.lista04;

public class Contador {
	
	static int cont;
	
	
	public Contador() {
		cont++;		
	}


	public static int getCont() {
		return cont;
	}


	public static void setCont(int cont) {
		Contador.cont = cont;
	}
	
	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont=0;
	}
	
	public static int retornarValor() {
		return cont;
	}
		
}
