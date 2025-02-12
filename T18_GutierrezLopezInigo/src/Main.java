import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 3) {
            // Menú
            System.out.println("==================================");
            System.out.println("MENU DE EJERCICIOS:");
            System.out.println("1. EJERCICIO1. LECTURA PRODUCTOS.");
            System.out.println("2. EJERCICIO2. TRIANGULO.");
            System.out.println("3. FIN.");
            System.out.println("==================================");
            System.out.print("Opción de menú (1-3): ");

            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        ejercicio1LecturaProductos(sc);
                        break;
                    case 2:
                        ejercicio2Triangulo(sc);
                        break;
                    case 3:
                        System.out.println("FIN DE PROGRAMA");
                        break;
                    default:
                        System.out.println("ERROR. Introduce un número entre 1 y 3.");
                }
            }catch (InputMismatchException ex) {
                System.out.println("Incorrecto. Valor de 1 a 3: ");
                sc.nextLine();
            }
        }
        sc.close();
    }

    
    
    // Ejercicio 1
    public static void ejercicio1LecturaProductos(Scanner sc) {
        System.out.println("========================================================");
        System.out.println("EJERCICIO 1: LECTURA DE PRODUCTOS");
        System.out.println("========================================================");

        System.out.print("Introduce el Producto: ");
        String producto = sc.next();

        int cantidad = 0;
        while (true) {
            System.out.print("Introduce la cantidad (1-999): ");
            try {
                cantidad = sc.nextInt();
                if (cantidad >= 1 && cantidad <= 999) {
                    break;
                }else {
                    System.out.println("Cantidad fuera de rango.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
            }
        }

        int pvp = 0;
        while (true) {
            System.out.print("Introduce el PVP (1-9999): ");
            try {
                pvp = sc.nextInt();
                if (pvp >= 1 && pvp <= 9999) {
                    break;
                }else {
                    System.out.println("PVP fuera de rango.");
                }
            }catch (InputMismatchException ex) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
            }
        }

        int tIVA = 0;
        while (true) {
            System.out.print("Introduce IVA (1, 2, 3): ");
            try {
                tIVA = sc.nextInt();
                if (tIVA >= 1 && tIVA <= 3) {
                    break;
                }else {
                    System.out.println("Tipo de IVA incorrecto.");
                }
            }catch (InputMismatchException ex) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
            }
        }

        // Calcular el porcentaje de IVA
        double porcIVA = switch (tIVA) {
            case 1 -> 0.21;
            case 2 -> 0.10;
            case 3 -> 0.04;
            default -> 0.0;
        };

        // Calcular el importe total
        double importeTotal = cantidad * pvp * (1 + porcIVA);
        System.out.printf("Producto: %s, Importe total: %.2f\n", producto, importeTotal);
    }

    
    
    // Ejercicio 2
    public static void ejercicio2Triangulo(Scanner sc) {
        System.out.println("========================================================");
        System.out.println("EJERCICIO 2: TRIÁNGULO");
        System.out.println("========================================================");

        int n = 0;
        while (true) {
            System.out.print("Introduce un número entero > 0: ");
            try {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                }else {
                    System.out.println("El número debe ser mayor que 0.");
                }
            }catch (InputMismatchException ex) {
                System.out.println("Por favor, ingrese un número válido.");
                sc.next();
            }
        }

        System.out.print("Introduce un carácter: ");
        char caracter = sc.next().charAt(0);

        int desplazamiento = 0;

        // Dibujar los triángulos
        for (int t = 0; t < n; t++) {
            for (int i = 1; i <= n; i++) { // Altura del triangulo
                for (int j = 0; j < desplazamiento; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(caracter);
                }
                System.out.println();
            }
            desplazamiento += n;
        }
    }
}
