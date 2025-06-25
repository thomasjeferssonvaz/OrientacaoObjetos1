package aula02;
import java.util.Scanner;

public class EntradaDados {
	public static void main(String [] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		String nome = entradaTeclado.nextLine();
		
		System.out.print("Informe sua idade: ");
		int idade = entradaTeclado.nextInt();

		entradaTeclado.nextLine();
		
		System.out.println("Informe sua escolaridade: ");
		String escolaridade = entradaTeclado.nextLine();
		
		System.out.println("Informe sua altura: ");
		double altura = entradaTeclado.nextDouble();
		
		entradaTeclado.close();
		
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.printf("Nome: %s.\nIdade: %d anos.\nAltura: %.2fKg.\nEscolaridade: %s.\n", nome, idade, altura, escolaridade);
		System.out.println("--------------------------------");
		
	}
}
