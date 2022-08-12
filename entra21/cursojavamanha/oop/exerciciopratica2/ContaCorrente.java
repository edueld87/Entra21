package com.entra21.cursojavamanha.oop.exerciciopratica2;

import java.util.Scanner;

public class ContaCorrente {
	
	Scanner in = new Scanner(System.in);

	private	int numeroConta;
	private	double saldoConta;
	private	double saldoTotal;
	private	String status;
	private	double limite;
	private	double deposito;
	private double saque;

	public ContaCorrente() {

	}


	public ContaCorrente(Scanner in, int numeroConta, double saldoConta, double saldoTotal, String status,
			double limite, double deposito, double saque) {
		
		this.in = in;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.saldoTotal = saldoTotal;
		this.status = status;
		this.limite = limite;
		this.deposito = deposito;
		this.saque = saque;
		
	}


	public ContaCorrente(int numeroConta, double saldoConta) { //sobrecarga de contrutor
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldoConta() {
		return saldoConta;
	}


	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}


	public double getSaldoTotal() {
		return saldoTotal;
	}


	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public double getDeposito() {
		return deposito;
	}


	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}


	public double getSaque() {
		return saque;
	}


	public void setSaque(double saque) {
		this.saque = saque;
	}



	



	/*void saqueConta() {
		if (saldoConta > 0) {
			System.out.println("Você pode realizar o saque de R$" +saldoConta);
		} else if 
			(saldoConta < 0) {
			System.out.println("Você não pode realizar o saque de R$");
		}*/

	public double obterSaldoConta() {
		//System.out.println("================================================");
		//System.out.println(" Saldo R$ " +saldoConta);
		saldoTotal = saldoConta + limite;
		System.out.println(" Limite de crédito disponível R$ " +limite);
		System.out.println(" Valor total para saque R$ " +saldoTotal );
		System.out.println(" Conta do tipo " +status);
		System.out.println("================================================");
		return 	saldoTotal;

	}


	public void saqueConta() {
		System.out.println("================================================");
		System.out.println(" Informe o valor do saque ");
		saque = in.nextDouble();
		if (saque > saldoTotal) {
			System.out.println(" O saque não poderá ser realizado, saldo insuficiente");
		} else if (saque <= saldoTotal) {
			saldoTotal = saldoTotal - saque;
			System.out.println(" O saque foi efetuado. Novo saldo " +saldoTotal);
			System.out.println("================================================");


		}
	}

	public void depositoConta() {
		System.out.println("================================================");
		System.out.println(" Informe o valor a depositar ");
		deposito = in.nextDouble();
		System.out.println(" O deposito de " +deposito+ " foi realizado com sucesso");
		saldoTotal += deposito;
		System.out.println("Novo saldo: " +saldoTotal);
		System.out.println("================================================");
		in.close();	
	}



	public void verificarUsoChequeEsp() {
		if (saldoTotal > limite) {
			System.out.println(" Não está usando cheque especial ");
		} else {
			limite = saldoTotal - limite;
			System.out.println(" Está usando cheque especial " +limite);

		}

	}

}