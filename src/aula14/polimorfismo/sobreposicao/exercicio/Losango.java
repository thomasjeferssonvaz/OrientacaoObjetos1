package aula14.polimorfismo.sobreposicao.exercicio;

public class Losango extends Quadrilatero{
	
	private Double diagonalMenor;
	private Double diagonalMaior;
	
	public Losango(Double diagonalMenor, Double diagonalMaior) {
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	@Override
	public void calcularArea() {
		System.out.println("A área do losango é: " + (this.diagonalMenor*this.diagonalMaior)/2 );
	}
}
