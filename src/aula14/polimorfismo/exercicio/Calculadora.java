package aula14.polimorfismo.exercicio;

import java.util.List;

public class Calculadora {
	
	public int somar(int primeirointeger, int segundointeger) {
		return primeirointeger+segundointeger;
	}
	public Double somar(Double primeiroDouble, Double segundoDouble) {
		return primeiroDouble+segundoDouble;
	}
	public int somar(List<Integer> list) {
		int resultado = 0;
		for (int i = 0; i < list.size(); i++) {
			resultado = resultado+list.get(i);
		}
		return resultado;
	}
}
