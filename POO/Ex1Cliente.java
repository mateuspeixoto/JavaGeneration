package POO;



public class Ex1Cliente {
	
	private String nome,sobrenome;
	private int idade;
	private double altura;
	
	
	
	public Ex1Cliente(String n,String s,int i,double a) 
	{
		nome = n;
		sobrenome = s;
		idade = i;
		altura= a;
	}
	
	public String getPortifolio() 
	{
		String portifolio= nome +" "+sobrenome+", "+idade+" anos de idade e "+ altura +" de altura. ";
		return portifolio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
