package aula16.classemetodoabstrato.exercicio;

public class Quadrado extends FormasGeometricas{
	private double lado;

	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Tamanho lado: " + this.lado);
		System.out.println("Área: " + this.calcularArea());
		System.out.println("Perímetro: " + this.calcularPerimetro());
	}

	@Override
	protected double calcularArea() {
		return this.lado*this.lado;
	}

	@Override
	protected double calcularPerimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}
	
}
