package otros;

import java.util.Scanner;

public class PintarFlechaAbajo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño = 0;

        while (true) {
            try {
                System.out.println("Introduce el tamaño de la flecha hacia abajo (entero positivo): ");
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

        dibujarFlechaAbajoVacia(tamaño);
    }

    public static void dibujarFlechaAbajoVacia(int tamaño) {
        int mitad = tamaño / 2;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i >= mitad && (j == i - mitad || j == tamaño - (i - mitad + 1))) {
                    System.out.print("*");
                } else if (i < mitad && j == mitad) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
