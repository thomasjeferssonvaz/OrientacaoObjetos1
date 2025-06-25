package aula16.classemetodoabstrato.exemplo01;

public class Horista extends Funcionario{
	private double precoHora;
	private int horasTrabalhadas;
	
	
	public Horista(String nome, String cpf, Double salarioBase, double precoHora, int horasTrabalhadas) {
		super(nome, cpf, salarioBase);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Preço hora: R$" + this.precoHora);
		System.out.println("Horas trabalhadas: R$" + this.horasTrabalhadas);
		System.out.println("Salário total: R$" + this.calcularSalario());
		};
	
	protected double calcularSalario() {
		return this.salarioBase+(this.horasTrabalhadas*this.precoHora);
	}
	
}
