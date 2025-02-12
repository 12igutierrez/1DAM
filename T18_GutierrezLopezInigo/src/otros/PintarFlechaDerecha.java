package otros;

import java.util.Scanner;

public class PintarFlechaDerecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la longitud de la flecha: ");
        int longitud = scanner.nextInt();

        int mitad = longitud / 2;
        for (int i = 0; i < longitud; i++) {
            if (i == mitad) {
                for (int j = 0; j < longitud; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < mitad; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
