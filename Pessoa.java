
public class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String endereco;
	protected String idade;
	protected String rg;
	
	protected Pessoa(String nome, String cpf, String endereco, String rg, String idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.rg = rg;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
}

