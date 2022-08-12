package com.entra21.cursojavamanha.oop.lista04;

public class ContadorTeste {

	public static void main(String[] args) {
		
		System.out.println(Contador.retornarValor());
		Contador.incrementar();
		System.out.println(Contador.retornarValor());
		Contador.zerar();
		System.out.println(Contador.retornarValor());
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
	
		System.out.println(Contador.retornarValor());
	
		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
	
	System.out.println(Contador.retornarValor());


	}

}
