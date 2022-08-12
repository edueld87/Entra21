package com.entra21.cursojavamanha.oop.correcaogenerics;

public class ProdutoGenerico <T> {

	private T codigo;
	   private String descricao;
	   private double preco;
	   
	   public ProdutoGenerico(T cod) {
	       codigo = cod;
	   }
	    
	   public ProdutoGenerico(T cod, String descricao, double preco) {
	       codigo = cod;
	       this.descricao = descricao;
	       this.preco = preco;
	   }

	   public T getCodigo() { return codigo; }
	   public String getDescricao() { return descricao; }
	   public double getPreco() { return preco; }

	   @Override
	   public String toString() {
	       return "ProdutoG{" + "codigo=" + codigo + ", descricao=" +
	       descricao + ", preco=" + preco + "}";
	    }
	   
	   public String toString2() {
	       return "ProdutoG{" + "codigo= " + codigo + "}";
	    }
}


