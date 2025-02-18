package ejer2_vuelo;

 enum Rol {PILOTO, SERVICIO, CARGAMENTO;}

class Tripulante {
    private String nombre;
    private Rol rol;

    public Tripulante(String nombre, Rol rol) {
        this.nombre = nombre;
        this.rol = rol;
    }
    
    public void setNombre (String nombre) {
    	this.nombre = nombre;
    }
    public String getNombre() {
    	return nombre; }
    
    public void setRol (Rol rol) {
    	this.rol = rol;
    }
    public Rol getRol() { 
    	return rol; }
}

