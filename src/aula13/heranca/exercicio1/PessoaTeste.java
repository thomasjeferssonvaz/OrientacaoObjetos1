package aula13.heranca.exercicio1;

public class PessoaTeste {
	public static void main(String[] args) {
		Endereco enderecoProfessor = new Endereco("Rua A", 1, "Uvaranas", "PG", "PR");
		Endereco enderecoAluno = new Endereco("Rua B", 2, "Oficinas", "PG", "PR");
		Professor professor1 = new Professor("Thomas", 19, 2500.00, 1000.0, enderecoProfessor);
		Aluno aluno1 = new Aluno("Fernanda", 19, "ADS", enderecoAluno);
		
		professor1.imprimirDados();
		
		
		aluno1.imprimirDados();
		aluno1.realizarMatricula("ADM");
		aluno1.imprimirDados();
	}
}
