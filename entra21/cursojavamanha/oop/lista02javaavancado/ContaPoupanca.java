package com.entra21.cursojavamanha.oop.lista02javaavancado;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	String situacaoDaConta;
	
		


//	@Override
//	public int compareTo(ContaPoupanca outraConta) {
//
//		if (super.numero < outraConta.numero) {
//			return -1;
//		}
//		if (super.numero > outraConta.numero) {
//			return 1;
//		}
//
//		return 0;
//
//	}
	


	public int compareTo (ContaPoupanca outraConta) {
		return this.getNome().compareTo(outraConta.getNome());
	}
		
	}

