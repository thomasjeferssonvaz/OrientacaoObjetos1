package aula13.heranca.exercicio1;

public class Professor extends Pessoa{
	private Double salarioBase;
	private Double salarioTitulacao;

	public Professor(String nome, int idade, Double salarioBase, Double salarioTitulacao, Endereco endereco) {
		super(nome, idade, endereco);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	
	public Double calcularSalario() {
		return this.salarioBase+this.salarioTitulacao;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Salario Base: " + this.salarioBase);
		System.out.println("Salario Titulacao: " + this.salarioTitulacao);
		System.out.println("Salario total: " + calcularSalario());
		System.out.println("Endereço: " + endereco);
	}
	
}
