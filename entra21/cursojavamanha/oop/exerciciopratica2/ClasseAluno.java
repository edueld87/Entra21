package com.entra21.cursojavamanha.oop.exerciciopratica2;

import java.util.Scanner;

public class ClasseAluno {
	
	Scanner in = new Scanner(System.in);

	private String nome;
	private String matricula;
	private String curso;
	private double[][] notas = new double [3][3];
	private String[] materias = new String [3];

	
	ClasseAluno() {
		
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public double[][] getNotas() {
		return notas;
	}


	public void setNotas(double[][] notas) {
		this.notas = notas;
	}


	public String[] getMaterias() {
		return materias;
	}


	public void setMaterias(String[] materias) {
		this.materias = materias;
	}


	void infoAluno() {
		System.out.println(" Nome do Aluno: " +nome);
		System.out.println(" Matricula do: " +nome+ " / " +matricula);
		System.out.println(" Curso do: " +nome+ " / " +curso);
	}


	void nomeDisciplinas() {
		for (int i =0; i < materias.length; i++) {
			System.out.println(" informe o nome da matéria " );
			materias[i] = in.next();

		}
	}

	void notasDisciplinas() {
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.println(" informe a nota da matérias " +materias[i]);
				notas[i][j] = in.nextDouble();

			}	
		}
	}
	void mediaNotas() { 

		
		for( int i = 0; i < notas.length; i++) {
			double media = 0;
			double soma =0;
			for(int j = 0; j < notas[i].length; j++) {
				soma += notas[i][j];
			}
			 media = soma / 3;
			if (media >= 7) {
				System.out.println(" Aprovado na matéria " +materias[i]);
				//return true;
			} else {
				System.out.println(" Reprovado na matéria " +materias[i]);
				//return false;
			}
		}
	}

}			
				
				
				
				/*for(int j = 0; j < notas[i].length; j++) {
			double media1 = (notas[0][0] + notas[0][1] + notas[0][2]) / 3;
			if (media1 >= 7) {
				System.out.print(" Aprovado na materia " +notas[i]);
			} else {
				System.out.print(" Reprovado na materia " +notas[i]);
			}
			double media2 = (notas[1][0] + notas[1][1] + notas[1][2]) / 3;
			if (media2 >= 7) {
				System.out.print(" Aprovado na materia " +notas[i]);
			} else {
				System.out.print(" Reprovado na materia " +notas[i]);
			double media3 = (notas[2][0] + notas[2][1] + notas[2][2]) / 3;
			if (media3 >= 7) {
				System.out.print(" Aprovado na materia " +notas[i]);
			}  else {
				System.out.print(" Reprovado na materia " +notas[i]);*/
			
	

		
