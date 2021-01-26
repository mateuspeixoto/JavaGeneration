package Turma15;

import java.util.Scanner;

public class Q4intro {
	public static void main(String[] args) 
	{
		
		double a,b,c,d,r,s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número para A\n R: ");
		a = ler.nextDouble();
				
		System.out.println("Digite um número para B\n R: ");
		b = ler.nextDouble();
				
		System.out.println("Digite um número para C\n R: ");
		c = ler.nextDouble();
		
		r= Math.pow(a,2) + Math.pow(b,2);
		s= Math.pow(b,2) + Math.pow(c,2);
		
		d= (r+s)/2;
				
		System.out.println(d);
		
	
	
	}

}
