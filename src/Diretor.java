import java.util.ArrayList;

public class Diretor extends Funcionario {

	public void extrairRelatorio(ArrayList<Aluno> aluno) {
		for (Aluno aluno2 : aluno) {
			System.out.println(aluno2.toString());
		}
	}

}
