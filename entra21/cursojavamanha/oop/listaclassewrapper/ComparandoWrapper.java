package com.entra21.cursojavamanha.oop.listaclassewrapper;

public class ComparandoWrapper {

	public static void main(String[] args) {
		
		int num1 = 21;
		double num2 = 21.0;
		Double num3 = new Double(282.22);
		Integer num4 = new Integer(232);
		System.out.println(num1 == num2); //true
		System.out.println(num3 == num4); //erro de compila��o 
		System.out.println(num1 == num3); //false
		System.out.println(num4.equals(num2)); //false
	}

}
