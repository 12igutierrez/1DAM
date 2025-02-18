package ejer1_curso;

class Curso {
    private String nombreCurso;
    private Profesor[] profesores;
    private Estudiante[] estudiantes;
    private int numProfesores;
    private int numEstudiantes;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.profesores = new Profesor[10];
        this.estudiantes = new Estudiante[20];
        this.numProfesores = 0;
        this.numEstudiantes = 0;
    }

    public void anyadirEstudiante(String nombre, int edad, double[] notas) {
        if (numEstudiantes < 20) {
            estudiantes[numEstudiantes] = new Estudiante(nombre, edad, notas);
            numEstudiantes++;
        }
    }

    public void eliminarEstudiante(String nombre) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                for (int j = i; j < numEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[numEstudiantes - 1] = null;
                numEstudiantes--;
                return;
            }
        }
    }

    public void anyadirProfesor(String nombre, String asignatura, String dni, String fechaAlta) {
        if (numProfesores < 10) {
            profesores[numProfesores] = new Profesor(nombre, asignatura, dni, fechaAlta);
            numProfesores++;
        }
    }

    public void eliminarProfesor(String nombre) {
        for (int i = 0; i < numProfesores; i++) {
            if (profesores[i].getNombre().equals(nombre)) {
                for (int j = i; j < numProfesores - 1; j++) {
                    profesores[j] = profesores[j + 1];
                }
                profesores[numProfesores - 1] = null;
                numProfesores--;
                return;
            }
        }
    }

    public void buscarEstudiante(String nombre) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(estudiantes[i].mostrar());
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    public void calcularMediaNotas() {
        for (int i = 0; i < numProfesores; i++) {
            double suma = 0;
            int contador = 0;
            for (int j = 0; j < numEstudiantes; j++) {
                suma += estudiantes[j].getNotas()[i];
                contador++;
            }
            double media = contador > 0 ? suma / contador : 0;
            System.out.println(profesores[i].getAsignatura() + ": " + media);
        }
    }

    public void mostrarListado() {
        System.out.println("Profesores:");
        for (int i = 0; i < numProfesores; i++) {
            System.out.println(profesores[i].mostrar());
        }
        System.out.println("Estudiantes:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println(estudiantes[i].mostrar());
        }
    }
}
