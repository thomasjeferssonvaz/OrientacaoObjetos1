package aula16.classemetodoabstrato.exercicio;

public class Circulo extends FormasGeometricas{
	private double raio;
	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Raio: " + this.raio);
		System.out.println("Área: " + this.calcularArea());
		System.out.println("Perímetro: " + this.calcularPerimetro());
	}

	@Override
	protected double calcularArea() {
		return 3.14*(this.raio*this.raio);
	}

	@Override
	protected double calcularPerimetro() {
		return (2*3.14)*this.raio;
	}
}
