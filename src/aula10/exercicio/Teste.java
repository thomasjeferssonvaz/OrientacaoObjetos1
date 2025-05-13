package aula10.exercicio;

public class Teste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(
				"Thomas", 
				"07/10/2005",
				"Masculino",
				"thomas@gmail.com",
				"Solteiro",
				"Rua Araci Marcondes",
				63,
				"Cara-Cara",
				"Ponta Grossa",
				"Paraná"
				);
		
		
		pessoa.imprimirDados();
	}
}
