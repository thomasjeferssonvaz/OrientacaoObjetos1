package aula13.heranca.exercicio1;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, int idade, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
