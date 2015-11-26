import java.util.ArrayList;

public class Aluno extends Pessoa {

	private String matricula;
	private int progressao;
	private ArrayList<Turma> turma;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getProgressao() {
		return progressao;
	}

	public ArrayList<Turma> getTurma() {
		return turma;
	}

	public void setTurma(ArrayList<Turma> turma) {
		this.turma = turma;
	}

	public void setProgressao(int progressao) {
		this.progressao = progressao;
	}

}
