package Turma15;

import java.util.Scanner;

public class lacosrepQ6 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		
		int num;
		double media,soma=0,n=0;

		do{
			System.out.println("Número inteiro:\n ");
			num=ler.nextInt();
			
			if(num!=0)
			{
			
			if(num%3==0)
			{
                    n++;
				soma= soma+num;
			}
			}
			
		}
		
		while(num != 0);
		
		media= soma/n;
		
		System.out.println("\nquantidade de multiplos de 3 : "+ n);
		System.out.println("\nsoma dos multiplos de 3 : "+soma);
		System.out.println("\nmedia dos multiplos de 3 : "+ media);
				
	}

}
