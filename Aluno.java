
public class Aluno extends Pessoa {

	public Aluno(String nome, String cpf, String endereco, String rg, String idade) {
		super(nome, cpf, endereco, rg, idade);
	}
	public String matricula;
	public String cod_aluno;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCod_aluno() {
		return cod_aluno;
	}
	public void setCod_aluno(String cod_aluno) {
		this.cod_aluno = cod_aluno;
	}
	
	public void Dados() {
			System.out.println(getNome());
			System.out.println(getIdade());
			System.out.println(getCpf());
			System.out.println(getMatricula());
			System.out.println(getCod_aluno());

}
}
