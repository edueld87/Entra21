package com.entra21.cursojavamanha.oop.lista06herencainterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
	
		private String codigo;
		private String titulo;
		private LocalDate dtInicio;
		private LocalDate dtFim;
		private String profRes;
		
		List<Pesquisador> equipe = new ArrayList<Pesquisador>();

		public ProjetoPesquisa() {
			
			this.codigo = codigo;
			this.titulo = titulo;
			this.dtInicio = dtInicio;
			this.dtFim = dtFim;
			this.profRes = profRes;
			this.equipe = equipe;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public LocalDate getDtInicio() {
			return dtInicio;
		}

		public void setDtInicio(LocalDate dtInicio) {
			this.dtInicio = dtInicio;
		}

		public LocalDate getDtFim() {
			return dtFim;
		}

		public void setDtFim(LocalDate dtFim) {
			this.dtFim = dtFim;
		}

		public String getProfRes() {
			return profRes;
		}

		public void setProfRes(String profRes) {
			this.profRes = profRes;
		}

		public List<Pesquisador> getEquipe() {
			return equipe;
		}

		public void setEquipe(List<Pesquisador> equipe) {
			this.equipe = equipe;
		}
		
		

		
		
}
