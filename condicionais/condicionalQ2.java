package Turma15;

import java.util.Scanner;

public class condicionalQ2 {

	public static void main(String[] args)
	{
		int n1,n2,n3,maior=0,meio=0,menor=0;
		

		Scanner ler= new Scanner(System.in);
		
		System.out.println("escreva o primeiro número: ");
		n1=ler.nextInt();
				
		System.out.println("escreva o segundo número: ");
		n2=ler.nextInt();
		
		System.out.println("escreva o terceiro número: ");
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3) 
		{
			maior = n1;
			if(n2>n3) 
			{
				meio=n2;
				menor=n3;
			}
			else if(n3>n2)
			{
				meio=n3;
				menor=n2;
			}
			System.out.println("\nmenor: "+ menor); 
			System.out.println("\nmeio: "+ meio);
			System.out.println("\nmaior: "+ maior);
		}
		
		if(n2>n1 && n2>n3) 
		{
			maior = n2;
			if(n1>n3) 
			{
				meio=n1;
				menor=n3;
			}
			else if(n3>n1)
			{
				meio=n3;
				menor=n1;
			}
			System.out.println("\nmenor: "+ menor); 
			System.out.println("\nmeio: "+ meio);
			System.out.println("\nmaior: "+ maior);
		}
		
		if(n3>n2 && n3>n1) 
		{
			maior = n3;
			if(n2>n1) 
			{
				meio=n2;
				menor=n1;
			}
			else if(n1>n2)
			{
				meio=n1;
				menor=n2;
			}
			System.out.println("\nmenor: "+ menor); 
			System.out.println("\nmeio: "+ meio);
			System.out.println("\nmaior: "+ maior);
		}
		else {
			System.out.println("\nmenor: "+ n1); 
			System.out.println("\nmeio: "+ n2);
			System.out.println("\nmaior: "+ n3);
			
			
		}
			
	
		

	}

}
