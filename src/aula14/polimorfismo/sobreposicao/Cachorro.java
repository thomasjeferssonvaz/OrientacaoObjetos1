package aula14.polimorfismo.sobreposicao;

public class Cachorro extends Mamifero{

	public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
	@Override
	public void emitirSom() {
		System.out.println(this.nome + " emitindo som cachorral");
	}
	
}
