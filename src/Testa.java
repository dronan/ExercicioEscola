import java.text.ParseException;
import java.util.ArrayList;

public class Testa {
	public static void main(String[] args) throws ParseException {

		Professor professorIngles = new Professor();
		professorIngles.setNome("Charles Xavier");
		professorIngles.setCertificacoes("X-English");
		professorIngles.setCPF("12.345.126-98");
		professorIngles.setSalario(1000.00);
		
		Professor professorEspanhol = new Professor();
		professorEspanhol.setNome("Alonso");
		professorEspanhol.setCertificacoes("F1-Español");
		professorEspanhol.setCPF("112.454.999-01");
		professorEspanhol.setSalario(800.00);
		
		Curso cursoIngles = new Curso();
		cursoIngles.setHorasCurso(10);
		cursoIngles.setNomeCurso("Ingles");
		cursoIngles.setProfessor(professorIngles);
		cursoIngles.setValorCurso(3000.00);
		
		
		Curso cursoEspanhol = new Curso();
		cursoEspanhol.setHorasCurso(10);
		cursoEspanhol.setNomeCurso("Espanhol");
		cursoEspanhol.setProfessor(professorEspanhol);
		cursoEspanhol.setValorCurso(3000.00);
		
		
		Turma turmaManha = new Turma();
		turmaManha.setCurso(cursoIngles);
		turmaManha.setHorario("10:10");
		turmaManha.setNomeTurma("Turma da manha");
		turmaManha.setQuantidadeAluno(10);
		
		
		Turma turmaManha2 = new Turma();
		turmaManha2.setCurso(cursoEspanhol);
		turmaManha2.setHorario("12:00");
		turmaManha2.setNomeTurma("Turma da manha de espanhol");
		turmaManha2.setQuantidadeAluno(8);	
		turmaManha2.getPeriodo();
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Diego");
		aluno.setCPF("123.342.987-85");
		aluno.setMatricula("abc123456");
		aluno.setProgressao(50);
		aluno.setTurma(turmaManha);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Sborbous");
		aluno2.setCPF("13.142.914-01");
		aluno2.setMatricula("98712");
		aluno2.setProgressao(55);
		aluno2.setTurma(turmaManha);		
		
		
		Aluno aluno3 = new Aluno();
		
		aluno3.setNome("Diogo");
		aluno3.setCPF("00.122.321-01");
		aluno3.setMatricula("98712");
		aluno3.setProgressao(20);
		aluno3.setTurma(turmaManha2);		
		
		ArrayList<Aluno> arrayAlunos = new ArrayList<Aluno>();
		arrayAlunos.add(aluno);
		arrayAlunos.add(aluno2);
		arrayAlunos.add(aluno3);
				
		
		Diretor diretor = new Diretor();
		diretor.extrairRelatorio(arrayAlunos);
			
		
	}
}
