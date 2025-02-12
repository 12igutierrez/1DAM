package otros;

import java.util.Scanner;

public class PintarFlechaArribaRellena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño = 0;

        while (true) {
            try {
                System.out.println("Introduce el tamaño de la flecha hacia arriba (entero positivo): ");
                tamaño = entrada.nextInt();
                if (tamaño > 0) {
                    break; // Sale del bucle si el valor es válido
                } else {
                    System.out.println("El tamaño debe ser un número entero positivo.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Asegúrate de ingresar un número entero.");
                entrada.next(); // Limpia el búfer de entrada
            }
        }

        dibujarFlechaArribaRellena(tamaño);
    }

    public static void dibujarFlechaArribaRellena(int tamaño) {
        int mitad = tamaño / 2;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i < mitad && j >= mitad - i && j <= mitad + i) {
                    System.out.print("*");
                } else if (i >= mitad && j == mitad) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}