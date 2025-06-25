package aula11.exercicio1;

public class ClienteEnumTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(1, "Thomas", "07/10/2005", EstadoCivil.SOLTEIRO);
		
		cliente1.imprimirDadosCliente();
		cliente1.alterarEstadoCivil(EstadoCivil.CASADO);
		
		System.out.println();
		System.out.println("=========");
		System.out.println();
		
		cliente1.imprimirDadosCliente();
	}
}
