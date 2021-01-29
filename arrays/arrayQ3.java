package Turma15;

import java.util.Scanner;

public class arrayQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,c,i=0,j=0;
		int n1[][]= new int[4][6], n2[][]= new int[4][6],m1[][]= new int[4][6],m2[][]= new int[4][6];
		
		Scanner ler= new Scanner(System.in);
		//lendo a matriz n1
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.printf("Entre com o %do valor da matriz n1[%d][%d] \n R: ",i+1,l,c);
				n1[l][c]= ler.nextInt();
				i++;
				
				
			}
			
			
		}
		
		
		//lendo a matriz n2
		for(l=0;l<4;l++)
		{
			
			for(c=0;c<6;c++)
			{
				System.out.printf("Entre com o %do valor da matriz n2[%d][%d] \n R: ",j+1,l,c);
				n2[l][c]= ler.nextInt();
				j++;
			}
		}
		
		//criando a matriz soma m1
		
		for(l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				m1[l][c] = n1[l][c] + n2[l][c];
			}
		}
		
		//criando a matriz de diferença m2
		
				for(l=0;l<4;l++)
				{
					for(c=0;c<6;c++)
					{
						m2[l][c] = n1[l][c] - n2[l][c];
					}
				}
				
				//fazendo a saida
				
				//n1
				System.out.println("Matriz n1 =");
				for(l=0;l<4;l++)
				{
					
					
					for(c=0;c<6;c++)
					{
						System.out.printf(" n1[ %d ] |",n1[l][c]);
					}
					System.out.println("\n");
				}
				System.out.println("\n");
				
				//n2
				System.out.println("Matriz n2 =");
				for(l=0;l<4;l++)
				{
					
					
					for(c=0;c<6;c++)
					{
						System.out.printf(" n2[ %d ] |",n2[l][c]);
					}
					System.out.println("\n");
				}
				System.out.println("\n");
				
				//m1
				System.out.println("Matriz m1(n1+n2) =");
				for(l=0;l<4;l++)
				{
					
					
					for(c=0;c<6;c++)
					{
						System.out.printf(" m1[ %d ] |",m1[l][c]);
					}
					System.out.println("\n");
				}
				System.out.println("\n");
				
				//n1
				System.out.println("Matriz m2 (n1-n2) =");
				for(l=0;l<4;l++)
				{
					
					
					for(c=0;c<6;c++)
					{
						System.out.printf(" m2[ %d ] |",m2[l][c]);
					}
					System.out.println("\n");
				}
				System.out.println("\n");
				
				
				

	}

}
