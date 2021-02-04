package POOaula3;

public class Ex2preguica extends Ex1animal{

	public Ex2preguica(String nome, String idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void som() {
		System.out.println("AH...AH...AH");
		
	}

	@Override
	public void locomocao() {
		System.out.println("Sobe em árvores,Escala");
		
	}

}
