package com.entra21.cursojavamanha.oop.generics;

import java.awt.List;
import java.util.ArrayList;

public class ParTeste {

	public static void main(String[] args) {
		
		Par <String, Double> par1 = new Par <> ("Jose", 10.0);
		System.out.println("Aluno e nota final: " + par1);
		
		Par <Integer, String> par2 = new Par <> (456, "Carlos");
		System.out.println("Matrícula e Nome do Funcionário: " +par2);
		
		Par <Float, Float> par3 = new Par <> (2.3f, 4.5f);
		System.out.println("Coordenadas do gráfico: " +par3);
		
		String[] f = new String[3];
		f[0] = "Morango";
		f[1] = "Uva";
		f[2] = "Laranja";
		
		Par <String, String[]> par4 = new Par <> ("Frustas na Caixa", f); //for para percorrer o array
		System.out.println(par4);
		
		List temperaturas = new ArrayList();
		temperaturas.add("35");
		temperaturas.add("27");
		temperaturas.add("20");
		
		Par <Boolean, List> par5 = new Par <> (true, temperaturas);
		System.out.println("Temperatura " +par5);
		
	}

}
