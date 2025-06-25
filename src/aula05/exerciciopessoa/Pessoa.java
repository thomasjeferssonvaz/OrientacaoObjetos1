package aula05.exerciciopessoa;

public class Pessoa {
    String nome;
    int idade;
    Double peso;
    
    

    public void andar(){
    	System.out.printf("%s está andando\n", nome);
    }
    public void correr(){
    	System.out.printf("%s está correndo\n", nome);
    }
    public void falar(){
    	System.out.printf("%s está falando\n", nome);
    }
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}

}