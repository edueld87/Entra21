package com.entra21.cursojavamanha.oop.exerciciopratica2;

public class ClasseContaDeLuz {

	private String dataLeitura;
	private double numeroLeitura;
	private double kwGasto;
	private double valorPagar;
	private String dataPagamento;
	private double mediaConsumo;
	private double[][] matrizGastos = new double [2][6];
	private double menorConsumo;
	private double maiorConsumo;
	
	ClasseContaDeLuz() {
		
	}


	public String getDataLeitura() {
		return dataLeitura;
	}

	public void setDataLeitura(String dataLeitura) {
		this.dataLeitura = dataLeitura;
	}

	public double getNumeroLeitura() {
		return numeroLeitura;
	}

	public void setNumeroLeitura(double numeroLeitura) {
		this.numeroLeitura = numeroLeitura;
	}

	public double getKwGasto() {
		return kwGasto;
	}

	public void setKwGasto(double kwGasto) {
		this.kwGasto = kwGasto;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getMediaConsumo() {
		return mediaConsumo;
	}

	public void setMediaConsumo(double mediaConsumo) {
		this.mediaConsumo = mediaConsumo;
	}

	public double[][] getMatrizGastos() {
		return matrizGastos;
	}

	public void setMatrizGastos(double[][] matrizGastos) {
		this.matrizGastos = matrizGastos;
	}

	public double getMenorConsumo() {
		return menorConsumo;
	}

	public void setMenorConsumo(double menorConsumo) {
		this.menorConsumo = menorConsumo;
	}

	public double getMaiorConsumo() {
		return maiorConsumo;
	}

	public void setMaiorConsumo(double maiorConsumo) {
		this.maiorConsumo = maiorConsumo;
	}

	void menorConsumo() {
		for (int i = 0; i < matrizGastos.length; i++) {
			for (int j = 0; j < matrizGastos[i].length; j++) {
				if (numeroLeitura < kwGasto) {
					menorConsumo = numeroLeitura;
				}
			}
		}
	}

	void maiorConsumo() {
		for (int i = 0; i < matrizGastos.length; i++) {
			for (int j = 0; j < matrizGastos[i].length; j++) {
				if (numeroLeitura > kwGasto) {
					maiorConsumo = numeroLeitura;
				}	
			}		
		}
	}	
}
