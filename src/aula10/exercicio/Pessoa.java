package aula10.exercicio;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private String estadoCivil;
	private Endereco endereco;
	
	Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil, String logradouro, int numero, String bairro, String cidade, String uf){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		
		endereco = new Endereco(logradouro, numero, bairro, cidade, uf);
	}
	
	public void imprimirDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Data de nascimento: "+ dataNascimento);
		System.out.println("Sexo: "+ sexo);
		System.out.println("Email: "+ email);
		System.out.println("Estado Civil: "+ estadoCivil);
		System.out.println("Logradouro: "+ endereco.getLogradouro());
		System.out.println("Numero: "+ endereco.getNumero());
		System.out.println("Bairro: "+ endereco.getBairro());
		System.out.println("Cidade: "+ endereco.getCidade());
		System.out.println("Uf: "+ endereco.getUf());
	}
}
