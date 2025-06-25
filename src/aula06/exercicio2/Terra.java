package aula06.exercicio2;

public class Terra {
	final double GRAVIDADE = 9.8;
	
	public void calcularTempoQueda(double altura) {
		double tempo;
		tempo = Math.sqrt((2*altura)/GRAVIDADE);
		System.out.printf("Este objeto vai demorar %.2f segundos para tocar o chão.", tempo);
	}
}
