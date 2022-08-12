package com.entra21.cursojavamanha.oop.listaclassewrapper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteException2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean continueLoop = true;
		int resp;
		
		do {
		try {
		System.out.println(" Eu sei dividir ");
		System.out.println("Informe o primeiro valor: ");
		int x = in.nextInt();
		System.out.println("informe o segundo valor: ");
		int y = in.nextInt();
		double r =(x / y);
		System.out.println(" O Resultado da divisão é" + r);
		continueLoop = false;

	}
				
		catch (InputMismatchException e) {
			System.out.println(" Você deverá informa número, não letra!");
			System.out.println(" Deseja iniciar novamente? (1) Sim ou (2) não ?");
			resp = in.nextInt();
			if (resp == 1) {
				continueLoop = true;
			}
			
		}
		
		catch (ArithmeticException e) {
			System.out.println(" Não poderá ser dividido por zero, escolha outro número");
			continueLoop = true;
		}
		
		//System.out.println("deseja repetir a operação? ");
		
	}while(continueLoop);
}
}