package otros;

import java.util.Scanner;

public class PintarX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Dame un numero: ");
            int n = scanner.nextInt();

            // Verifica que el número sea válido
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        // Imprime 1 en las diagonales
                        if (i == j || j == (n - 1 - i)) {
                            System.out.print("1 ");
                        } else {
                            System.out.print("0 ");
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