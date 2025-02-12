package ejerciciosEnClase;
import java.util.Scanner;

public class Ejemplo3whileSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numero1, numero2;
        int resultado = 0;

        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Sumar Números");
            System.out.println("2. Restar Números");
            System.out.println("3. Multiplicar Números");
            System.out.println("4. Dividir Números");
            System.out.println("5. Fin");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                // Leer los dos números
                System.out.print("Ingrese el primer número: ");
                numero1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                numero2 = scanner.nextInt();

                // Realizar la operación seleccionada
                switch (opcion) {
                    case 1:
                        resultado = numero1 + numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = numero1 * numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                            resultado = 0;
                        }
                        System.out.println("Resultado: " + resultado);
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
