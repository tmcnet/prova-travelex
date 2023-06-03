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
		String[] partes = this.nome.split(" ");
		String sobrenome = "";
		for(int i = 0; i < partes.length; i++) {
			if(i > 0) {
				sobrenome += " " + partes[i];
			}
		}
		
		return sobrenome;
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
