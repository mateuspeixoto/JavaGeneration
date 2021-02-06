package POOaula4;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main(String[] args) {
		
		Map<String,Aluno> mapa= new TreeMap<String,Aluno>();
		
		Aluno a= new Aluno("joão da silva","Java",6.8);
		Aluno b= new Aluno("maria sousa","internet",7.5);
		Aluno c= new Aluno("renata almeida","phyton",8.0);
		Aluno d= new Aluno("jose","Banco",9);
		Aluno e= new Aluno("Jaime","C++",5.5);

		
		mapa.put("joão da silva", a);
		mapa.put("maria sousa",b);
		mapa.put("renata almeida",c);
		mapa.put("jose",d);
		mapa.put("Jaime",e);
		
		
		System.out.println(mapa);
		System.out.println(mapa.get("maria sousa"));
		
		Collection<Aluno> alunos= mapa.values();
		
		for(Aluno f:alunos)
		{
			System.out.println(f);
		}
	}

}
