package Turma15;

import java.util.Scanner;

public class condicionalQ4 {

	public static void main(String[] args) {
		
		double n,raiz,potencia;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Escreva um n�mero qualquer: ");
		n=ler.nextDouble();
		
		if(n%2==0) {
			
			raiz= Math.sqrt(n);
			System.out.println("O n�mero � par e sua Raiz quadrada �: "+ raiz);
			
		}
		else if(n%2==1) {
			potencia=Math.pow(n, 2);
			System.out.println("Seu n�mero � �mpar e elevado ao quadrado �:  " + potencia);
		}

	}

}
