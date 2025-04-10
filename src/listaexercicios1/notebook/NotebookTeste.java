package listaexercicios1.notebook;

public class NotebookTeste {
    public static void main(String[] args) {
        Notebook note = new Notebook();
        note.marca = "Dell";
        note.modelo = "Inspiron 15";
        note.tamanhoTela = 15.6;
        note.processadorModelo ="Intel Core i5";
        note.quantRam = 8;
        note.quantArmazenamento = 512;

        System.out.println("Detalhes do Notebook:");
        System.out.println("Marca: " + note.marca);
        System.out.println("Modelo: " + note.modelo);
        System.out.println("Tamanho da Tela: " + note.tamanhoTela + " polegadas");
        System.out.println("Processador: " + note.processadorModelo);
        System.out.println("RAM: " + note.quantRam + " GB");
        System.out.println("Armazenamento: " + note.quantArmazenamento + " GB");
    }
}
