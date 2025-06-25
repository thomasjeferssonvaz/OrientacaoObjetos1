package aula16.classemetodoabstrato.exemplo01;

public class Assalariado extends Funcionario{
	
	private Double salarioAdicional;

	public Assalariado(String nome, String cpf, Double salarioBase,  Double salarioAdicional) {
		super(nome, cpf, salarioBase);
		this.salarioAdicional = salarioAdicional;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Salário adicional: R$" + this.salarioAdicional);
		System.out.println("Salário total: R$" + this.calcularSalario());
		
	}
	
	protected double calcularSalario() {
		return this.salarioBase+this.salarioAdicional;
	}
	
}
