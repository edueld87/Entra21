package com.entra21.cursojavamanha.oop.exerciciopratica;

public class TesteClassesEx1 {

	public static void main(String[] args) {
		
		
		Q01 lampada = new Q01();
		lampada.marca = "Tachibra";
		lampada.modelo = "Led";
		lampada.compatibilidade = "Smart";
		lampada.cor = "Branca";
		lampada.garantia = "1 ano";
		lampada.potencia = 9;
		
		System.out.println("Marca= " +lampada.marca);
		System.out.println("Modelo= " +lampada.modelo);
		System.out.println("Compatibilidade= " +lampada.compatibilidade);
		System.out.println("Cor da lâmpada= " +lampada.garantia);
		System.out.println("Potencia= " +lampada.potencia);
		
	}

}
