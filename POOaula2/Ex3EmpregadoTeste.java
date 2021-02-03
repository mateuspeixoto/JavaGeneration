package POOaula2;

public class Ex3EmpregadoTeste {
	
	public static void main(String[] args) {
		
	
	
	
	Ex3Empregado empregado1= new Ex3Empregado(null,null,null,null);
	
	empregado1.setNome("Mateus");
	empregado1.setTelefone("40028922");
	empregado1.setEndereco("sp");
	empregado1.setZapzap("7077070");
	empregado1.setCodigoSetor(123);
	
	empregado1.setSalarioBase(6000);
	
	empregado1.setImposto(10);
	
	empregado1.cartaoVisitas(empregado1.getNome(), empregado1.getEndereco(),empregado1.getTelefone());
	
	System.out.println("\nCodigo do setor: "+ empregado1.getCodigoSetor());
	
	System.out.println("\nSalário base: "+ empregado1.getSalarioBase());
	System.out.println("Imposto de "+ empregado1.getImposto()+ "% \nSalário final: ");
	
	System.out.println(empregado1.calcularSalario(empregado1.getSalarioBase(), empregado1.getImposto()));
	
	
	
	
 }
}