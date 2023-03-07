
public class Professor extends Pessoa {

	public Professor(String nome, String cpf, String endereco, String rg, String idade) {
		super(nome, cpf, endereco, rg, idade);
	}
	public String disciplina;
	public double salario;
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void Dados() {
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getCpf());
		System.out.println(getDisciplina());
		System.out.println(getSalario());

}
	
}
