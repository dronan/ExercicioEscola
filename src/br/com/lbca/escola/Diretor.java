package br.com.lbca.escola;
import java.util.ArrayList;

public class Diretor extends Funcionario {

	public void extrairRelatorio(ArrayList<Aluno> aluno) {
		
		String str;
		
		for (Aluno aluno2 : aluno) {

			for (Turma turma2 : aluno2.getTurma()) {

				str = String.format("%-10s\t%-10s\t%5s\t%5s", aluno2.getNome(), turma2.getCurso(), turma2.getHorario(),
						turma2.getPeriodo());

				System.out.println(str);

			}
			
			System.out.println();
		}

	}
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
