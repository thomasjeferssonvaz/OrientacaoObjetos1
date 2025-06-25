package aula16.classemetodoabstrato.exemplo01;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Assalariado assalariado = new Assalariado("João da Silva", "55555",5000.00, 2000.00);
		Comissionado comissionado = new Comissionado("Maria de Oliveira", "12931", 5000.00, 50000.00, 0.10);
		Horista horista = new Horista("Ricardo Carvalho", "5234", 5000.00, 10.00, 160);
		
		assalariado.imprimirDados();
		System.out.println("============================");
		comissionado.imprimirDados();
		System.out.println("============================");
		horista.imprimirDados();
	}
}
