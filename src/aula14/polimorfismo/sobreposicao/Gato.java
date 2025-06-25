package aula14.polimorfismo.sobreposicao;

public class Gato extends Mamifero{

	
	
	public Gato(String nome, String raca) {
		super(nome, raca);
		
	}
	@Override
	public void emitirSom() {
		System.out.println(this.nome + " emitindo som gatal");
	}
	

}
