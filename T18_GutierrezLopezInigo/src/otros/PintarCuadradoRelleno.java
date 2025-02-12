package otros;

import java.util.Scanner;

public class PintarCuadradoRelleno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del cuadrado: ");
        int tamaño = scanner.nextInt();

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}