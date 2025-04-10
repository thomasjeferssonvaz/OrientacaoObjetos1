package listaexercicios1.carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();


        carro1.modelo = "Siena";
        carro1.marca = "Fiat";
        carro1.cor = "Prata";
        carro1.ano = 2010;
        carro1.renavam = 1234568901;
        carro1.chassi = "ABC123DEF456GHI789";
        carro1.placa = "XYZ-1234";


        carro2.modelo = "Gol";
        carro2.marca = "Volkswagen";
        carro2.cor = "Vermelho";
        carro2.ano = 2022;
        carro2.renavam = 987652109;
        carro2.chassi = "JKL987MNO654PQR321";
        carro2.placa = "DEF-5678";

        carro3.modelo = "Onix";
        carro3.marca = "Chevrolet";
        carro3.cor = "Branco";
        carro3.ano = 2023;
        carro3.renavam = 1122344556;
        carro3.chassi = "STU321VWX987YZA654";
        carro3.placa = "GHI-9012";


        System.out.println("Carro 1:");
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Renavam: " + carro1.renavam);
        System.out.println("Chassi: " + carro1.chassi);
        System.out.println("Placa: " + carro1.placa);
        System.out.println();

        System.out.println("Carro 2:");
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Renavam: " + carro2.renavam);
        System.out.println("Chassi: " + carro2.chassi);
        System.out.println("Placa: " + carro2.placa);
        System.out.println();

        System.out.println("Carro 3:");
        System.out.println("Modelo: " + carro3.modelo);
        System.out.println("Marca: " + carro3.marca);
        System.out.println("Cor: " + carro3.cor);
        System.out.println("Ano: " + carro3.ano);
        System.out.println("Renavam: " + carro3.renavam);
        System.out.println("Chassi: " + carro3.chassi);
        System.out.println("Placa: " + carro3.placa);
    }
}
