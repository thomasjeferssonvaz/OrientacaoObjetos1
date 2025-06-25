package aula06.exercicio3;

public class GalinhaTeste {
	public static void main(String[] args) {
		Galinha g1 = new Galinha();
		Galinha g2 = new Galinha();
		Galinha g3 = new Galinha();
		
		g1.nome = "Giselda";
		g2.nome = "Matilde";
		g3.nome = "Clotilde";
		
		g1.botar();
		g1.botar();
		g1.botar();
		g1.botar();
		
		g2.botar();
		
		g3.botar();
		g3.botar();
		g3.botar();
		g3.botar();
		g3.botar();
		
		System.out.println(g1.nome + " botou " + g1.quantidadeOvos + " ovos");
		System.out.println(g2.nome + " botou " + g2.quantidadeOvos + " ovos");
		System.out.println(g3.nome + " botou " + g3.quantidadeOvos + " ovos");
		System.out.println("Foram botados no total: " + Galinha.quantOvosGranja + " ovos.");
	}
}
