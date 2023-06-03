package br.com.confidencecambio.javabasico.desafio2;

public abstract class BaseClass {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		validaNome(nome);
		this.nome = nome.trim();
		
	}
	
	public String getPrimeiroNome() {
		return this.nome.split(" ")[0];
	}
	
	public String getUltimoNome() {
		String[] nomes = this.nome.split(" ");
		String sobrenome = "";
		for(int i = 0; i < nomes.length; i++) {
			if(i > 0) {
				sobrenome += " " + nomes[i];
			}
		}
		
		return sobrenome;
	}
	
	public String getNomeAbreviado() {
		String[] nomes = this.nome.split(" ");
		int tamanhoArray = nomes.length - 1;
		String primeiroNome = nomes[0];
		String sobrenome = nomes[tamanhoArray];
		for(int i = 0; i < nomes.length; i++) {
			if(i > 0 && i < nomes.length - 1) {
				primeiroNome += " " + nomes[i].substring(0, 1) + ".";
			}
		}
		
		return primeiroNome + " " + sobrenome;
	}
	
	public String getNomeUpperCase() {
		return this.nome.toUpperCase();
	}

	private void validaNome(String nome) throws Exception {
		if (nome == null || nome.isBlank()) {
			throw new Exception("Nome não pode ser nulo ou vazio");
		}
	}

}
