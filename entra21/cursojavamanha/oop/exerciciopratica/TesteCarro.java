package com.entra21.cursojavamanha.oop.exerciciopratica;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		System.out.println("Marca= " +van.marca);
		System.out.println("Modelo= " +van.modelo);
		System.out.println("Numero de passageiros= " +van.numPassageiros);
		System.out.println("Capacidade de combustível= " +van.capCombustivel);
		System.out.println("Consumo combustível= " +van.consumoCombustivel);
		
		System.out.println();
		
		System.out.println("Marca= " +fusca.marca);
		System.out.println("Modelo= " +fusca.modelo);
		System.out.println("Numero de passageiros= " +fusca.numPassageiros);
		System.out.println("Capacidade de combustível= " +fusca.capCombustivel);
		System.out.println("Consumo combustível= " +fusca.consumoCombustivel);		

	}

}
