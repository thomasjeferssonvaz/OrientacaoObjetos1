package aula11;

public class Pedido {
	private int id;
	private String data;
	private Status statusPedido;
	
	public Pedido(int id, String data) {
		this.id = id;
		this.data = data;
		this.statusPedido = Status.AGUARDANDO_PAGAMENTO;	
	}
	
	public void alterarStatus(Status novoStatus) {
		this.statusPedido = novoStatus;
	}
	
	public void imprimirDadosPedido() {
		System.out.println("Id: "+id);
		System.out.println("Data do pedido: "+data);
		System.out.println("Status do pedido: "+statusPedido);
	}
	
	
}
