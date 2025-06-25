package aula14.polimorfismo.sobreposicao.exercicio;

public class Quadrado extends Quadrilatero{
	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("A área do quadrado é: " + lado*lado);
	}
}
