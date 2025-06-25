package aula14.polimorfismo.sobreposicao;

public class Cavalo extends Mamifero{

	public Cavalo(String nome, String raca) {
		super(nome, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println(this.nome + " emitindo som cavalal");
	}
}
