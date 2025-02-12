package Clase3;

public class Hora {
	private int hora;
	private int minutos;
	private int segundos;
	
	Hora(){
		hora = 0;
		minutos = 0;
		segundos = 0;
	}
	
	Hora(int hora,int minutos,int segundos){
		if (hora >= 0 || hora < 24) {
			this.hora = hora;
		} else {
			this.hora = 0;
		}
		
		if (minutos >= 0 || minutos < 59) {
			this.minutos = minutos;
		} else {
			this.hora = 0;
		}
		
		if (segundos >= 0 || segundos < 59) {
			this.segundos = segundos;
		} else {
			this.segundos = 0;
		}
		
	}
	
	public void setHora(int hora) {
		if (hora >= 0 || hora < 24) {
			this.hora = hora;
		}
	}
	public int getHora() {
		return hora;
	}
	
	
	public void setMinutos(int minutos) {
		if (minutos >= 0 || minutos < 59) {
			this.minutos = minutos;
		}
	}
	public int getMinutos() {
		return minutos;
	}
	
	
	public void setSegundos(int segundos) {
		if (segundos >= 0 || segundos < 59) {
			this.segundos = segundos;
		}
	}
	public int getSegundos() {
		return segundos;
	}
	
	
	public void segundosPasados(int segundos) {
	    int totalSegundos = this.hora * 3600 + this.minutos * 60 + this.segundos + segundos;
	    this.hora = (totalSegundos / 3600) % 24;
	    this.minutos = (totalSegundos % 3600) / 60;
	    this.segundos = totalSegundos % 60;
	}

	public void queHoraEs() {
		System.out.println("Son las: "+hora+":"+minutos+":"+segundos);
	}
	
}