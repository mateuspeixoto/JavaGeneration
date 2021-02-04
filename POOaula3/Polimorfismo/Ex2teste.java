package POOaula3;

public class Ex2teste {
	public static void main(String[] args) {
		
		Ex2cachorro cao= new Ex2cachorro();
		
		cao.setNome("Scooby-do");
		cao.setIdade("52");
		
		Ex2cavalo cavalo= new Ex2cavalo("Pé-de-Pano","67");
		Ex2preguica preg= new Ex2preguica("Sid","19");
		
		System.out.println("Nome do Cachorro: "+ cao.getNome());
		
		System.out.println("Idade: "+ cao.getIdade());
		
		System.out.println("Emite este som: ") ;
		cao.som();
		
		System.out.println("Modo de locomoção: ");
		cao.locomocao();
		
		System.out.println("\n****************************************\n");
		
		System.out.println("Nome do Cavalo: "+ cavalo.getNome());
	
		System.out.println("Idade: "+cavalo.getIdade());
		
		System.out.println("Emite este som: ");
		cavalo.som();
		System.out.println("Modo de locomoção: ");
		cavalo.locomocao();
		

		System.out.println("\n****************************************\n");
		
		System.out.println("Nome do Bicho Preguiça: "+ preg.getNome());
		
		System.out.println("Idade: "+preg.getIdade());
		
		System.out.println("Emite este som: ");
		preg.som();
		System.out.println("Modo de locomoção: ");
		preg.locomocao();
		
		
	}

}
