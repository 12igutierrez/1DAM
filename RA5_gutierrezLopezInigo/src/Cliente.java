
public class Cliente {
    private String nombre;
	private int mesa;
    private double totalCuenta;

    public Cliente(String nombre, int mesa, double totalCuenta) {
        this.nombre = nombre;
        this.mesa = mesa;
        this.totalCuenta = 0;
        this.totalCuenta = totalCuenta;
    }

    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public double getTotalCuenta() {
		return totalCuenta;
	}
	public void setTotalCuenta(double totalCuenta) {
		this.totalCuenta = totalCuenta;
	}
    
    
    public void anyadirACuenta(double valor) {
        totalCuenta += valor;
    }

    
    public void mostrarCuenta() {
        System.out.println("El total de su comida es " + totalCuenta + "€, gracias por su visita.");
    }
}
