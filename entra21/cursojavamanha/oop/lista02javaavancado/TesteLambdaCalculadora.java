package com.entra21.cursojavamanha.oop.lista02javaavancado;

import java.util.Scanner;

public class TesteLambdaCalculadora {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		boolean flag;

		do {
			double n1;
			double n2;
			int opcao;


			System.out.println("Digite o primeiro número");
			n1 = in.nextDouble();

			System.out.println("Digite o segundo número");
			n2 = in.nextDouble();

			System.out.println("Escolha a opção 1 - "
					+ OpcoesMenu.SOMAR
					+ " 2 - "
					+ OpcoesMenu.SUBTRAIR
					+ " 3 - "
					+ OpcoesMenu.MULTIPLICAR
					+ " 4 - "
					+ OpcoesMenu.DIVIDIR
					+ " 0 - "
					+ OpcoesMenu.SAIR);

			opcao = in.nextInt();
			flag = FazerOperacao(opcao, n1, n2);
			if(flag == false) {
				break;
			}

		}while(true);

	}

	public static boolean FazerOperacao (int opcao, double n1, double n2) {

		boolean t = true;
		switch (opcao) {

		case 1:
			double soma = Calculadora.calcular(n1, n2, (x,y) -> x + y);
			System.out.println(soma);
			break;

		case 2:
			double subtrair = Calculadora.calcular(n1, n2, (x,y) -> x - y);
			System.out.println(subtrair);
			break;

		case 3:
			double multiplicar = Calculadora.calcular(n1, n2, (x,y) -> x * y);
			System.out.println(multiplicar);
			break;

		case 4:
			double  dividir = Calculadora.calcular(n1, n2, (x,y) -> x / y);
			System.out.println(dividir);
			break;

		case 0:
			t = false;
		}
		return t;

	}
}


