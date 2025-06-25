package aula16.classemetodoabstrato.exercicio;

public class FormasGeometricasTeste {
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado("Vermelho", 5);
		Circulo circulo = new Circulo("Azul", 5);
		Retangulo retangulo = new Retangulo("Verde", 5, 5);
		
		quadrado.imprimirDados();
		System.out.println("<=========================>");
		circulo.imprimirDados();
		System.out.println("<=========================>");
		retangulo.imprimirDados();
	}
}
