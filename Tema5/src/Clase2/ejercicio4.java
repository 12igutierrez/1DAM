package Clase2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t_tabla;

        System.out.print("¿Qué tipo de tabla quieres? (1.Int 2.Double 3.Booleano, 0 para salir): ");
        t_tabla = sc.nextInt();
        sc.nextLine();
            
        switch (t_tabla) {
            case 0:
                System.out.println("Saliendo del programa");
                break;
            case 1:
                es_int();
                break;
            case 2:
                es_double();
                break;
            case 3:
                es_boolean();
                break;
            default:
                System.out.println("Número incorrecto, vuelve a intentarlo.");
                break;
        }
    }

    private static void es_int() {
        int longitud = 0;

        while (true) {
            try {
                System.out.print("Introduce la longitud de la tabla: ");
                longitud = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                sc.nextLine();
            }
        }

        int[] tabla_i = new int[longitud];

        System.out.println("Se ha creado una tabla de tipo int y de longitud "+longitud);
        System.out.println("=========================================================");

        for (int i = 0; i < longitud; i++) {
            	System.out.print("Introduce un número ("+i+"): ");
            	if (sc.hasNextInt()) {
                    tabla_i[i] = sc.nextInt();
                    sc.nextLine();       
                } else{
                     System.out.println("Error: Debes ingresar un número entero.");
                     sc.nextLine();
            }  
        }

        System.out.println("=========================================================");
        System.out.print("La tabla es: {");
        for (int i = 0; i < longitud; i++) {
            System.out.print(tabla_i[i] + ",");
        }
        System.out.println("}");

        System.out.println("=========================================================");
        System.out.print("Posición de memoria: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(""+tabla_i+i+ "],");
        }
    }

    private static void es_double() {
        int longitud = 0;

        while (true) {
            try {
                System.out.print("Introduce la longitud de la tabla: ");
                longitud = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                sc.nextLine();
            }
        }

        double[] tabla_d = new double[longitud];

        System.out.println("Se ha creado una tabla de tipo double y de longitud "+longitud);
        System.out.println("=========================================================");

        for (int i = 0; i < longitud; i++) {
            while (true) {
                try {
                    System.out.print("Introduce un número ("+i+"): ");
                    tabla_d[i] = sc.nextDouble();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un número decimal (double).");
                    sc.nextLine();
                }
            }
        }

        System.out.println("=========================================================");
        System.out.print("La tabla es: {");
        for (int i = 0; i < longitud; i++) {
            System.out.print(tabla_d[i] + ",");
        }
        System.out.println("}");

        System.out.println("=========================================================");
        System.out.print("Posición de memoria: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(""+tabla_d+i+"],");
        }
    }

    private static void es_boolean() {
        int longitud = 0;

        while (true) {
            try {
                System.out.print("Introduce la longitud de la tabla: ");
                longitud = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                sc.nextLine();
            }
        }

        boolean[] tabla_b = new boolean[longitud];

        System.out.println("Se ha creado una tabla de tipo boolean y de longitud "+longitud);
        System.out.println("=========================================================");

        for (int i = 0; i < longitud; i++) {
            while (true) {
                try {
                    System.out.print("Introduce un valor (true o false) ("+i+"): ");
                    tabla_b[i] = sc.nextBoolean();
                    sc.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un valor booleano (true o false).");
                    sc.nextLine();
                }
            }
        }

        System.out.println("=========================================================");
        System.out.print("La tabla es: {");
        for (int i = 0; i < longitud; i++) {
            System.out.print(tabla_b[i] + ",");
        }
        System.out.println("}");

        System.out.println("=========================================================");
        System.out.print("Posición de memoria: ");
        for (int i = 0; i < longitud; i++) {
            System.out.print(""+tabla_b+i+"],");
        }
    }
}