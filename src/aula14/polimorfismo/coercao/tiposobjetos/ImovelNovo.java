package aula14.polimorfismo.coercao.tiposobjetos;

public class ImovelNovo extends Imovel{
	 
	private double valorAdicional;
	 
	public ImovelNovo(String endereco, Double valorBase, double valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados() {
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Valor Base: R$" + this.valorBase);
		System.out.println("Valor adicional: R$" + this.valorAdicional);
		System.out.println("Valor total: R$" + calcularValor());
	}
	
	public double calcularValor() {
		
		return this.valorBase + this.valorAdicional;
	}
}
