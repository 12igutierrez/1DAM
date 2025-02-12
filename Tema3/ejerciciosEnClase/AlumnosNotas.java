package ejerciciosEnClase;
import java.util.Scanner;

public class AlumnosNotas {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Número de alumnos a leer: ");
        int numeroAlumnos = sc.nextInt();
        sc.nextLine();

        String nombreMayor = "";
        String nombreMenor = "";
        double notaMayor = -1;
        double notaMenor = 11;

        for (int i = 1; i <= numeroAlumnos; i++) {
            System.out.println("===============================================");
            System.out.println("ENTRADA DE DATOS PARA ALUMNO " + i + ":");
            System.out.print("Nombre de alumno: ");
            String nombreAlumno = sc.nextLine();

            int numeroAsignaturas;
            do {
                System.out.print("Número de asignaturas (entre 1 y 6): ");
                numeroAsignaturas = sc.nextInt();
                if (numeroAsignaturas < 1 || numeroAsignaturas > 6) {
                    System.out.println("Error: el número de asignaturas debe estar entre 1 y 6.");
                }
            } while (numeroAsignaturas < 1 || numeroAsignaturas > 6);

            sc.nextLine();

            double sumaNotas = 0;
            double notaMaxima = -1;
            String asignaturaMaxima = "";

            for (int j = 1; j <= numeroAsignaturas; j++) {
                System.out.print("Nombre de asignatura " + j + ": ");
                String nombreAsignatura = sc.nextLine();

                double nota;
                do {
                    System.out.print("Nota (entre 1 y 10): ");
                    nota = sc.nextDouble();
                    if (nota < 1 || nota > 10) {
                        System.out.println("Error: la nota debe estar entre 1 y 10.");
                    }
                } while (nota < 1 || nota > 10);

                sumaNotas += nota;

                if (nota > notaMaxima) {
                    notaMaxima = nota;
                    asignaturaMaxima = nombreAsignatura;
                }

                sc.nextLine();
            }

            double notaMedia = sumaNotas / numeroAsignaturas;
            System.out.printf("%nNota media: %.2f%n", notaMedia);
            System.out.println("Asignatura con más nota: " + asignaturaMaxima);

            if (notaMedia > notaMayor) {
                notaMayor = notaMedia;
                nombreMayor = nombreAlumno;
            }

            if (notaMedia < notaMenor) {
                notaMenor = notaMedia;
                nombreMenor = nombreAlumno;
            }
        }

        System.out.println("===============================================");
        System.out.printf("Alumno con mayor nota media: %s (%.2f)%n", nombreMayor, notaMayor);
        System.out.printf("Alumno con menor nota media: %s (%.2f)%n", nombreMenor, notaMenor);
    }
}