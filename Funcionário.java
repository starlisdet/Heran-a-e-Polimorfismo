
public class Funcionário extends Pessoa {

	public Funcionário(String nome, String cpf, String endereco, String rg, String idade) {
		super(nome, cpf, endereco, rg, idade);
	}
	public String cargo;
	public double salario;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void Dados() {
		System.out.println(getNome());
		System.out.println(getCpf());
		System.out.println(getIdade());
		System.out.println(getCargo());
		System.out.println(getSalario());
	}
}
