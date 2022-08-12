package com.entra21.cursojavamanha.oop.exerciciopratica2;

import java.util.Scanner;

public class ContaDeLuzTeste {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ClasseContaDeLuz conta = new ClasseContaDeLuz();
		
		conta.setDataLeitura("0");
		conta.setNumeroLeitura(0); 
		conta.setKwGasto(0);
		conta.setValorPagar(0);
		conta.setDataPagamento("0");
		conta.setMediaConsumo(0);
		
		
		System.out.println("Informe a data da Leitura");
		String data = in.next();
		conta.setDataLeitura(data);
		
		System.out.println("Informe o numero da Leitura");
		double numer = in.nextDouble();
		conta.setNumeroLeitura(numer);
		
		System.out.println("Informe o kw gasto");
		double kwgasto = in.nextDouble();
		conta.setKwGasto(kwgasto);
		
		System.out.println("Informe o valor a Pagar");
		double valorr = in.nextDouble();
		conta.setValorPagar(valorr);
		
		System.out.println("Informe a data do Pagamento");
		String datap = in.next();
		conta.setDataPagamento(datap);
		
		System.out.println("Informe a média de consumo ");
		double mediac = in.nextDouble();
		conta.setMediaConsumo(mediac);
		
		
		conta.menorConsumo();
		conta.maiorConsumo();
		
		in.close();	
	}

		
}
