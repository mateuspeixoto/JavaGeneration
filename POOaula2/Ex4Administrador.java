package POOaula2;

public class Ex4Administrador extends Ex1Pessoa {

	private double estadia, passagem, emergencia,capital;
	
	
	
	public Ex4Administrador(String nome, String endereco, String telefone, String zapzap) 
	{
		super(nome, endereco, telefone, zapzap);
		// TODO Auto-generated constructor stub
	}
	
	
	public String ajudaDeCustos(double estadia,double passagem,double capital)
	{
		//this.emergencia= emergencia;
		this.passagem=passagem;
		this.estadia=estadia;
		
		this.capital = capital;
		
		 double custototal= passagem+estadia;
		 double emergencia = capital - custototal;
	
		 String mensagem = "O custo total será: "+custototal+"\nO saldo de emergencia é: "+emergencia;
		 return mensagem;
		
	}





	public double getEstadia() {
		return estadia;
	}


	public void setEstadia(double estadia) {
		this.estadia = estadia;
	}


	public double getPassagem() {
		return passagem;
	}


	public void setPassagem(double passagem) {
		this.passagem = passagem;
	}


	public double getEmergencia() {
		return emergencia;
	}


	public void setEmergencia(double emergencia) {
		this.emergencia = emergencia;
	}


	public double getCapital() {
		return capital;
	}


	public void setCapital(double capital) {
		this.capital = capital;
	}
}