package aula03;

public class CarroTeste {
	public static void main(String[] args) {
		//instanciando objeto Carro
		Carro carro1 = new Carro();
		
		Carro carro2 = new Carro();
		
		//atribuicao para os atributos do carro
		carro1.modelo = "458 Italia";
		carro1.marca = "Ferrari";
		carro1.ano = 2015;
		carro1.placa = "ABC-1234";
		carro1.cor = "Vermelho";
		
		carro2.modelo = "Civic";
		carro2.marca = "Honda";
		carro2.ano = 2020;
		carro2.placa = "MND-9876";
		carro2.cor = "Azul";
		
		
		//obtenção dos valores de cada carro
		System.out.printf("Modelo: %s\n", carro1.modelo);
		System.out.printf("Marca: %s\n", carro1.marca);
		System.out.printf("Ano: %d\n", carro1.ano);
		System.out.printf("Placa: %s\n", carro1.placa);
		System.out.printf("Cor: %s\n", carro1.cor);
		
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.printf("Modelo: %s\n", carro2.modelo);
		System.out.printf("Marca: %s\n", carro2.marca);
		System.out.printf("Ano: %d\n", carro2.ano);
		System.out.printf("Placa: %s\n", carro2.placa);
		System.out.printf("Cor: %s\n", carro2.cor);
		
		
	}
}
