package aula03.exercicios;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.nome = "João";
        p1.idade = 25;
        p1.peso = 68.8;


        p2.nome = "Maria";
        p2.idade = 30;
        p2.peso = 55.6;


        p3.nome = "José";
        p3.idade = 32;
        p3.peso = 62.4;

        System.out.println();
        System.out.println();
        System.out.printf("Pessoa 1: %s.\nIdade: %d.\nPeso: %.2f.\n", p1.nome, p1.idade, p1.peso);
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        System.out.printf("Pessoa 2: %s.\nIdade: %d.\nPeso: %.2f.\n", p2.nome, p2.idade, p2.peso);
        System.out.println();
        System.out.println("---------------");
        System.out.println();
        System.out.printf("Pessoa 3: %s.\nIdade: %d.\nPeso: %.2f.\n", p3.nome, p3.idade, p3.peso);

    }
}
