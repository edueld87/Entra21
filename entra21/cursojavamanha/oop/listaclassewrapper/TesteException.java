package com.entra21.cursojavamanha.oop.listaclassewrapper;

public class TesteException {

	public static void main(String[] args) {
		
		System.out.println("Inicio do Main");
		metodo1();
		System.out.println("Fim do Main");

	}
	
	static void metodo1() {
		System.out.println("inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	
	static void metodo2() {
		try {
		System.out.println("inicio do metodo 2");
		int[] array = new int[10];
		for(int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
	
	}
		catch (ArrayIndexOutOfBoundsException e) {
			int[] array = new int[15];
			for(int i = 0; i < 15; i++) {
				array[i] = i;
				System.out.println(i);
				
		}
		System.out.println("O numero de array foi reduzido para não dar erro no array, do 10 para 15");	
		System.out.println("Fim do metodo 2");
	}

}
}