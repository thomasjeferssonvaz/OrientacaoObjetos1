package aula11.exercicio2;

public class UnidadeFederativaTeste {
	public static void main(String[] args) {
		Empresa empresa = new Empresa("empresa1", "3456789", UnidadeFederativa.PARANA);
		
		empresa.imprimirDadosEmpresa();
		empresa.alterarUnidadeFederativa(UnidadeFederativa.RIO_GRANDE_DO_SUL);
		System.out.println();
		System.out.println("==========");
		System.out.println();
		empresa.imprimirDadosEmpresa();
	}
}
