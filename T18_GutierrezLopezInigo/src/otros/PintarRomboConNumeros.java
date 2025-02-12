package otros;

import java.util.Scanner;

public class PintarRomboConNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del diamante (impar): ");
        int altura = scanner.nextInt();

        if (altura % 2 == 0) {
            System.out.println("La altura debe ser un número impar.");
            return;
        }

        int mitad = altura / 2;
        for (int i = 0; i < altura; i++) {
            int espacios = Math.abs(mitad - i);
            int numeros = altura - 2 * espacios;

            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numeros; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}