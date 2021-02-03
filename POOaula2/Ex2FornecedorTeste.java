package POOaula2;

public class Ex2FornecedorTeste {
	
	public static void main(String[] args) {
		
		Ex1Pessoa mateus= new Ex1Pessoa(null, null, null, null);
		Ex2Fornecedor forn1= new  Ex2Fornecedor(null,null,null,null);
		
		
		
		
		mateus.setNome("Mateus");
		mateus.setTelefone("40028922");
		mateus.setEndereco("sp");
		mateus.setZapzap("7077070");
		
		forn1.setNome("marcos");
		forn1.setTelefone("1819281928");
		forn1.setEndereco("rj");
		forn1.setZapzap("2371283712");
		forn1.setValorCredito(1000);
		forn1.setValorDivida(654);
		
		System.out.println("Cartao de visitas de "+ mateus.getNome()+": ");
		 mateus.cartaoVisitas(mateus.getNome(),mateus.getEndereco(),mateus.getTelefone());
		 System.out.println("\nWhatsapp: "+ mateus.getZapzap());
		 
		 System.out.println("Cartao de visitas do fornecedor: "+ forn1.getNome()+": ");
		 mateus.cartaoVisitas(forn1.getNome(),forn1.getEndereco(),forn1.getTelefone());
		 System.out.println("\nWhatsapp: "+ forn1.getZapzap());
		 System.out.println("O saldo atual de "+ forn1.getNome() + " é de R$ \n");
		 
		 System.out.println((forn1.obterSaldo(forn1.getValorCredito(), forn1.getValorDivida())));
		
		 

		
		
	
		
	}

}
