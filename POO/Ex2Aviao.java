package POO;

import java.util.Scanner;

public class Ex2Aviao {
	
	private double comprimento,envergadura,velocidadeAtual=0.0,aceleracao,freio;
	private String pilotoNome,destino,origem;
	
	Scanner ler = new Scanner(System.in);
	
	public String infoVoo(String p,String d, String o)
	{
		pilotoNome=p;
		destino=d;
		origem=o;
		
		String frase = "O voo sairá do aeroporto de "+origem+" e terá como destino "+destino+", sendo pilotado por: "+pilotoNome;
		return frase;
	}
	
	public String caractAviao(double c,double e)
	{
		this.comprimento= c;
		this.envergadura = e;
		
		String caractAviao= "Características do Avião: \nComprimento: "+c+"\nEnvergadura: "+e;
		return caractAviao;
	}
	
	public void liga() {
		System.out.println("O avião irá decolar");
	}
	
	public String velocidade(double aceleracao,Double velocidadeAtual)
	{
		this.aceleracao = aceleracao;
		this.velocidadeAtual= velocidadeAtual;
	
		velocidadeAtual += aceleracao;
		
		String velo= velocidadeAtual + " km/h";
		return velo;
	}
	
	
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public double getEnvergadura() {
		return envergadura;
	}
	public void setEnvergadura(double envergadura) {
		this.envergadura = envergadura;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(double aceleracao) {
		this.aceleracao = aceleracao;
	}
	public double getFreio() {
		return freio;
	}
	public void setFreio(double freio) {
		this.freio = freio;
	}
	public String getPilotoNome() {
		return pilotoNome;
	}
	public void setPilotoNome(String pilotoNome) {
		this.pilotoNome = pilotoNome;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	

}
