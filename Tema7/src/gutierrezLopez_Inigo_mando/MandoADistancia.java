package gutierrezLopez_Inigo_mando;

public class MandoADistancia {
	public enum Estado {ENCENDIDO,APAGADO};
	private int canal;
	private String [] CanalesDisponibles = new String [10];
	private int volumen;
	private Estado estado;
	
	
	MandoADistancia() {
		volumen = 12;
		estado = Estado.APAGADO;
		canal = 1;
		CanalesDisponibles = new String []{"La 1","La 2","Antena 3","Cuatro","Telecinco","La Sexta","CCM","Clan","Boing","Teledeporte"};
		
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Estado getEstado() {
		return estado;
	}
	
	public void setCanal(int canal) {
		if (canal >= 1 && canal <= 10) {
			this.canal = canal;
		} else {
			this.canal = 1;
		}
	}
	public int getCanal() {
		return canal;
	}
	
    public void setCanalesDisponibles(String [] CanalesDisponibles) {
		if (CanalesDisponibles != null && CanalesDisponibles.length > 10) {
			System.out.println("ERROR: No puede haber mas de 10 canales");
		}
	}
	public String [] getCanalesDisponibles() {
		return CanalesDisponibles;
	}
	
    public void setVolumen(int volumen) {
		if (volumen > 0 && volumen < 100) {
			this.volumen = volumen;
		} else 
			this.volumen = 12;
	}
	public int getVolumen() {
		return volumen;
	}
	
	
	public void incrementarVolumen() {
		if (volumen > 0 && volumen < 100) {
			if (estado == Estado.ENCENDIDO) {
				volumen++;
				System.out.println("Se ha incrementado el volumen a "+volumen);
			} else {
				System.out.println("La televisión está apagada");
			}
		} else {
			System.out.println("ERROR: Volumen por encima de rango");
		}
	}
	
	public void disminuirVolumen() {
		if (volumen > 0 && volumen < 100) {
			if (estado == Estado.ENCENDIDO) {
				volumen--;
				System.out.println("Se ha disminuido el volumen a "+volumen);
			} else {
				System.out.println("La televisión está apagada");
			}
		} else {
			System.out.println("ERROR: Volumen por debajo de rango");
		}
		
	}
	
	public void siguienteCanal() {
		if (estado == Estado.ENCENDIDO) {
			canal++;
			if (canal > 10) {
				canal = 1;
			}
			System.out.println("Actualmente viendo el canal "+CanalesDisponibles[canal-1]+" en el numero "+canal);
		} else {
			System.out.println("La televisión está apagada");
		}
	}
	
	public void anteriorCanal() {
		if (estado == Estado.ENCENDIDO) {
			canal--;
			if (canal < 1) {
				canal = 10;
			}
			System.out.println("Actualmente viendo el canal "+CanalesDisponibles[canal-1]+" en el numero "+canal);
		} else {
			System.out.println("La televisión está apagada");
		}
	}
	
	public void encenderTelevision() {
		if (estado == Estado.APAGADO) {
		estado = Estado.ENCENDIDO;
		System.out.println("La television se ha encendido\nActualmente viendo el canal "+CanalesDisponibles[canal-1]+" en el numero "+canal);
		}
	}
	
	public void apagarTelevision() {
		if (estado == Estado.ENCENDIDO) {
			estado = Estado.APAGADO;
			System.out.println("La televisión se ha apagado");
		} else {
			System.out.println("La televisión ya está apagada");
		}
	}
	
}
