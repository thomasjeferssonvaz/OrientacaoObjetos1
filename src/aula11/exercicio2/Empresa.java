package aula11.exercicio2;

public class Empresa {
	private String razaoSocial;
	private String cnpj;
	private UnidadeFederativa unidadeFederativa;
	
	public Empresa(String razaoSocial, String cnpj, UnidadeFederativa novaUnidadeFederativa) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.unidadeFederativa = novaUnidadeFederativa;
	}
	
	public void alterarUnidadeFederativa(UnidadeFederativa novaUnidadeFederativa) {
		this.unidadeFederativa = novaUnidadeFederativa;
	}
	
	
	public void imprimirDadosEmpresa() {
		System.out.println("Razão social: "+this.razaoSocial);
		System.out.println("CNPJ: "+this.cnpj);
		System.out.println("Nome da unidade Federativa: "+this.unidadeFederativa.getNome());
		System.out.println("Sigla da unidade Federativa: "+this.unidadeFederativa.getSigla());
		System.out.println("Capital da unidade Federativa: "+this.unidadeFederativa.getCapital());
	}
}
