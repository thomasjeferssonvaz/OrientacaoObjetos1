package aula07.exercicio;

public class Pessoa {
    String nome;
    int idade;
    Double peso;
    
    public Pessoa( String nome, int idade, Double peso ) {
    	this.nome = nome;
    	this.idade = idade;
    	this.peso = peso;
    }

    public void andar(){
    	System.out.printf("%s está andando\n", this.nome);
    }
    public void correr(){
    	System.out.printf("%s está correndo\n", this.nome);
    }
    public void falar(){
    	System.out.printf("%s está falando\n", this.nome);
    }
	@Override
	public String toString() {
		return "\n----------------------------------\nNome=" + nome + "\n Idade=" + idade + "\n Peso=" + peso + "\n----------------------------------\n";
	}

}