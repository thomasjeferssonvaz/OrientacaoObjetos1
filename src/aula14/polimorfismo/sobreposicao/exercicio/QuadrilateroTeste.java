package aula14.polimorfismo.sobreposicao.exercicio;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(5.00);
		Retangulo retangulo = new Retangulo(5.00, 10.00);
		Losango losango = new Losango(5.00, 10.00);
		
		quadrado.calcularArea();
		retangulo.calcularArea();
		losango.calcularArea();
		
	}
}
