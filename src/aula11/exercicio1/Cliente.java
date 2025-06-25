package aula11.exercicio1;

public class Cliente {
	private int id;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estadoCivil;
	
	public Cliente(int id, String nome, String dataNascimento, EstadoCivil estadoCivil) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
	}
	
	public void alterarEstadoCivil(EstadoCivil novoEstadoCivil) {
		this.estadoCivil = novoEstadoCivil;
	}
	
	public void imprimirDadosCliente() {
		System.out.println("Id: "+this.id);
		System.out.println("Nome: "+this.nome);
		System.out.println("Data de nascimento: "+this.dataNascimento);
		System.out.println("Estado Civíl: "+this.estadoCivil);
	}
}
