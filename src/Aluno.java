
public class Aluno extends Pessoa {

	private String matricula;
	private int progressao;
	private Turma turma;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getProgressao() {
		return progressao;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void setProgressao(int progressao) {
		this.progressao = progressao;
	}

	@Override
	public String toString() {
		return String.format("%-10s\t%-10s\t%5s\t%5s", this.getNome(), this.getTurma().getCurso(),
				this.getTurma().getHorario(), this.getTurma().getPeriodo());
	}

}
