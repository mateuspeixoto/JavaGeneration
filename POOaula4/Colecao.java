package POOaula4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Collection<String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Mariana");
		nomes.add("Mariano");
		nomes.add("Marcelo");
		nomes.add("Marta");
		
		//for(String name: nomes)
		{
			System.out.println("lista: "+ nomes);
		}
		
		
		//Collection<String> nomes2 = Arrays.asList("Maria","Joana");
		//nomes.addAll(nomes2);
		//System.out.println("lista: "+ nomes);
		
		//System.out.println("Contém o nome Maria?"+ nomes.contains("Maria"));
		//System.out.println("lista: "+ nomes);
		
		//System.out.println("Lista de nomes: \n"+ nomes);
		//nomes.remove("Mario");
		
		//System.out.println("Lista de nomes: \n"+ nomes);
		//nomes.clear();
		//System.out.println("Lista de nomes: \n"+ nomes);
		
		
		//if(nomes.isEmpty())
		{
			//System.out.println("Lista vazia");
		}
		//else
		{
		//	System.out.println("Lista de nomes: \n"+ nomes);
		}
		
		//System.out.println("Lista de nomes: \n"+ nomes);

	}

}
