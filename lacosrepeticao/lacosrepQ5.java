package Turma15;

import java.util.Scanner;

public class lacosrepQ5 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		int numero,soma=0;
				
				do{
					System.out.println("Entre com um numero: ");
					numero= ler.nextInt();
					
					soma = soma +numero;
				}
				while(numero !=0);
				System.out.println("Soma dos números= "+soma);

	}

}
