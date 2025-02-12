import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2Corregido {

    public static void main(String[] args) {
        // La combinación a adivinar
        int n1 = 0, n2 = 9, n3 = 3, n4 = 6;

        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int intentos = 0; // Contador de intentos

        System.out.println("Adivina la combinación de 4 números (0-9) sin repetir.");

        intentos = extracted(n1, n2, n3, n4, scanner, intentos);

        if (intentos == 10) {
            System.out.println("<<Lo siento, has agotado los 10 intentos. ¡Mejor suerte la próxima vez!>>");
        }

        scanner.close();
    }

	private static int extracted(int n1, int n2, int n3, int n4, Scanner scanner, int intentos) {
		while (intentos < 10) {
            intentos++;
            System.out.println("Intento " + intentos + ":");

            int u1 = -1, u2 = -1, u3 = -1, u4 = -1;

            // Leer los números ingresados por el usuario
            try {
                System.out.print("     Introduce número (0-9) 1: ");
                u1 = scanner.nextInt();
                System.out.print("     Introduce número (0-9) 2: ");
                u2 = scanner.nextInt();
                System.out.print("     Introduce número (0-9) 3: ");
                u3 = scanner.nextInt();
                System.out.print("     Introduce número (0-9) 4: ");
                u4 = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("¡Entrada inválida! Solo se permiten números del 0 al 9.");
                scanner.next(); // Limpiar el buffer
                intentos--;
                continue;
            }

            // Verificar si los números son válidos y no repetidos
            if (u1 < 0 || u1 > 9 || u2 < 0 || u2 > 9 || u3 < 0 || u3 > 9 || u4 < 0 || u4 > 9) {
                System.out.println("¡Solo se permiten números entre 0 y 9!");
                intentos--;
                continue;
            }

            if (u1 == u2 || u1 == u3 || u1 == u4 || u2 == u3 || u2 == u4 || u3 == u4) {
                System.out.println("Hay números repetidos, inténtalo de nuevo.");
                intentos--;
                continue;
            }

            // Calcular aciertos y coincidencias
            int aciertos = 0, coincidencias = 0;

            if (u1 == n1) aciertos++;
            else if (u1 == n2 || u1 == n3 || u1 == n4) coincidencias++;

            if (u2 == n2) aciertos++;
            else if (u2 == n1 || u2 == n3 || u2 == n4) coincidencias++;

            if (u3 == n3) aciertos++;
            else if (u3 == n1 || u3 == n2 || u3 == n4) coincidencias++;

            if (u4 == n4) aciertos++;
            else if (u4 == n1 || u4 == n2 || u4 == n3) coincidencias++;

            // Mostrar los resultados del intento
            System.out.println("Números introducidos: [" + u1 + ", " + u2 + ", " + u3 + ", " + u4 + "]");
            System.out.println("Aciertos: " + aciertos);
            System.out.println("Coincidencias: " + coincidencias);

            // Verificar si ha ganado
            if (aciertos == 4) {
                System.out.println("<<¡ENHORABUENA, HAS ACERTADO LA COMBINACIÓN EN " + intentos + " INTENTOS!>>");
                break;
            }
        }
		return intentos;
	}
}

