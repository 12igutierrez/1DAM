package otros;
import java.util.Scanner;
public class PintarTrianguloDeNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Ingrese un valor para N (1-9, o 0 para salir): ");
            N = scanner.nextInt();

            if (N > 0 && N < 10) {
            	// Parte superior
                for (int i = 1; i < N; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }

             // Línea de Ns
                for (int i = N; i < N; i++) {
                    System.out.print(N);
                }

                // Parte inferior
                for (int i = N; i >= 1; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
            } else if (N != 0) {
                System.out.println("Introduce un valor entre 1 y 9.");
            }

        } while (N != 0);

    }
}