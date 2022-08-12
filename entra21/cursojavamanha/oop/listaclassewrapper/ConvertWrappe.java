package com.entra21.cursojavamanha.oop.listaclassewrapper;

public class ConvertWrappe {

	public static void main(String[] args) {
		
		
		//cria um objeto wrapper
		Integer velocidade = new Integer(587);
		
		//converte a variável velocidade para tipo primitivo
		double total = velocidade.doubleValue();
		short total1 = velocidade.shortValue();
		byte total2 = velocidade.byteValue();
		
		Float pi = new Float(3.14f);
		int valorPi = pi.intValue();
		
		System.out.println("Valor de PI arredondado: " + valorPi);
		System.out.println("Total: " + total);
		
		
		double soma = Double.parseDouble("685.65");
		System.out.println("Soma: "+soma);
		
		Integer idade = new Integer(39);
		String idadeString = String.valueOf(idade);
		String velocidade01 = new String("568.55");
		Double velocidadeDouble = Double.valueOf(velocidade01);
		System.out.println("Idade string: "+idadeString);
		System.out.println("Velocidade double: "+velocidadeDouble);
		
		
		
		
	}

}
		
//		Saída do código da Listagem 3:
//		Valor de PI arredondado: 3
//		Total: 587.0
		
		
//		Saída do código da Listagem 4:
//		Soma: 685.65


