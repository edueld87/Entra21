package com.entra21.cursojavamanha.oop.lista05;

import java.util.Scanner;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setSaldoConta(500);
		conta.setLimite(300);
		conta.setSaldoTotal(conta.getSaldoConta() + conta.getLimite());
		
		
		System.out.println("|=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
		System.out.println("|xxxxxxxxxxxxxxxxxxxx MENU DA CONTA - BANCO ABC xxxxxxxxxxxxxxxxxxx|");
		System.out.println("|=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+|");
		
		
		System.out.println();
		System.out.println("Informe qual operação gostaria de realizar: ");
		System.out.println("============================================");
		System.out.println("(1) verificar a situação da conta");
		System.out.println("(2) sacar ");
		System.out.println("(3) depositar");
		System.out.println("(4) mostrar rendimento da conta poupanca");
		System.out.println("===============Conta poupança===============");
		System.out.println("(5) depositar na poupança");
		System.out.println("(6) sacar da poupança");
		System.out.println("(7) verificar saldo poupança");
		System.out.println("============================================");
		System.out.println("(0) encerrar o sistema");
		int operacao = in.nextInt();
		
				
		if (operacao == 1) {
		System.out.println("================================================");
		System.out.println("Saldo R$ " +conta.getSaldoConta());
		System.out.println("Limite de crédito disponível R$ " +conta.getLimite());
		System.out.println("Conta do tipo " +conta.getStatus());
		System.out.println("Valor total para saque R$ " +conta.getSaldoTotal() );
		System.out.println("================================================");
		}
		
		if (operacao == 2) {
		System.out.println("================================================");
		System.out.println("Valor total para saque R$ " +conta.getSaldoTotal() );
		System.out.println(" Informe o valor do saque ");
		double saque = in.nextDouble();
		if (saque > conta.getSaldoTotal()) {
		System.out.println(" O saque não poderá ser realizado, saldo insuficiente");
		} else if (saque <= conta.getSaldoConta()) {
		conta.setSaldoTotal(conta.getSaldoTotal() - saque);
		System.out.println(" O saque foi efetuado. Novo saldo " +conta.getSaldoTotal());
		System.out.println("================================================");	
		}

	}

		if (operacao == 3) {
			System.out.println("================================================");
			System.out.println(" Informe o valor a depositar ");
			double deposito = in.nextDouble();
			System.out.println(conta.depositoConta(deposito));
			System.out.println("Novo saldo da conta: " +conta.getSaldoTotal());
//		System.out.println("================================================");
//		System.out.println(" Informe o valor a depositar ");
//		double deposito = in.nextDouble();
//		conta.setSaldoConta() = conta.setSaldoConta() + deposito;
//		System.out.println(" O deposito de " +deposito+ " foi realizado com sucesso");
//		System.out.println("Novo saldo: " +conta.getSaldoConta());
//		System.out.println("================================================");
		
		}
}
}
