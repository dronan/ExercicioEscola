package br.com.lbca.escola;

public class Professor extends Funcionario {

	private String certificacoes;

	public String getCertificacoes() {
		return certificacoes;
	}

	public void setCertificacoes(String certificacoes) {
		this.certificacoes = certificacoes;
	}
	
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + getNome() + ", CPF:" + getCPF() + ", certificacoes=" + certificacoes + ", salario="
				+ getSalario() + "]";
	}

}
