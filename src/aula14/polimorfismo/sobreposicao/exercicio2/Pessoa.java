package aula14.polimorfismo.sobreposicao.exercicio2;

public class Pessoa {
	protected String nome;
	protected Double rendaAnual;
	
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Renda anual: R$" + this.rendaAnual);
	}
	
	public void calculoValorTotalImpostoPago() {
		
	}
	
}
