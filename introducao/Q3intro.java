package Turma15;

import java.util.Scanner;

public class Q3intro {
	public static void main(String[] args)
	{
		int segundos,segundos2,minutos,total,horas;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento na fábrica?\n");
		segundos = ler.nextInt();
		

		horas=segundos/3600;
		minutos= ((segundos%3600)/60);
		segundos2 = ((segundos%3600)%60);
		
		System.out.println("O evento durou, "+horas+" Hora(s) "+minutos+" Minutos e "+segundos2+ " Segundos");
	}

}
