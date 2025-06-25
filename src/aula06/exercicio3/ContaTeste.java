package aula06.exercicio3;

public class ContaTeste {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		conta1.nomeTitular = "Thomas";
		conta2.nomeTitular = "Fernanda";
		conta3.nomeTitular = "Rafael";
		
		conta1.saldo = 0;
		conta2.saldo = 0;
		conta3.saldo = 0;
		
		System.out.println(conta1);
		System.out.println(conta2);
		System.out.println(conta3);
	}
}
