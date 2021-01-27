package Turma15;

import java.util.Scanner;

public class condicionalQ1 {

	public static void main(String[] args) 
	{
		int n1,n2,n3,maior=0;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("escreva o primeiro número: ");
		n1=ler.nextInt();
				
		System.out.println("escreva o segundo número: ");
		n2=ler.nextInt();
		
		System.out.println("escreva o terceiro número: ");
		n3=ler.nextInt();
		
		
		
		if(n1>maior) 
		{
			maior = n1;
		}
		if(n2>maior)
		{
			maior = n2;
		}
		if(n3>maior) 
		{
			maior=n3;
		}
		
		System.out.println(maior);

	}

}
