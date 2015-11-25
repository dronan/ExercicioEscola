
public class Professor extends Pessoa {

	private String certificacoes;
	private double salario;
	
	public String getCertificacoes() {
		return certificacoes;
	}
	
	public void setCertificacoes(String certificacoes) {
		this.certificacoes = certificacoes;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + getNome() + ", CPF:" + getCPF() + ", certificacoes=" + certificacoes + ", salario=" + salario + "]";
	}
	
	
	
	
}
