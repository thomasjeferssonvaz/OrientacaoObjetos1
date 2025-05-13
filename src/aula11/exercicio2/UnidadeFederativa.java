package aula11.exercicio2;

public enum UnidadeFederativa {
	PARANA("Paraná", "PR", "Curitiba"),
	SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre");
	
	private String nome;
	private String sigla;
	private String capital;
	
	private UnidadeFederativa(String nome, String sigla, String capital) {
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
	
}
