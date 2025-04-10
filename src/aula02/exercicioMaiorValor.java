package aula02;
import java.util.Scanner;

public class exercicioMaiorValor {
	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = prompt.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int segundoNumero = prompt.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		int terceiroNumero = prompt.nextInt();
		
		prompt.close();
		
		int maior = (primeiroNumero > segundoNumero) ? primeiroNumero : segundoNumero;
		
		int maiorSegundo = (maior > terceiroNumero) ? maior : terceiroNumero;
		
		
		System.out.printf("O maior numero é o: %d", maiorSegundo);

	}
}
