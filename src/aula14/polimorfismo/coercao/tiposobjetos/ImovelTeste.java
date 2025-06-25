package aula14.polimorfismo.coercao.tiposobjetos;

import java.util.Scanner;

public class ImovelTeste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1 - Imovel novo");
		System.out.println("2 - Imovel usado");
		System.out.println("Opção: ");
		int opcao = input.nextInt();
	
		Imovel imovel = null;
		
		switch (opcao) {
		case 1:
			imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 200000.00);
			break;

		case 2:
			imovel = new ImovelUsado("Balduino Taques, 2048", 500000.00, 100000.00);
			break;
		}
		input.close();
		
		imovel.imprimirDados();
		
		
		if (imovel instanceof ImovelNovo) {
			ImovelNovo imovelNovo = (ImovelNovo) imovel;
			imovelNovo.imprimirDados();
		} else {
			ImovelUsado imovelUsado = (ImovelUsado) imovel;
			imovelUsado.imprimirDados();
		}
	}
}
