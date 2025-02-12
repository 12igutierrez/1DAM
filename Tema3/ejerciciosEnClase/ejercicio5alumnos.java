package ejerciciosEnClase;
import java.util.Scanner;
public class ejercicio5alumnos {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		String nombreAlumno = "";
        int numAsignaturas = 0;
        String asignaturaMayorNota = "";
        double mayorNotaAsignatura = 0;
        double sumaNotas;
        
        double mayorMedia=0;
        String alumnoMayorMedia="";
        double menorMedia=0;
        String alumnoMenorMedia="";
        
        // Proceso repetitivo para los 5 alumnos
        for (int i = 1; i <= 5; i++) {
            // Leer nombre del alumno
            System.out.print("Ingrese el nombre del alumno: ");
            nombreAlumno = sc.nextLine();

            // Leer número de asignaturas y validar que esté entre 1 y 6
            while (true) {
                System.out.print("Ingrese el número de asignaturas (entre 1 y 6): ");
                numAsignaturas = sc.nextInt();
                if (numAsignaturas >= 1 && numAsignaturas <= 6) 
                break;
                System.out.println("Número de asignaturas debe estar entre 1 y 6.");
            }

            // Inicializar variables para el cálculo de notas
            sumaNotas = 0;
            mayorNotaAsignatura = 0;
            sc.nextLine();  // Limpiar el buffer

            // Leer las asignaturas y notas
            for (int j = 1; j <= numAsignaturas; j++) {
                System.out.print("Ingrese el nombre de la asignatura: ");
                String nombreAsignatura = sc.nextLine();

                double nota;
                while (true) {
                    System.out.print("Ingrese la nota de " + nombreAsignatura + " (entre 1 y 10): ");
                    nota = sc.nextDouble();
                    if (nota >= 1 && nota <= 10) 
                    break;
                    System.out.println("La nota debe estar entre 1 y 10.");
                }
                sc.nextLine();

                // Sumar la nota para el cálculo de la media
                sumaNotas += nota;

                // Verificar si esta es la asignatura con la mayor nota para este alumno
                if (nota > mayorNotaAsignatura) {
                    mayorNotaAsignatura = nota;
                    asignaturaMayorNota = nombreAsignatura;
                }
            }

            // Calcular la nota media del alumno
            double notaMedia = sumaNotas / numAsignaturas;

            // Mostrar la nota media del alumno
            System.out.println("================================================");
            System.out.printf("%s tiene una nota media de %.2f\n", nombreAlumno, notaMedia);
            System.out.print("================================================");
       
            // Actualizar el alumno con la mayor y menor media
            if (i == 1 || notaMedia > mayorMedia) {
                 mayorMedia = notaMedia;
                 alumnoMayorMedia = nombreAlumno;
            }
            if (i == 1 || notaMedia < menorMedia) {
                 menorMedia = notaMedia;
                 alumnoMenorMedia = nombreAlumno;
            }

            // Mostrar los datos del alumno
            System.out.println("\nResumen del alumno:");
            System.out.println("NOMBRE   Nº ASIG   ASIGNATURA > NOTA");
            System.out.println(nombreAlumno+"     "+numAsignaturas+"           ("+asignaturaMayorNota+" "+mayorNotaAsignatura+")");
            System.out.println("=================================");
        }

        // Mostrar el alumno con mayor y menor media al final del proceso
        System.out.println("\nAlumno con mayor nota media:");
        System.out.println("El alumno :"+alumnoMayorMedia+" tiene la mayor media con un :"+mayorMedia);

        System.out.println("\nAlumno con menor nota media:");
        System.out.println("El alumno :"+alumnoMenorMedia+" tiene la menor media con un :"+menorMedia);

        
        
    }
}
