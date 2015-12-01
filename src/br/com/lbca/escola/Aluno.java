package br.com.lbca.escola;
import java.util.ArrayList;

public class Aluno extends Pessoa {

	private String matricula;
	private ArrayList<Turma> turma;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Turma> getTurma() {
		return turma;
	}

	public void setTurma(ArrayList<Turma> turma) {
		this.turma = turma;
	}

}
