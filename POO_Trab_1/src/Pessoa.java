
public abstract class Pessoa {
	protected String nome;
	protected String cpf;

	public void setNome(String nome) {
		this.nome = nome;
	 }

	 public String getNome() {
		 return this.nome;
	 }

	 public void setCpf(String cpf) {
		this.cpf = cpf;
	 }

	public String getcpf() {
			 return this.cpf;
		 }
		 
	@Override
	public String toString() {
	        return "{nome: " + nome +
	            ", cpf: " + cpf + "}";
    }
}

