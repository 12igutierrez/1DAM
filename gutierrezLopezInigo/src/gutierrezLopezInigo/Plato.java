package gutierrezLopezInigo;

public class Plato {
	private int n_plato;
	private String nombre;
	private double precio;
	private int ingredientes;
	
	public Plato(int n_plato, String nombre, double precio, int ingredientes) {
		super();
		this.n_plato = n_plato;
		this.nombre = nombre;
		this.precio = precio;
		this.ingredientes = ingredientes;
	}
	
	public int getN_plato() {
		return n_plato;
	}
	public void setN_plato(int n_plato) {
		this.n_plato = n_plato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(int ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
	public void mostrarInformacion() {
		System.out.println(n_plato+": "+nombre+"______"+precio+"€");
	}
	
}
