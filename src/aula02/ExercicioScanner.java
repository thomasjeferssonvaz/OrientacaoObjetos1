package aula02;
import java.util.Scanner;
public class ExercicioScanner {
	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo: ");
		String nomeCompleto = prompt.nextLine();

		
		System.out.println("Informe seu sexo: ");
		String sexo = prompt.nextLine();
		
		
		System.out.println("Informe seu estado civil: ");
		String estadoCivil = prompt.nextLine();
		
		
		System.out.println("Informe sua quantidade de filhos: ");
		int quantFilhos = prompt.nextInt();
		
		prompt.nextLine();
		
		System.out.println("Informe sua escolaridade: ");
		String escolaridade = prompt.nextLine();
		
		
		System.out.println("Informe sua renda mensal: ");
		double rendaMensal = prompt.nextDouble();
		prompt.close();
		System.out.println("");
		System.out.println("");
		
		System.out.println("--------------------------------");
		System.out.printf("Nome: %s.\nSexo: %s.\nEstado civil: %s.\nQuantidade de filhos: %d.\nEscolaridade: %s.\nRenda mensal: R$%.2f.\n",
							nomeCompleto, sexo, estadoCivil, quantFilhos, escolaridade, rendaMensal
		);
		System.out.println("--------------------------------");
		
		
	}
}
