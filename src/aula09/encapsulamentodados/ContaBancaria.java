package aula09.encapsulamentodados;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
	}
	

	public void sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			System.out.println("Saque de R$"+valor+" realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double valor) {
		this.saldo +=valor;
		System.out.println("Deposito de R$"+valor+" realizado com sucesso.");
		this.calcularRendimento();
	}
	
	public void imprimirSaldo() {
		System.out.println("========================================");
		System.out.println("Número da conta: "+this.numeroConta);
		System.out.println("Nome do titular: "+this.nomeTitular);
		System.out.println("Saldo: R$"+this.saldo);
		System.out.println("========================================");
	}
	
	private void calcularRendimento() {
		this.saldo *= 1.10;
	}


	public int getNumeroConta() {
		return this.numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public String getNomeTitular() {
		return this.nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getSaldo() {
		return this.saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
