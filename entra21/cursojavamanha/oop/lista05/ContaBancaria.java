package com.entra21.cursojavamanha.oop.lista05;

import java.util.Scanner;

public class ContaBancaria {
	
	Scanner in = new Scanner(System.in);
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	private	double saldoConta;
	private	double saldoTotal;
	private double limite;
	private String status;
	private double saque;
	private double deposito;

	public ContaBancaria() {
		
	}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
	
		
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	
	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double obterSaldoConta() {
		System.out.println("================================================");
		System.out.println(" Saldo R$ " +saldoConta);
		saldoTotal = saldoConta + limite;
		System.out.println(" Limite de crédito disponível R$ " +limite);
		System.out.println(" Valor total para saque R$ " +saldoTotal );
		System.out.println(" Conta do tipo " +status);
		System.out.println("================================================");
		return saldoTotal;
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
	
	public double  depositoConta(double deposito) {
		saldoTotal += deposito;
		return saldoTotal;
}
}	
		