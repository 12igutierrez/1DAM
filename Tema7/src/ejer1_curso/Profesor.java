package ejer1_curso;

class Profesor {
    private String nombre;
    private String asignatura;
    private String dni;
    private String fechaAlta;

    public Profesor(String nombre, String asignatura, String dni, String fechaAlta) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() { 
    	return nombre; 
    }
    public String getAsignatura() {
    	return asignatura; 
    }
    public String getDni() { 
    	return dni; 
    }
    public String getFechaAlta() { 
    	return fechaAlta; 
    }

    public String mostrar() {
        return "El profesor de nombre " + nombre + " con DNI " + dni +
                " imparte la asignatura " + asignatura + " desde " + fechaAlta;
    }
}
