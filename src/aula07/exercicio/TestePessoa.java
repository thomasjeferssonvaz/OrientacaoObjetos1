package aula07.exercicio;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 25, 68.8);
        Pessoa p2 = new Pessoa("Maria", 30, 55.6);
        Pessoa p3 = new Pessoa("José", 32, 62.4);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        p1.andar();
        p1.correr();
        p1.falar();

        p2.andar();
        p2.correr();
        p2.falar();
        
        p3.andar();
        p3.correr();
        p3.falar();
        

        
    }
}
