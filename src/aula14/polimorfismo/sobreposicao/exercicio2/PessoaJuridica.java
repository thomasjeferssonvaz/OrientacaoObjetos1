package aula14.polimorfismo.sobreposicao.exercicio2;

public class PessoaJuridica extends Pessoa{
private int numFuncionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Gasto com saúde: R$" + this.numFuncionarios);
	}
	
	@Override
	public void calculoValorTotalImpostoPago() {
		Double impostoAPagar;
		int porcentagemPaga;
		if(this.numFuncionarios > 15) {
			impostoAPagar = this.rendaAnual*0.13;
			porcentagemPaga = 13;
		} else {
			impostoAPagar = this.rendaAnual*0.18;
			porcentagemPaga = 18;
		}
		System.out.printf("Seu imposto a ser pago é %d%% da sua renda anual, fechando em: R$%.2f\n",porcentagemPaga, impostoAPagar);
	}

}
