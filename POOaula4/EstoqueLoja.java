package POOaula4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class EstoqueLoja {
	public static void main(String[] args) {
		
		int op;
		String produto;
	
		Scanner ler= new Scanner(System.in);
	
	System.out.println("\n|---------Estoque--------|");
	
	
	Collection<String> produtos= new ArrayList();

	produtos.add("Vans");
	produtos.add("Nike");
	produtos.add("Adidas");
	produtos.add("Mizuno");
	
	do {
	System.out.println(produtos);

	System.out.println("\n_________________________");
	
	
	System.out.println("\n1-Adicionar Produto      | \n2-Remover Produto        |\n3-Apagar Todos Produtos  |");
	System.out.println("_________________________\n R: ");
	op=ler.nextInt();
	
	
	if(produtos.isEmpty())
	{
		System.out.println("Estoque vazio\n");
		
		System.out.println("Digite o nome do produto para adiciona-lo: ");
		ler.nextLine();
		produto= ler.nextLine();
		produtos.add(produto);
	
	}
	else if(op==1) {
		
		System.out.println("Digite o nome do produto para adiciona-lo: ");
		ler.nextLine();
		produto= ler.nextLine();
		produtos.add(produto);
				
		
	}
	else if(op==2) {
		System.out.println(produtos);
		System.out.println("\n\nDigite o nome do produto para remove-lo: ");
		ler.nextLine();
		produto= ler.nextLine();
		produtos.remove(produto);
		
	}
	else if(op==3) {
		produtos.clear();	
	}
	
	}
	while(op!=0);
	
	}
	
}


