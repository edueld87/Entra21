package com.entra21.cursojavamanha.oop.exerciciopratica2;

public class UniversidadeTeste {

	public static void main(String[] args) {
		
		Alunos aluno = new Alunos();
		//Disciplina disciplinas = new Disciplina();
		Funcionarios funcionarios = new Funcionarios();
		Curso curso = new Curso();
		Professor professor = new Professor();
		TecnicoAdministrativo tecnicoAdm = new TecnicoAdministrativo();
		
		
		funcionarios.informarFuncionario();
		funcionarios.imprimirInfo();
		//disciplinas.cadastrarDisciplinas();
		//disciplinas.infoDisciplinas();
		//aluno.cadastrarAlunos();
		//aluno.infoAlunos();
		curso.setCodigo("54321");
		curso.setNome("Eduardo");
		System.out.println(curso.getNome());
		System.out.println(curso.getCodigo());
		//curso.cadastrarCurso();
		//curso.infoCurso();
		professor.cadastroProf();
		professor.informacaoProf();
		tecnicoAdm.cadastrarCargo();
		tecnicoAdm.informarCargo();
		
	}

	
}
