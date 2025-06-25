package aula14.polimorfismo.coercao.tiposobjetos;

public class ImovelUsado extends Imovel{
	private Double valorDesconto;

	public ImovelUsado(String endereco, Double valorBase, Double valorDesconto) {
		super(endereco, valorBase);
		this.valorDesconto = valorDesconto;
	}
	
	public void imprimirDados() {
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor Base: R$" + this.valorBase);
		System.out.println("Valor desconto: R$" + this.valorDesconto);
		System.out.println("Valor total: R$" + calcularValor());
	}
	public double calcularValor() {
		
		return this.valorBase - this.valorDesconto;
	}
}
