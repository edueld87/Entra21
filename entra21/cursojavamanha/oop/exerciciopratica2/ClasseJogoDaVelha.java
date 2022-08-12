package com.entra21.cursojavamanha.oop.exerciciopratica2;

import java.util.Scanner;

public class ClasseJogoDaVelha {
	
	Scanner in = new Scanner(System.in);

	private char[][] tabuleiro = new char[3][3];
    private int jogada = 1;
    

    ClasseJogoDaVelha() {
    	
    }

    public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	boolean validarJogada(int linha, int coluna, char sinal) {

        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
            return false;

        } else { //jogada válida
        	tabuleiro[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    void imprimirTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char sinal) {
        if ((tabuleiro[0][0] == sinal && tabuleiro[0][1] == sinal && tabuleiro[0][2] == sinal) || //linha 1
                (tabuleiro[1][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[1][2] == sinal) || //linha 2
                (tabuleiro[2][0] == sinal && tabuleiro[2][1] == sinal && tabuleiro[2][2] == sinal) || //linha 3
                (tabuleiro[0][0] == sinal && tabuleiro[1][0] == sinal && tabuleiro[2][0] == sinal) || //coluna 1
                (tabuleiro[0][1] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][1] == sinal) || //coluna 2
                (tabuleiro[0][2] == sinal && tabuleiro[1][2] == sinal && tabuleiro[2][2] == sinal) || //coluna 3
                (tabuleiro[0][0] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][2] == sinal) || //diagonal
                (tabuleiro[0][2] == sinal && tabuleiro[1][1] == sinal && tabuleiro[2][0] == sinal)) {  //diagonal inversa
            return true;
        }
        return false;
    }
    
    boolean vezPlayer1(){
        if (jogada % 2 == 1){
            return true;
        }
        return false;
    }
}


