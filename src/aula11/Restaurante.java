package aula11;

public class Restaurante {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(101, "07/05/2025");
		
		pedido1.imprimirDadosPedido();
		pedido1.alterarStatus(Status.PROCESSANDO);
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		pedido1.imprimirDadosPedido();
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		pedido1.alterarStatus(Status.ENVIADO);
		pedido1.imprimirDadosPedido();
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		pedido1.alterarStatus(Status.ENTREGUE);
		pedido1.imprimirDadosPedido();
	}
}
