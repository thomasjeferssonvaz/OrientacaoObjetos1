package aula05;

public class Carro {
	//atributos Classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;
	
	
	
	
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
		if(ligado && velocidade<20) {
			System.out.printf("O carro de marca %s, modelo %s e cor %s está desligando.\n", marca, modelo, cor);
			ligado = false;
		} else {
			if(velocidade>20) {
				System.out.println("Carro muito rapido para parar.");
			} else {
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
		} else {
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
		} else {
			System.out.println("Carro precisa estar ligado para frear");
		}
	}
	
}