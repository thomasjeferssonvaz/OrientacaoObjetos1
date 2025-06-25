package aula09.exercicio;

public class RelogioTeste {
	public static void main(String[] args) {
		Relogio reg1 = new Relogio("Sony", 21, 42);
		
		reg1.getMarca();
		reg1.getHora();
		reg1.getMinutos();
		
		reg1.setHora(23);
		reg1.setMinutos(59);
		System.out.println(reg1);
		
		reg1.setHora(24);
		reg1.setMinutos(00);
		System.out.println(reg1);
	}
}
