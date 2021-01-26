package Turma15;

import java.util.Scanner;

public class Q1intro {
	
	public static void main(String[] args) 
	{
		
		float anos,dias,meses,total;
		
		Scanner ler= new Scanner(System.in);
		System.out.println("\nEntre com sua idade em anos: ");
		anos = ler.nextFloat();
		
		System.out.println(anos +" anos e quantos meses?(insira somente números) \n R: ");
		meses = ler.nextFloat();
		
		System.out.println(meses + " mes(es) e quantos dias?(insira somente números) \\n R:");
		dias = ler.nextFloat();
		
		total= anos*365 +meses*30+ dias;
		
		System.out.println("\nVocê possui " + total +" dias de idade.");
		
	}

}
