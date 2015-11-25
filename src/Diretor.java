import java.util.ArrayList;

public class Diretor extends Pessoa {

	public void extrairRelatorio(ArrayList<Aluno> aluno) {
		for (Aluno aluno2 : aluno) {
			System.out.println(aluno2.toString());
			/*
			 * System.out.print(aluno2.getNome() + "\t" +
			 * aluno2.getTurma().getCurso() + "\t" +
			 * aluno2.getTurma().getHorario() + " - " +
			 * aluno2.getTurma().getPeriodo() + "\n");
			 */
		}
	}

}
