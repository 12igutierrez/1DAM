package gutierrez_lopez_inigo_EjerciciosNavidades;
import java.util.Scanner;

public class notas_de_grupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos = 5;
        int trimestres = 3;

        int[][] notas = new int[alumnos][trimestres];

        for (int t = 0; t < trimestres; t++) {
            System.out.println("Notas para el trimestre " + (t + 1));
            for (int a = 0; a < alumnos; a++) {
                System.out.print("Alumno (" + (a + 1) + "): ");
                notas[a][t] = sc.nextInt();
            }
        }

        for (int t = 0; t < trimestres; t++) {
            double sumaTrimestre = 0;
            for (int a = 0; a < alumnos; a++) {
                sumaTrimestre += notas[a][t];
            }
            System.out.println("Media " + (t + 1) + "º trimestre: " + (sumaTrimestre / alumnos));
        }

        while (true) {
            System.out.print("Introduzca id del alumno u otro número para salir: ");
            int idAlumno = sc.nextInt();
            if (idAlumno < 1 || idAlumno > alumnos) {
                break;
            }
            double sumaAlumno = 0;
            for (int t = 0; t < trimestres; t++) {
                sumaAlumno += notas[idAlumno - 1][t];
            }
            System.out.println("La media del alumno es: " + (sumaAlumno / trimestres));
        }
        sc.close();
    }
}