package com.entra21.cursojavamanha.oop.lista02javaavancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;


public class TesteOrdenacao {

	public static void main(String[] args) {

		Random r = new Random();

		ContaPoupanca a = new ContaPoupanca();
		a.setNumero(237);
		a.setNome("Eduardo");
		a.setSaldo(100);

		ContaPoupanca b = new ContaPoupanca();
		b.setNumero(411);
		b.setNome("Adriana");
		b.setSaldo(500);

		ContaPoupanca c = new ContaPoupanca();
		c.setNumero(933);
		c.setNome("Vinicius");
		c.setSaldo(300);

		ContaPoupanca d = new ContaPoupanca();
		d.setNumero(185);
		d.setNome("Amelia");
		c.setSaldo(5000);

		//		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
		List<ContaPoupanca> contas = new LinkedList <ContaPoupanca>();
		contas.add(a);
		contas.add(b);
		contas.add(c);
		contas.add(d);


		// ordenar as contas
		System.out.println(" Depois de ordenar");
		Collections.sort(contas);
		System.out.println();

		// desordenar as contas
		//		System.out.println(" Depois de desordenar");
		//		Collections.reverse(contas);
		//		System.out.println();

		// ordenar lista por numero de conta
		//		ContaPoupanca cc;
		//		for(int i = 0; i < contas.size(); i++) {
		//			cc = contas.get(i);
		//			System.out.println(cc.getConta() + " ");
		//		}
		//		System.out.println();



		// ordenar lista de nomes
		ContaPoupanca cc;
		for(int i = 0; i < contas.size(); i++) {
			cc = contas.get(i);
			System.out.println(cc.getNome() + " ");
		}
		System.out.println();


		ContaPoupanca[] co = new ContaPoupanca[3];
		for(int i = 0; i < co.length; i++) {
			co[i] = new ContaPoupanca(); 
			co[i].saldo = r.nextDouble() * 2000;
			System.out.println(" Saldo " + i + " ." + co[i].getSaldo());


		}


	}
}