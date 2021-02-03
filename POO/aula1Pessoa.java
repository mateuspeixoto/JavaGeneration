package POO;

public class aula1Pessoa {
	//deixando privado pra funcionar somente nessa classe
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//criando construtor e os parametros (nao cria um novo obj)
	
	public aula1Pessoa (String primeiro,String meio,String ultimo)
	{
		primeiroNome = primeiro;
		nomesDoMeio = meio;
		ultimoNome = ultimo;
	}
//metodo que vai me retornar o nome completo da pessoa
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	
//agora tenho que criar um main pra executar o metodo(boa pratica)
}

