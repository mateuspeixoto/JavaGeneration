package Turma15;

import java.util.Scanner;

public class lacosrepQ3 {

	public static void main(String[] args) 
	{
		int idade=0,menos21=0,mais50=0;
		
				Scanner ler= new Scanner(System.in);

				while(idade != -99){
					System.out.println("Qual a sua idade? \nR:");
					idade = ler.nextInt();

					if(idade<=21 && idade>0){
						menos21++;
					}
					else if( idade>=50){
						mais50++;
					}
					
					
				} 
				System.out.println("Total de pessoas com menos de 21 anos: "+menos21+"\nTotal de pessoas com mais de 50 anos: "+mais50);
			}

	}


