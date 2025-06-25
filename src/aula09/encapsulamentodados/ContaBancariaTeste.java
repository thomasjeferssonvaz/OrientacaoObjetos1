package aula09.encapsulamentodados;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(1, "João da Silva");
		
		System.out.println(conta1.getNumeroConta());
		System.out.println(conta1.getNomeTitular());
		System.out.println(conta1.getSaldo());
		conta1.imprimirSaldo();
		
		conta1.setNumeroConta(2);
		conta1.setNomeTitular("João da Silva Ferraz");
		conta1.setSaldo(50000.00);
		
		System.out.println(conta1.getNumeroConta());
		System.out.println(conta1.getNomeTitular());
		System.out.println(conta1.getSaldo());
		conta1.imprimirSaldo();


        System.out.println(conta1.getNumeroConta());
        System.out.println(conta1.getNomeTitular());
        System.out.println(conta1.getSaldo());
        conta1.imprimirSaldo();
	}
}
