package otros;

import java.util.Scanner;

public class PintarTrianguloEncimaDeTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de filas
        System.out.print("Introduce el número de filas del triángulo: ");
        int filas = scanner.nextInt();

        // Solicitar el carácter para pintar
        System.out.print("Introduce el carácter con el que pintar: ");
        char caracter = scanner.next().charAt(0);

        // Generar el triángulo repetido
        for (int rep = 1; rep <= filas; rep++) {
            for (int i = 1; i <= filas; i++) {
                // Dibujar las filas con espacios al principio
                for (int espacio = 1; espacio <= filas - i; espacio++) {
                    System.out.print(" ");
                }
                // Dibujar los caracteres
                for (int j = 1; j <= i; j++) {
                    System.out.print(caracter + " ");
                }
                System.out.println(); // Nueva línea
            }
        }

        scanner.close();
    }
}