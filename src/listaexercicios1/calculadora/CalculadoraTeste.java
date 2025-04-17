package listaexercicios1.calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.marca = "Casio";
        calculadora.modelo = "FX-991EX";
        calculadora.tipo = "Científica";
        calculadora.memoriaInterna = 500;

        System.out.println("Detalhes da Terra:");
        System.out.println("Marca: " + calculadora.marca);
        System.out.println("Modelo: " + calculadora.modelo);
        System.out.println("Tipo: " + calculadora.tipo);
        System.out.println("Memória Interna: " + calculadora.memoriaInterna);

    }
}
