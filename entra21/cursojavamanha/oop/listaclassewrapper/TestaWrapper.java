package com.entra21.cursojavamanha.oop.listaclassewrapper;

public class TestaWrapper {

	public static void main(String[] args) {
		
		String numInt = "9822";
		
		//Representa��o em String do tipo que est� sendo criado
		Float fNum1 = new Float("500.50");
		Integer iNum1 = new Integer(numInt);
		Double dNum1 = new Double("512.22");
		
		//o argumento somente aceita do tipo char, por isso que � usado aspas simples
		Character cNum = new Character('a');
		
		//Cria��o do tipo primitivo natural
		Float fNum2 = new Float(500.50);
		Integer iNum2 = new Integer(2800);
		Double dNum2 = new Double(512.22);
		
		System.out.println("Float representadopor string: "+fNum1);
		System.out.println("Float natural: "+fNum2);
		System.out.println("Integer representado por string: "+iNum1);
		System.out.println("Char: "+cNum);
		

	}

}
