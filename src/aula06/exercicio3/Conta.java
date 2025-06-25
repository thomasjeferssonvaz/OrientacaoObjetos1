package aula06.exercicio3;

public class Conta {
	int numeroConta;
	String nomeTitular;
	double saldo;
	static int numTotalContas = 0;
	
	public Conta() {
		numTotalContas++;
		numeroConta = numTotalContas;
	}

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}
	
}
