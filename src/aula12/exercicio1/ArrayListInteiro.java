package aula12.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListInteiro {
	public static void main(String[] args) {
		List<Integer> listaGenerica = new ArrayList<Integer>();
		Scanner entradaTeclado = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.printf("Escreva o %dº número: \n", i+1);
			int n = entradaTeclado.nextInt();
			listaGenerica.add(n);
			
		}
		entradaTeclado.close();
		
		
		//Soma
		int soma = 0;
		
		for (int i = 0; i < listaGenerica.size(); i++) {
			int n = listaGenerica.get(i);
			soma = soma + n;
		}
		System.out.printf("Soma: %d\n", soma);
		
		//Média Aritmética
		int i;
		int somaMedia = 0;
		for (i = 0; i < listaGenerica.size(); i++ ) {
			int n = listaGenerica.get(i);
			somaMedia = soma + n;
		}
		Double mediaAritmetica = (double) (somaMedia/i);
		System.out.printf("Média Aritmética: %.2f\n",mediaAritmetica);
	}
}
