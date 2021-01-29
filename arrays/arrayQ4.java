package Turma15;

import java.util.Scanner;

public class arrayQ4 {

	public static void main(String[] args) {
		int m[][]= new int[3][3];
		int l,c,i=0,soma=0,diag=0;
		
		Scanner ler= new Scanner(System.in);
		
		for(l=0;l<3;l++)
		{
			for(c=0;c<3;c++)
			{
				System.out.printf("Entre com o %do valor da matriz m[%d][%d] \n R: ",i+1,l,c);
				m[l][c]= ler.nextInt();
				i++;
				soma += m[l][c];
				
				if(m[c]==m[l]) 
			{
				diag+= m[l][c];
				System.out.println("dp");
			}
				
				
			}
			
			
		}
			
		//soma
			
			
			System.out.println("\n Soma da diagonal principal= "+diag);
			System.out.println("\n Soma de todos os números = "+soma);
			
			System.out.println("Matriz = ");
			for(l=0;l<3;l++)
			{
				
				
				for(c=0;c<3;c++)
				{
					System.out.printf(" m[ %d ] |",m[l][c]);
				}
				System.out.println("\n");
			}
	}

}
