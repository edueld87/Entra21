package com.entra21.cursojavamanha.oop.lista02javaavancado;

import java.util.function.BinaryOperator;

public class Calculadora {
	
//	public static double calcular (double x, double y, OperacaoMatematica operacao) {
//		return operacao.operar(x,y);
	
	public static double calcular (double x, double y, BinaryOperator<Double> operacao) {
		return operacao.apply(x,y);
		
	}

}
