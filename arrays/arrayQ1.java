package Turma15;

import java.util.Scanner;

public class arrayQ1 {

	public static void main(String[] args) {
		int i;
		int vet[] = new int[5];
		
		Scanner ler= new Scanner(System.in);
		
		for(i=0;i<5;i++)
		{
			System.out.printf("Entre com o %do valor:  ",i+1);
			vet[i]=ler.nextInt();
		}
		//a cada valor novo, perguntamos, ele � o maior/menor da lista?
		int menor= vet[0], maior=vet[0];//a primeira posi��o sempre � a maior e a menor
		
		
		for(i=0;i<5;i++)
		{
			if(vet[i]<menor)
			{
				menor=vet[i];
				
			}
			else if(vet[i]>maior)
			{
				maior=vet[i];
				
			}
			
			}
		System.out.println("\n");
		
		//saida das notas para o leigo
		for(i=0;i<5;i++)
		{
			if(vet[i]==maior )
			{
				System.out.printf("\nO %do valor de potua��o �: %d <-- Maior n�mero",i+1,vet[i]);
			}
			
			else if(vet[i]==menor)
			{
				System.out.printf("\nO %do valor de potua��o �: %d <-- Menor n�mero",i+1,vet[i]);
			
			}
			else {
				System.out.printf("\nO %do valor de potua��o �: %d",i+1,vet[i]);
			}
		}
		
		
		

	}

}
