package aula16.classemetodoabstrato.exercicio;

public abstract class FormasGeometricas {
	protected String cor;
	public FormasGeometricas(String cor) {
		this.cor = cor;
	}
	protected void imprimirDados() {
		System.out.println("Cor: " + this.cor);
	};
	
	protected abstract double calcularArea();
	protected abstract double calcularPerimetro();
}
