package aula14.polimorfismo.exercicio;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(5);
		
		System.out.println(calculadora.somar(5, 5));
		System.out.println(calculadora.somar(5.00, 5.00));
		System.out.println(calculadora.somar(list));
	}
}
