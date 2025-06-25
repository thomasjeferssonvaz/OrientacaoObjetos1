package aula13.heranca.exercicio1;

public class Aluno extends Pessoa{
	private String curso;
	public Aluno(String nome, int idade, String curso, Endereco endereco) {
		super(nome, idade, endereco);
		this.curso = curso;
	}

	public void realizarMatricula(String curso) {
		this.curso = curso;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Curso: " + curso);
		System.out.println("Endereço: " + endereco);
	}
	
}
