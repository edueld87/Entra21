package com.entra21.cursojavamanha.oop.exerciciopratica2;

import java.util.Scanner;

public class Funcionarios {
	
	Scanner in = new Scanner(System.in);
	
	String nome;
	String endereco;
	String telefone;
	String cpf;
	String ctps;
	double salario;
	
	void informarFuncionario() {
		System.out.println("Informe o nome do funcionario");
		nome = in.next();
		System.out.println("Informe o endereço");
		endereco = in.next();
		System.out.println("Informe o telefone do funcionario");
		telefone = in.next();
		System.out.println("Informe o cpf do funcionario");
		cpf = in.next();
		System.out.println("Informe a CTPS do funcionario");
		ctps = in.next();
		System.out.println("Informe salario do funcionario");
		salario = in.nextDouble();
	}
	
	void imprimirInfo() {
		System.out.println(" nome " +nome );
		System.out.println(" endereço " +endereco);
		System.out.println(" telefone " +telefone);
		System.out.println(" cpf " +cpf);
		System.out.println(" ctps " +ctps);
		System.out.println(" salario " +salario);
		
	}
}
