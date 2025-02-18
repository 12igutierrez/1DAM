
public class Empleado {
    public enum Trabajo {CAMARERO, COCINERO}
    private String nombre;
	private int pedidosGestionados;
    private Trabajo trabajo;

    public Empleado(String nombre, Trabajo trabajo) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.pedidosGestionados = 0;
    }
    
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPedidosGestionados() {
		return pedidosGestionados;
	}
	public void setPedidosGestionados(int pedidosGestionados) {
		this.pedidosGestionados = pedidosGestionados;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
    

    public boolean isCocinero() {
        return trabajo == Trabajo.COCINERO;
    }

    public boolean isCamarero() {
        return trabajo == Trabajo.CAMARERO;
    }

    public void gestionaComanda() {
        if (isCamarero()) {
            pedidosGestionados++;
        }
    }

    public void cocinaComanda(int ingredientes) {
        if (isCocinero()) {
            pedidosGestionados += ingredientes;
        }
    }

    public void mostrarResumen() {
        if (isCamarero()) {
            System.out.println("Camareros> " + nombre + " ha realizado " + pedidosGestionados + " comandas.");
        } else if (isCocinero()) {
            System.out.println("Cocineros> " + nombre + " ha utilizado " + pedidosGestionados + " ingredientes.");
        }
    }
}
