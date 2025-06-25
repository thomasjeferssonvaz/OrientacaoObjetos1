package aula13.heranca;

public class VeiculoTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Gol", "Volks", 2020, 5, "Flex", 5);
		Aviao aviao1 = new Aviao("A-380", "AirBus", 1990, 800, "Combustivel de aviação", 30000);
		
		carro1.abastecer();
		carro1.calibrarPneus();
		
		aviao1.abastecer();
		aviao1.voar();
	}
}
