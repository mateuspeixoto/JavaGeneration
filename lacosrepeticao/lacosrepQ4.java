package Turma15;

import java.util.Scanner;

public class lacosrepQ4 {

	public static void main(String[] args) {
		
		
		Scanner ler= new Scanner(System.in);
		
		int idade,sexo,op,pessoas=0,calmas=0,mNervosas=0,hAgress=0,oCalmos=0,nerv40=0,calmas18=0;

				while(pessoas < 150){
					System.out.println("Quantos anos tem? \nR: ");
					idade = ler.nextInt();
					
					while(idade<0 || idade>130)
					{
						System.out.println("Voc� digitou uma idade invalida, tente novamente: ");
						System.out.println("Quantos anos tem? \nR: ");
						idade= ler.nextInt();
					}
					
					System.out.println("\nSexo (1-feminino / 2-masculino / 3-Outros) \nR: ");
					sexo = ler.nextInt();
					
					while(sexo>3 || sexo<1) {
						
						System.out.println("Voc� digitou uma op��o invalida, tente novamente: ");
						System.out.println("\nSexo (1-feminino / 2-masculino / 3-Outros) \nR: ");
						sexo= ler.nextInt();
						
					}
					
					System.out.println("\nDigite (1) se voc� for calma(o)");
					System.out.println("Digite (2) se voc� for nervosa(o)");
					System.out.println("Digite (3) se voc� for agressiva(o)\nR: ");
					op = ler.nextInt();

					while(op>3 || op<1) {
						System.out.println("Voc� digitou uma op��o invalida, tente novamente: ");
						System.out.println("\nDigite (1) se voc� for calma(o)");
						System.out.println("Digite (2) se voc� for nervosa(o)");
						System.out.println("Digite (3) se voc� for agressiva(o)\nR: ");
						op= ler.nextInt();
					}
					
					if(op==1){
						calmas++ ;
					}
					if(sexo==1 && op==2){
						mNervosas++;
					}
					if(sexo==2 && op ==3){
						hAgress++;
					}
					if(sexo==3 && op ==1){
						oCalmos++;
					}
					if(idade>=40 && op ==2){
						nerv40++;
					}
					if(idade<18 && op ==1){
						calmas18++;
					}
					pessoas++;
					
				}
			
				System.out.println("o n�mero de pessoas calmas: "+calmas);
				System.out.println("\no n�mero de mulheres nervosas: "+ mNervosas);
				System.out.println("\no n�mero de homens agressivos: "+hAgress);
				System.out.println("\no n�mero de outros calmos: "+oCalmos);
				System.out.println("\no n�mero de pessoas nervosas com mais de 40 anos: "+nerv40);
				System.out.println("\no n�mero de pessoas calmas com menos de 18 anos: "+calmas18);
	}

}
