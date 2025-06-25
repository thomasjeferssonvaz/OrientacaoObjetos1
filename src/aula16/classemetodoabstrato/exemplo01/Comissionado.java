package aula16.classemetodoabstrato.exemplo01;

public class Comissionado extends Funcionario{
	
	private Double totalVendas;
	private Double taxaComissao;

	public Comissionado(String nome, String cpf, Double salarioBase,  Double totalVendas, Double taxaComissao) {
		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Total vendas: R$" + this.totalVendas);
		System.out.println("Taxa comissão: " + this.taxaComissao);
		System.out.println("Salário total: R$" + this.calcularSalario());
	}
	protected double calcularSalario() {
		return this.salarioBase+(this.totalVendas*this.taxaComissao);
	}
}
