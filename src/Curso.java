
public class Curso {
	
	private String nomeCurso;
	private int horasCurso;
	private Professor professor;
	private double valorCurso;
	
	public double getValorCurso() {
		return valorCurso;
	}

	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public int getHorasCurso() {
		return horasCurso;
	}
	
	public void setHorasCurso(int horasCurso) {
		this.horasCurso = horasCurso;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
