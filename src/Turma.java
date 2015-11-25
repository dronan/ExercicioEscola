public class Turma {

	private Curso curso;
	private String nomeTurma;
	private int quantidadeAluno;
	private String horario;

	public String getCurso() {
		return curso.getNomeCurso();
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public int getQuantidadeAluno() {
		return quantidadeAluno;
	}

	public void setQuantidadeAluno(int quantidadeAluno) {
		this.quantidadeAluno = quantidadeAluno;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getPeriodo() {
		double hora = Double.parseDouble(this.horario.replace(":", "."));

		if (hora <= 12) {
			return "manhã";
		} else if (hora <= 18) {
			return "tarde";
		} else {
			return "noite";
		}

	}

}
