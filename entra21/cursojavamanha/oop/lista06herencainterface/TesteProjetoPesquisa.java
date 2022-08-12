package com.entra21.cursojavamanha.oop.lista06herencainterface;

import java.util.Scanner;
import java.time.LocalDate;

public class TesteProjetoPesquisa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Professor prof = new Professor();
		String m_codigo;
		String m_titulo;
		LocalDate m_dtInicio;
		LocalDate m_dtFim;
		String m_profRes;
		int opcao;
		boolean flag;
		
		
		
		
		do {
			ProjetoPesquisa proj = new ProjetoPesquisa();
			System.out.println(" Informe a opção que gostaria de fazer");
			System.out.println(" Opção 1 " +Menu.CADASTRAR_PROJETO);
			System.out.println(" Opção 2 " +Menu.INSERIR_PROFESSOR);
			System.out.println(" Opção 3 " +Menu.INSERIR_ALUNO);
			System.out.println(" Opção 4 " +Menu.SAIR);
			opcao = in.nextInt();
			
			if (opcao == 1) {
				System.out.println("Informe o código do projeto:");
				proj.setCodigo(m_codigo);
				
			}
			
//			flag = FazerOperacao(opcao);
//			if(flag == false) {
//				break;
		} while (true);
		

	}

}
