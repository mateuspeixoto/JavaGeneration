package POO;

public class Ex3Proeletroni {
	
	private double preco=0.0;
	private String marca;
	
	public Ex3Proeletroni (double p,String m)
	{
		this.preco= p;
		this.marca=m;
	}
	

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
