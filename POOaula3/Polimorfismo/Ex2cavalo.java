package POOaula3;

public class Ex2cavalo extends Ex1animal{

	public Ex2cavalo(String nome, String idade) {
		super(nome, idade);
		
	}

	@Override
	public void som() {
		System.out.println("IH-HI-HU-HI");
		
	}

	@Override
	public void locomocao() {
		System.out.println("Corre");
		
	}

}
