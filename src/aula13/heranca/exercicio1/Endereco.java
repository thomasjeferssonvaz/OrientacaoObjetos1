package aula13.heranca.exercicio1;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	public Endereco(String logradouro, int numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}
	@Override
	public String toString() {
		return "\n Logradouro: " + logradouro + "\n Numero: " + numero + "\n Bairro:" + bairro + "\n Cidade: " + cidade
				+ "\n UnidadeFederativa: " + unidadeFederativa;
	}
	
	
	
}
