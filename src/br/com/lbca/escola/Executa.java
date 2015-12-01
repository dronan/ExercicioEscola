package br.com.lbca.escola;
import java.util.ArrayList;

public class Executa {
	public static void main(String[] args) {

		// ------------ Recepcionista
		Recepcionista recepcionista = new Recepcionista();
		recepcionista.setNome("Joaquim");
		recepcionista.setCPF("321.654.987-98");
		recepcionista.setSalario(500.00);

		// ------------ Professor
		Professor professorIngles = new Professor();
		professorIngles.setNome("Charles Xavier");
		professorIngles.setCertificacoes("X-English");
		professorIngles.setCPF("12.345.126-98");
		professorIngles.setSalario(1000.00);

		// ------------ Professor
		Professor professorEspanhol = new Professor();
		professorEspanhol.setNome("Alonso");
		professorEspanhol.setCertificacoes("F1-Español");
		professorEspanhol.setCPF("112.454.999-01");
		professorEspanhol.setSalario(800.00);

		// ------------ Curso
		Curso cursoIngles = new Curso();
		cursoIngles.setHorasCurso(10);
		cursoIngles.setNomeCurso("Ingles");
		cursoIngles.setProfessor(professorIngles);
		cursoIngles.setValorCurso(3000.00);

		// ------------ Curso
		Curso cursoEspanhol = new Curso();
		cursoEspanhol.setHorasCurso(10);
		cursoEspanhol.setNomeCurso("Espanhol");
		cursoEspanhol.setProfessor(professorEspanhol);
		cursoEspanhol.setValorCurso(3000.00);

		// ------------ Turma
		Turma turmaManha = new Turma();
		turmaManha.setCurso(cursoIngles);
		turmaManha.setHorario("10:10");
		turmaManha.setNomeTurma("Turma da manha");
		turmaManha.setQuantidadeAluno(10);

		// ------------ Turma
		Turma turmaManha2 = new Turma();
		turmaManha2.setCurso(cursoEspanhol);
		turmaManha2.setHorario("12:00");
		turmaManha2.setNomeTurma("Turma da manha de espanhol");
		turmaManha2.setQuantidadeAluno(8);
		turmaManha2.getPeriodo();

		// ------------ Turma
		Turma turmaTarde = new Turma();
		turmaTarde.setCurso(cursoEspanhol);
		turmaTarde.setHorario("15:00");
		turmaTarde.setNomeTurma("Turma da tarde");
		turmaTarde.setQuantidadeAluno(10);
		turmaTarde.getPeriodo();
		
		// ------------ Turma
		Turma turmaTarde2 = new Turma();
		turmaTarde2.setCurso(cursoIngles);
		turmaTarde2.setHorario("17:00");
		turmaTarde2.setNomeTurma("Turma da tarde de ingles");
		turmaTarde2.setQuantidadeAluno(10);
		turmaTarde2.getPeriodo();
		
		// ------------ Turma
		Turma turmaNoite = new Turma();
		turmaNoite.setCurso(cursoIngles);
		turmaNoite.setHorario("20:00");
		turmaNoite.setNomeTurma("Turma da noite de ingles");
		turmaNoite.setQuantidadeAluno(10);
		turmaNoite.getPeriodo();
		
		// ------------- Aluno 1 
		Aluno aluno = new Aluno();
		aluno.setNome("Diego");
		aluno.setCPF("123.342.987-85");
		aluno.setMatricula("abc123456");


		CursoAluno cursoAluno = new CursoAluno();
		cursoAluno.setAluno(aluno);
		cursoAluno.setTurma(turmaNoite);
		cursoAluno.setProgresso(20);			
		

		CursoAluno cursoAluno_1 = new CursoAluno();
		cursoAluno_1.setAluno(aluno);
		cursoAluno_1.setTurma(turmaNoite);
		cursoAluno_1.setProgresso(20);			
				

		
		ArrayList<Turma> turmaAluno = new ArrayList<Turma>();
		turmaAluno.add(turmaManha2);
		turmaAluno.add(turmaTarde2);
		aluno.setTurma(turmaAluno);

		// ------------- Aluno 2
		Aluno aluno2 = new Aluno();

		aluno2.setNome("Guilherme");
		aluno2.setCPF("13.142.914-01");
		aluno2.setMatricula("98712");
		
		CursoAluno cursoAluno2 = new CursoAluno();
		cursoAluno2.setAluno(aluno2);
		cursoAluno2.setTurma(turmaManha2);
		cursoAluno2.setProgresso(78);
		
		CursoAluno cursoAluno2_1 = new CursoAluno();
		cursoAluno2_1.setAluno(aluno2);
		cursoAluno2_1.setTurma(turmaTarde);
		cursoAluno2_1.setProgresso(40);
		
		CursoAluno cursoAluno2_2 = new CursoAluno();
		cursoAluno2_2.setAluno(aluno2);
		cursoAluno2_2.setTurma(turmaNoite);
		cursoAluno2_2.setProgresso(70);		
		
		ArrayList<Turma> turmaAluno2 = new ArrayList<Turma>();
		turmaAluno2.add(turmaManha2);
		turmaAluno2.add(turmaTarde);
		turmaAluno2.add(turmaNoite);
		aluno2.setTurma(turmaAluno2);		

		// ------------- Aluno 3
		Aluno aluno3 = new Aluno();

		aluno3.setNome("Diogo");
		aluno3.setCPF("00.122.321-01");
		aluno3.setMatricula("98712");
		
		CursoAluno cursoAluno3 = new CursoAluno();
		cursoAluno3.setAluno(aluno3);
		cursoAluno3.setTurma(turmaNoite);
		cursoAluno3.setProgresso(20);			
		
		
		ArrayList<Turma> turmaAluno3 = new ArrayList<Turma>();
		turmaAluno3.add(turmaNoite);
		aluno3.setTurma(turmaAluno3);				

		ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();
		arrayAlunos.add(aluno);
		arrayAlunos.add(aluno2);
		arrayAlunos.add(aluno3);

		// ------------- Diretor
		Diretor diretor = new Diretor();
		diretor.setNome("Maria");
		diretor.setCPF("321.654.123-22");
		diretor.setSalario(5000.00);
		diretor.extrairRelatorio(arrayAlunos);

	}
}
