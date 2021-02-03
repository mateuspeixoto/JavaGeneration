package POOaula2;

public class Ex3Empregado extends Ex1Pessoa {
	
	private int codigoSetor;
	private double salarioBase,imposto;

	public Ex3Empregado(String nome, String endereco, String telefone, String zapzap) {
		super(nome, endereco, telefone, zapzap);
		// TODO Auto-generated constructor stub 
		//Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
		//inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
		//os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
		//retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
		//e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe
		//Empregado.
		
	}
	//da pra repetir com menos atribuicoes
	
	//public Ex3Empregado(String nome, String endereco) 
	{     //  super(nome,endereco);
	}
	
	public double calcularSalario(double salarioBase, double porcentagem)
	{
		this.salarioBase= salarioBase;
		this.imposto= porcentagem;
		
		
		double salario = salarioBase - ((salarioBase/100)*porcentagem);
		
		return(salario);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	
}
