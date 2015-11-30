
abstract class Funcionario extends Pessoa {
	private double salario;

	public double getSalario() {
		return salario;
	}

	abstract void setSalario(double salario);
}
