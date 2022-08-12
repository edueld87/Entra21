package com.entra21.cursojavamanha.oop.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteDesempenhoUsandoList {

	public static void main(String[] args) {
		
		 final int MAX = 20000;
	        long tInicio = System.currentTimeMillis();
	        List<Integer> lista = new ArrayList<Integer>();
//	       List<Integer> lista = new LinkedList<Integer>();
	        for (int i = 0; i < MAX; i++) {
	          lista.add(i);
	        }
	        for (int i = 0; i < MAX; i++) {
	          lista.contains(i);
	        }
	        long tFim = System.currentTimeMillis();
	        System.out.println("Tempo total: " + (tFim - tInicio));
	      }
	}


