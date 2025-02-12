package otros;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAlumnos = -1;
        

        System.out.println("EJERCICIO 3. Inigo Gutierrez Lopez");
        System.out.println("===============================================");
        System.out.println("ENTRADA DE DATOS DE ASIGNATURAS");
        try {
        System.out.print("Número de alumnos: ");
        numeroAlumnos = sc.nextInt();
        sc.nextLine();
        }catch(java.util.InputMismatchException ex) {
        	System.out.println("Error: introduce un valor correcto");
        	sc.nextLine();
        }

        // Variables 
        String nombreAlumno = ""; 
        double notaMayor = -1;
        double notaMenor = 11;
        double notaT1 = 0;
        double notaT2 = 0;
        double notaT3 = 0;
        double notaT4 = 0;
        double sumaNotas = 0;

        
        if (numeroAlumnos < -1) {
        	System.out.println("Error. El numero de alumnos debe ser > o = 0");
        } else if(numeroAlumnos == 0) {
        	System.out.println("Como no hay alumnos no hay que leer notas");
        }
        else {
        for (int i = 1; i <= numeroAlumnos; i++) {
            System.out.println("===============================================");
            System.out.println("Alumno " + i + ":");
            System.out.print("Nombre del alumno: ");
            nombreAlumno = sc.nextLine();
            System.out.print("Nota tema 1 (25%) (1 y 10): ");
            notaT1 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nota tema 2 (35%) (1 y 10): ");
            notaT2 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nota tema 3 (16%) (1 y 10): ");
            notaT3 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nota tema 4 (24%) (1 y 10): ");
            notaT4 = sc.nextDouble();
            sc.nextLine();
            
            sumaNotas = notaT1 + notaT2 + notaT3 + notaT4;
            System.out.print("\tNota total: "+sumaNotas);
            System.out.println();
        }

   
 
            System.out.println("=========================");
            System.out.println("Nota media en la asignatura: "+sumaNotas / 4);
            System.out.println("Alumno con más nota total : "+nombreAlumno+", Nota: "+sumaNotas);

            
            }

        }
}