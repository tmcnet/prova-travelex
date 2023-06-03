package br.com.confidencecambio.javabasico.desafio2;

public class Desafio2 {
	
	static String NOME_CLIENTE = "João Soares Silva";
	static String NOME_GERENTE = "Thiago Melo Carvalho";
	static String NOME_ROBO = "Robo March 3";

	public static void main(String[] args) {
		try {
			
//			1. Nome não pode ser nulo
			
			testeValorNulo();
			
//			2. Nome não pode ser vazio
			
			testeValorVazio();
			
//			3. Nome não pode conter espaços extras no início e no fim
			
			testeValorComEspacos();
			
//			Deve ser possível obter o primeiro nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "João"
			
			testeObterPrimeiroNome();
			
//			Retornar o último nome. Exemplo: Se o nome for "João Soares Silva", deve retornar "Soares Silva"
			
			testeObterUltimoNome();
			
//			Retornar o nome todo em letras maiúsculas
			
			testeObterNomeCompletoEmLetrasMaiusculas();
			
//			Retornar o nome abreviado. Exemplo: Se o nome for "João Soares Silva", retornar "João S. Silva"
			
			testeObterNomeCompletoAbreviado();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
	
	private static void testeValorNulo() throws Exception {
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Robo robo = new Robo();
		
		cliente.setNome(null);
		gerente.setNome(null);
		robo.setNome(null);
	}
	
	private static void testeValorVazio() throws Exception {
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Robo robo = new Robo();
		
		cliente.setNome("");
		gerente.setNome("");
		robo.setNome("");
	}
	
	private static void testeValorComEspacos() throws Exception {
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Robo robo = new Robo();
		
		cliente.setNome(" " + NOME_CLIENTE + " ");
		gerente.setNome(" " + NOME_GERENTE + " ");
		robo.setNome(" " + NOME_ROBO + " ");
		
		System.out.println("Nome Completo Cliente: " + cliente.getNome());
		System.out.println("Nome Completo Gerente: " + gerente.getNome());
		System.out.println("Nome Completo Robô: " + robo.getNome());
	}
	
	private static void testeObterPrimeiroNome() throws Exception {
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Robo robo = new Robo();
		
		cliente.setNome(NOME_CLIENTE);
		gerente.setNome(NOME_GERENTE);
		robo.setNome(NOME_ROBO);
		
		System.out.println("Primeiro Nome Cliente: " + cliente.getPrimeiroNome());
		System.out.println("Primeiro Nome Gerente: " + gerente.getPrimeiroNome());
		System.out.println("Primeiro Nome Robô: " + robo.getPrimeiroNome());
	}
	
	private static void testeObterUltimoNome() throws Exception {
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Robo robo = new Robo();
		
		cliente.setNome(NOME_CLIENTE);
		gerente.setNome(NOME_GERENTE);
		robo.setNome(NOME_ROBO);
		
		System.out.println("Último Nome Cliente: " + cliente.getUltimoNome());
		System.out.println("Último Nome Gerente: " + gerente.getUltimoNome());
		System.out.println("Último Nome Robô: " + robo.getUltimoNome());
	}
	
	private static void testeObterNomeCompletoEmLetrasMaiusculas() throws Exception {
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Robo robo = new Robo();
		
		cliente.setNome(NOME_CLIENTE);
		gerente.setNome(NOME_GERENTE);
		robo.setNome(NOME_ROBO);
		
		System.out.println("Nome Completo Cliente (Letras Maiúsculas): " + cliente.getNomeUpperCase());
		System.out.println("Nome Completo Gerente (Letras Maiúsculas): " + gerente.getNomeUpperCase());
		System.out.println("Nome Completo Robô (Letras Maiúsculas): " + robo.getNomeUpperCase());
	}
	
	private static void testeObterNomeCompletoAbreviado() throws Exception {
		Cliente cliente = new Cliente();
		Gerente gerente = new Gerente();
		Robo robo = new Robo();
		
		cliente.setNome(NOME_CLIENTE);
		gerente.setNome(NOME_GERENTE);
		robo.setNome(NOME_ROBO);
		
		System.out.println("Nome Completo Cliente (Letras Maiúsculas): " + cliente.getNomeAbreviado());
		System.out.println("Nome Completo Gerente (Letras Maiúsculas): " + gerente.getNomeAbreviado());
		System.out.println("Nome Completo Robô (Letras Maiúsculas): " + robo.getNomeAbreviado());
	}

}
