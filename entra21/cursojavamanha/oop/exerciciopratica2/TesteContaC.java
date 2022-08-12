package com.entra21.cursojavamanha.oop.exerciciopratica2;


import java.util.Scanner;

public class TesteContaC {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
		
		ContaCorrente conta01 = new ContaCorrente();
		conta01.setNumeroConta(123);
		conta01.setSaldoConta(500);
		conta01.setSaldoTotal(conta01.getSaldoTotal() + conta01.getSaldoConta());
		conta01.setStatus("especial");
		conta01.setLimite(1000);
		
				
		System.out.println(" Numero da conta: " +conta01.getNumeroConta());
		System.out.println(" Saldo Total: " +conta01.getSaldoTotal());
		System.out.println(" Status da conta: " +conta01.getStatus());
		System.out.println(" Limite: " +conta01.getLimite());
		conta01.obterSaldoConta();
		conta01.saqueConta();
		conta01.depositoConta();
		conta01.verificarUsoChequeEsp();
		
		in.close();

	}

}