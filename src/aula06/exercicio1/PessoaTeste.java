package aula06.exercicio1;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.nome = "Thomas";
		p1.dataNasc = "07-10-2005";
		p1.telefone = "42998256985";
		p1.email = "thomas.jefersson.vaz@alunos.utfpr.edu.br";
		p1.estadoCivil = "Solteiro";

		p2.nome = "Fernanda";
		p2.dataNasc = "19-04-2006";
		p2.telefone = "42999470868";
		p2.email = "fernanda.michelis.mantuani@alunos.utfpr.edu.br";
		p2.estadoCivil = "Solteira";
		
		p3.nome = "Rafael";
		p3.dataNasc = "03-08-2006";
		p3.telefone = "42995697458";
		p3.email = "rafael.silva@alunos.utfpr.edu.br";
		p3.estadoCivil = "Solteiro";
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

	
}
