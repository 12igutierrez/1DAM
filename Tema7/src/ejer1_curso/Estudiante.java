package ejer1_curso;

class Estudiante {
    private String nombre;
	private int edad;
    private double[] notas;

    public Estudiante(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }
    
    
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}


    public String mostrar() {
        String notasStr = "";
        for (int i = 0; i < notas.length; i++) {
            notasStr += notas[i] + (i < notas.length - 1 ? ", " : "");
        }
        return "El alumno de nombre " + nombre + " con edad " + edad + " y notas " + notasStr;
    }
}
