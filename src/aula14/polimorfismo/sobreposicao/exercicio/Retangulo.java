package aula14.polimorfismo.sobreposicao.exercicio;

public class Retangulo extends Quadrilatero{
	
	private Double base;
	private Double altura;
	
	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("A área do retangulo é: " + this.base*this.altura);
	}
}
