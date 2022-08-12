package com.entra21.cursojavamanha.oop.exerciciopratica2;

import java.util.Scanner;

public class JogoDaVelhaTeste {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);

		ClasseJogoDaVelha jogoDaVelha = new ClasseJogoDaVelha();
		
		System.out.println("Começou o Jogo!! ");
		System.out.println("Player 1: X ");
		System.out.println("Player 2: O ");

		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {

			if (jogoDaVelha.vezPlayer1()) {

				System.out.println("\nPlayer 1: Escolha linha e coluna (1 até 3) ");
				sinal = 'X';
			} else {

				System.out.println("\nPlayer 2: Escolha linha e coluna (1 até 3) ");
				sinal = 'O';
			}



			boolean linhavalida = false;
			while (!linhavalida) {
				System.out.println("Informe a linha | 1 | ");
				System.out.println("Informe a linha | 2 | ");
				System.out.println("Informe a linha | 3 | ");
				linha = in.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhavalida = true;
				} else {
					System.out.println("Informação inválida, informar uma opção válida!!");
				}
			}

			boolean colunavalida = false;
			while (!colunavalida) {
				System.out.println("Informe a coluna | 1 | 2 | 3 | ");
				coluna = in.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunavalida = true;
				} else {
					System.out.println("Informação inválida, informar uma opção válida!!");

				}
			}
			linha--;
			coluna--;

			if (!jogoDaVelha.validarJogada(linha, coluna, sinal)){
				System.out.println("\nPosição já informado, por gentileza escolha outra posição!!");
			}

			jogoDaVelha.imprimirTabuleiro();

			if (jogoDaVelha.verificarGanhador('X')){
				ganhou = true;
				System.out.println("Parabéns Player 1 ganhou!");
			} else if (jogoDaVelha.verificarGanhador('O')){
				ganhou = true;
				System.out.println("Parabéns Player 2 ganhou!");
			} else if (jogoDaVelha.getJogada() > 7){
				ganhou = true;
				System.out.println("Houve Impate!");
			}
			
		}
	}
	
	
	 int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente");
			}
			
		}
		valor--;
		return valor;
		
	}
 
}


