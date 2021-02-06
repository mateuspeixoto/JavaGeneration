package POOaula4;


import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[] args) {
		
		Set<Aluno> conjunto= new HashSet<Aluno>();
		Aluno a= new Aluno("joão da silva","Java",6.8);
		Aluno b= new Aluno("maria sousa","internet",7.5);
		Aluno c= new Aluno("renata almeida","phyton",8.0);
		Aluno d= new Aluno("jose","Banco",9);
		Aluno e= new Aluno("Jaime","C++",5.5);
		Aluno f= new Aluno("maria sousa","internet",7);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		conjunto.add(e);
		conjunto.add(f);
		
		System.out.println(conjunto);
	}

}
