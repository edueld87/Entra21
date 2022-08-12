package com.entra21.cursojavamanha.oop.exerciciopratica2;



public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.
		
		Lampada lampada = new Lampada();
		lampada.setMarca("Tachibra");
		lampada.setModelo("Led");
		lampada.setCompatibilidade("Smart");
		lampada.setCor("Branca");
		lampada.setGarantia("1 ano");
		lampada.setPotencia("9");
		
		System.out.println("Marca= " +lampada.getMarca());
		System.out.println("Modelo= " +lampada.getModelo());
		System.out.println("Compatibilidade= " +lampada.getCompatibilidade());
		System.out.println("Cor da lâmpada= " +lampada.getCor());
		System.out.println("Cor da lâmpada= " +lampada.getGarantia());
		System.out.println("Potencia= " +lampada.getPotencia());
		
		lampada.lampadaLigadaDesligada();
		//lampada.botaoligadesliga();
		lampada.statusLampada();
		//lampada.lampadaLigadaDesligada();
		//lampada.statusLampada();
		
		
				
		

	}

}
