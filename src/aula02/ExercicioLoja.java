package aula02;
import java.util.Scanner;

public class ExercicioLoja {
	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto: ");
		Double valorProduto = prompt.nextDouble();
		prompt.close();
		
		Double desconto = (valorProduto>=50.0) ? valorProduto*0.10 : valorProduto*0.05;
		Double valorProdutoComDesconto = valorProduto-desconto;
		System.out.println(valorProdutoComDesconto);
	}
}
