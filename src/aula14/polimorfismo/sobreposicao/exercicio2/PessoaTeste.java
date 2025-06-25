package aula14.polimorfismo.sobreposicao.exercicio2;

public class PessoaTeste {
	public static void main(String[] args) {
		PessoaFisica pessoaFisica = new PessoaFisica("Thomas", 15000.00, 3000.00);
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Thomas Ltda.", 300000.00, 10);
		
		pessoaFisica.calculoValorTotalImpostoPago();
		pessoaJuridica.calculoValorTotalImpostoPago();
		
	}
}
