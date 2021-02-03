package POO;

import java.util.Scanner;

public class Ex2AeroportoAviao {
	public static void main(String[] args) {
		
		String piloto,origem,destino;
		double comprimento,envergadura,velocidadeAtual,aceleracao;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Entre com o nome do piloto: ");
		piloto= ler.nextLine();
		System.out.println("Entre com o nome da origem: ");
		origem= ler.nextLine();
		System.out.println("Entre com o nome do destino: ");
		destino= ler.nextLine();
		
		Ex2Aviao aviao = new Ex2Aviao();
		
		System.out.println(aviao.infoVoo(piloto, destino, origem));
		
		aviao.liga();
		
		System.out.println("Entre com o comprimento: ");
		comprimento= ler.nextDouble();
		System.out.println("Entre com a envergadura: ");
		envergadura=ler.nextDouble();
		System.out.println("velocidade atual: ");
		velocidadeAtual= ler.nextDouble();
		System.out.println("aceleração:  ");
		aceleracao= ler.nextDouble();
		
		System.out.println(aviao.caractAviao(comprimento, envergadura));
		
		System.out.println(aviao.velocidade(aceleracao,velocidadeAtual));
	

	}

}
