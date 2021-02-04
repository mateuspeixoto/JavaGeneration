package POOaula3;

public abstract class Ex1animal {
	private String nome;
	private String idade;
	
	public Ex1animal(String nome, String idade)
	{
		this.idade=idade;
		this.nome=nome;
		
	}
	
	public Ex1animal() {
		
	}
	
	abstract public void  som();
	
	abstract public void locomocao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	

}
