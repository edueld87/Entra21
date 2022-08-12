package com.entra21.cursojavamanha.oop.exerciciopratica2;

import java.util.Scanner;

public class AlunoTeste {
	
	
	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
		ClasseAluno aluno01 = new ClasseAluno();
		
		aluno01.setNome("Eduardo");
		aluno01.setMatricula("125896");
		aluno01.setCurso("Ciências Econômicas");
		
		aluno01.infoAluno();
		aluno01.nomeDisciplinas();
		aluno01.notasDisciplinas();
		aluno01.mediaNotas();
		
		in.close();
	}

}