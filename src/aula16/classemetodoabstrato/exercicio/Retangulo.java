package aula16.classemetodoabstrato.exercicio;

public class Retangulo extends FormasGeometricas{
	private double base;
	private double altura;
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Base: " + this.base);
		System.out.println("Altura: " + this.altura);
		System.out.println("Área: " + this.calcularArea());
		System.out.println("Perímetro: " + this.calcularPerimetro());
	}

	@Override
	protected double calcularArea() {
		return this.base*this.altura;
	}

	@Override
	protected double calcularPerimetro() {
		return (this.base*2)+(this.altura*2);
	}
}
