package aula09.exercicio;

public class Relogio {
	private String marca;
	private int hora;
	private int minutos;
	
	public Relogio(String marca, int hora, int minutos){
		this.marca = marca;
		this.hora = hora;
		this.minutos = minutos;
	}

	public String getMarca() {
		return this.marca;
	}

	public int getHora() {
		return this.hora;
	}

	public void setHora(int hora) {
		if(hora >=0 && hora <=23) {
			this.hora = hora;
		}
	}

	public int getMinutos() {
		return this.minutos;
	}

	public void setMinutos(int minutos) {
		if(minutos >=0 && minutos <=59) {
			this.minutos = minutos;
		}
	}

	@Override
	public String toString() {
		return "São "+hora+"h"+minutos+"min.";
	}
}
