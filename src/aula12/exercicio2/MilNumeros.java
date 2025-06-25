package aula12.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class MilNumeros {
	public static void main(String[] args) {
		List<Integer> listaGenerica = new ArrayList<Integer>();
		long inicio = System.currentTimeMillis();
		
		
		for (int i = 0; i <= 500000; i++) {
			listaGenerica.add(i);
		}
		for (int i = 0; i <= 500000; i++) {
			System.out.println(listaGenerica.get(i));;
		}
		
		
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo Gasto: "+tempo+"ms");
	}
}
