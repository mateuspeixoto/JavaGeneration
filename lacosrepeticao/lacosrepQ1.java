package Turma15;

public class lacosrepQ1 {

	public static void main(String[] args) {

		int numeros,i;
		
		System.out.println("Esses são os números entre 1000 e 1999, que dividos por 11 tem resto 5: ");
		
		for(i=1000;i<=1999;i++)
		{
			if(i%11==5)
			{
				numeros=i;
				System.out.println(numeros + "\n");
			}
		}

	}

}
