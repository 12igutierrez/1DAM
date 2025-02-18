package ejer2_vuelo;

class Pasajero {
    private String nombre;
    private String apellidos;
    private String pasaporte;
    private int asiento;
    private boolean conVentana;

    public Pasajero(String nombre, String apellidos, String pasaporte, int asiento, boolean conVentana) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pasaporte = pasaporte;
        this.asiento = asiento;
        this.conVentana = conVentana;
    }
    
    public void setNombre (String nombre) {
    	this.nombre = nombre;
    }
    public String getNombre() {
    	return nombre; 
    }
    
    public void setApellidos (String apellidos) {
    	this.apellidos = apellidos;
    }
    public String getApellidos() {
    	return apellidos; 
    }
    
    public void setPasaporte (String pasaporte) {
    	this.pasaporte = pasaporte;
    }
    public String getPasaporte() {
    	return pasaporte; 
    }
    
    public void setAsiento (int asiento) {
    	this.asiento = asiento;
    }
    public int getAsiento() { 
    	return asiento; 
    }
    
    public void setConVentana (boolean conVentana) {
    	this.conVentana = conVentana;
    }
    public boolean getConVentana() {
    	return conVentana;
    }
    
    public void mostrarDatos() {
        System.out.println("El asiento " + asiento + " " + (conVentana ? "con ventana" : "sin ventana") +
                " está ocupado por el pasajero de nombre " + nombre + ", apellido " + apellidos + " y pasaporte " + pasaporte);
    }
}