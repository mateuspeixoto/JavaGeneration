package POO;

import java.util.Scanner;

public class Ex3Proeletroniteste {
	
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		String m;
		double p;
		
		System.out.println("Qual marca é seu celular?: ");
		m= ler.nextLine();
		System.out.println("quanto custou?: ");
		p= ler.nextDouble();
		
		
		Ex3Proeletroni celular = new Ex3Proeletroni(p,m);
		
		
		System.out.println("A marca do celular é: "+ celular.getMarca() + "\nCustou: "+ celular.getPreco() );
		
		
	}
}
