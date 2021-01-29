package Turma15;

import java.util.Scanner;

public class arrayQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int vet[]= new int[11];
		
		Scanner ler= new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
			while(vet[i]>6 || vet[i]<1) {
			
			System.out.printf("%do valor do dado: ",i+1);
			vet[i]= ler.nextInt();
				
			}
			
		}
		
		double media=0;
		int maiorpont=0,soma=0,dados=10;
		
		for(i=0;i<11;i++)
		{
			soma += vet[i];
			
			if(vet[i]==6)
			{
				maiorpont++;
			}
				 
		}
		
		media= soma/dados;
		
		System.out.println("A média dos valores dos dados = "+media);
		System.out.println("A quantidade de maiores pontuações = "+ maiorpont);

	}

}
