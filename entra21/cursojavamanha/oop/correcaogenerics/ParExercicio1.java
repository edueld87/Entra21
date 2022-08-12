package com.entra21.cursojavamanha.oop.correcaogenerics;

public class ParExercicio1  <T,U> {
	
	 private T p1;
	 private U p2;
	 
	 
	public ParExercicio1(T p1, U p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}


	public T getP1() {
		return p1;
	}


	public void setP1(T p1) {
		this.p1 = p1;
	}


	public U getP2() {
		return p2;
	}


	public void setP2(U p2) {
		this.p2 = p2;
	}


	@Override
	public String toString() {
		return ""+ p1 + ", " + p2;
	}
	 
}



