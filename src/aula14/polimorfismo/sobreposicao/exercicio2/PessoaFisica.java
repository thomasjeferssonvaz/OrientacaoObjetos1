package aula14.polimorfismo.sobreposicao.exercicio2;

public class PessoaFisica extends Pessoa{
	private Double gastoComSaude;
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Gasto com saúde: R$" + this.gastoComSaude);
	}
	
	@Override
	public void calculoValorTotalImpostoPago() {
		Double impostoAPagar;
		int porcentagemPaga;
		if(this.rendaAnual < 20000.00) {
			impostoAPagar = this.rendaAnual*0.15;
			porcentagemPaga = 15;
			//System.out.println("Seu imposto a ser pago é 15% da sua renda anual, fechando em: R$" + this.rendaAnual*0.15);
		} else {
			//System.out.println("Seu imposto a ser pago é 25% da sua renda anual, fechando em: R$" + this.rendaAnual*0.15);
			impostoAPagar = this.rendaAnual*0.25;
			porcentagemPaga = 25;
		}
		if(this.gastoComSaude > 1) {
			impostoAPagar = impostoAPagar-(this.gastoComSaude/2);
			System.out.printf("Seu imposto a ser pago é %d%% da sua renda anual menos 50%% do seu gasto com saúde, fechando em: R$%.2f\n",porcentagemPaga, impostoAPagar);
		} else {
			System.out.printf("Seu imposto a ser pago é %d%% da sua renda anual, fechando em: R$%.2f\n",porcentagemPaga, impostoAPagar);
		}
		
	}

}
