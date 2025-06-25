package aula14.polimorfismo.sobreposicao;

public class MamiferoTeste {
	public static void main(String[] args) {
		Gato gato = new Gato("Garfield", "Amarelo");
		Cachorro cachorro = new Cachorro("Spike", "Pastor");
		Cavalo cavalo = new Cavalo("Pé de pano", "Marchador");
		
		gato.emitirSom();
		cachorro.emitirSom();
		cavalo.emitirSom();
	}
}
