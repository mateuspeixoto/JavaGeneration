package Turma15;

import java.util.Scanner;

public class lacosrepQ2 {

	public static void main(String[] args)
	{
		int par=0,impar=0,i,n1,numero;
		
		Scanner ler= new Scanner(System.in);

				for(i=1;i<=10;i++)
				{

				System.out.println("Entre com o "+i+"o"+" número: ");
				n1= ler.nextInt();
				
				if(n1%2 == 0){
					par++;
				}
				else{
					impar++;
				}
			
			} System.out.println("Pares:"+par+"\n"+"Impares: "+impar);
			}

	}


