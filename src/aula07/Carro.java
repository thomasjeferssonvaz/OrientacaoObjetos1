package aula07;

public class Carro {
	//atributos Classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;
	
	//Método Construtor da classe carro
	public Carro(String modelo, String marca, int ano,String placa, String cor) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		ligado = false;
		velocidade = 0;
	}
	
	
	//métodos Classe Carro
	public void ligar() {
		if(ligado) {
			System.out.println("Carro já está ligado");
		} else {
			System.out.printf("O carro de marca %s, modelo %s e cor %s está ligando.\n", marca, modelo, cor);
			ligado = true;
		}	
	}
	
	public void desligar() {
		if(ligado && velocidade == 0) {
			System.out.printf("O carro de marca %s, modelo %s e cor %s está desligando.\n", marca, modelo, cor);
			ligado = false;
		} else {
			if(velocidade>0) {
				System.out.println("Carro muito rapido para parar.");
			} 
		if(ligado == false){
				System.out.println("Carro precisa estar ligado para desligar");
			}
		}
	}
	
	public void aceleral() {
		if (ligado) {
			if(velocidade <200) {
				System.out.printf("O carro de marca %s, modelo %s e cor %s está acelerando.\n", marca, modelo, cor);
				velocidade = velocidade + 10;
				System.out.println("Velocidade atual do carro: " + velocidade);
			} else {
				System.err.println("Carro já está na velocidade máxima");
			}
		} 
		if(ligado == false) {
			System.out.println("Carro precisa estar ligado para acelerar.");
		}
	}
	public void frear() {
		
		if(ligado) {
			if(velocidade>=10) {
				System.out.printf("O carro de marca %s, modelo %s e cor %s está freando.\n", marca, modelo, cor);
				velocidade = velocidade - 10;
				System.out.println("Velocidade atual do carro: "+ velocidade);
			}
		} 
		if(ligado == false) {
			System.out.println("Carro precisa estar ligado para frear");
		}
	}


	@Override
	public String toString() {
		return "\n----------------------------------\nCarro \n Modelo=" + modelo + "\n Marca=" + marca + "\n Ano=" + ano + "\n Placa=" + placa + "\n Cor=" + cor
				+ "\n Ligado=" + ligado + "\n Velocidade=" + velocidade + "\n----------------------------------\n";
	}
	
}