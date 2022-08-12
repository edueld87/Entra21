package com.entra21.cursojavamanha.oop.exerciciopratica2;


public class Lampada {

	private String marca; 
	private String modelo; 
	private String compatibilidade;
	private String cor; 
	private String garantia;
	private String potencia; 
	private String[] tipos;
	private boolean ligada = true;
	private String status;
	
	Lampada() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCompatibilidade() {
		return compatibilidade;
	}

	public void setCompatibilidade(String compatibilidade) {
		this.compatibilidade = compatibilidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String[] getTipos() {
		return tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	void lampadaLigadaDesligada() {
		if (ligada == true) {
			ligada = false;
			status = "ligada";
			//System.out.println(" lampada " +status);

		} else if 
		(ligada == false) {
			ligada = true;
			status = "desligada";
			//System.out.println(" lampada " +status);
		}

	}

	/*void botaoligadesliga() {
		if (ligada % 2 == 1) {
			status = "ligada";
		} else {
			status = "desligada";
		}

	}*/

	void statusLampada() {
		if (status == "ligada") {
			System.out.println(" lampada " +status);
			ligada = true;
		}	else if 
		(status == "desligada") {
			System.out.println(" lampada " +status);
		}

	}
}



