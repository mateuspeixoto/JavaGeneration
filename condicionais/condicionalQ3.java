package Turma15;

import java.util.Scanner;

public class condicionalQ3 {

	public static void main(String[] args) {
		
		int idade,i,j,a;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Você é da categoria infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Você é da categoria juvenil");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Você é da categoria adulto");
			
		}
		else {
			System.out.println("idade invalida");
		}

	}

}
