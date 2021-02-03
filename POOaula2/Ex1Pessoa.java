package POOaula2;

public class Ex1Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String zapzap;
	
	public Ex1Pessoa(String nome,String endereco,String telefone,String zapzap)
	{
	 this.nome=nome;
	 this.endereco = endereco;
	 this.telefone = telefone;
	 this.zapzap=zapzap;
	}
	
	public void cartaoVisitas(String nome,String endereco,String telefone)
	{
		 this.nome=nome;
		 this.endereco = endereco;
		 this.telefone = telefone;
		 
		 String cartao= "Nome: "+nome+"\nEndereço: "+endereco+"\nTelefone: "+telefone;
		 System.out.println(cartao);
	}
	
	public void informaZap(String zap)
	{
		this.zapzap=zap;
		String z= "Whatsapp: "+zap;
		System.out.println(z);
		
	}
	
	public void Ex3Empregado(String nome, String endereco)
	{
		this.nome=nome;
		this.endereco=endereco;
	}
	
	public String getZapzap() {
		return zapzap;
	}

	public void setZapzap(String zapzap) {
		this.zapzap = zapzap;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
