package otros;

import java.util.Scanner;

public class PintarXConCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Dame un numero: ");
            int n = scanner.nextInt();

            if (n > 0) {
                // Pedir los caracteres para la cruz y el fondo
                System.out.print("Dame el caracter para la cruz: ");
                char cruz = scanner.next().charAt(0);
                System.out.print("Dame el caracter para el fondo: ");
                char fondo = scanner.next().charAt(0);

                // Dibujar la matriz
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        // Imprime el carácter de la cruz o el del fondo
                        if (i == j || j == (n - 1 - i)) {
                            System.out.print(cruz + " ");
                        } else {
                            System.out.print(fondo + " ");
                        }
                    }
                    System.out.println(); // Salto de línea después de cada fila
                }
            } else {
                System.out.println("Por favor, ingresa un número mayor a 0.");
            }
        }
    }
}