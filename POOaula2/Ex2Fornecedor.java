package POOaula2;

public class Ex2Fornecedor extends Ex1Pessoa {
	
	private double valorCredito=0,valorDivida=0;

	public Ex2Fornecedor(String nome, String endereco, String telefone, String zapzap) {
		super(nome, endereco, telefone, zapzap);
		// TODO Auto-generated constructor stub
		
	}
	
	public double obterSaldo(double credito,double divida)
	{
		this.valorCredito= credito;
		this.valorDivida= divida;
		
		double saldo= credito - divida;
		return(saldo);
		
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}
