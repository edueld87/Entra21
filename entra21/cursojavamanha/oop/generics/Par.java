package com.entra21.cursojavamanha.oop.generics;

public class Par <T, U> {
	
	private T p1;
	private U p2;
	
	
	public Par(T p1, U p2) {
		
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
		return "Par [p1=" + p1 + ", p2=" + p2 + "]";
	}
	
	
	

}
