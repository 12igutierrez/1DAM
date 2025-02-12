package otros;

import java.util.Scanner;

public class PintarEspiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la espiral: ");
        int tamaño = scanner.nextInt();

        int[][] matriz = new int[tamaño][tamaño];
        int valor = 1, filaInicio = 0, filaFin = tamaño - 1, colInicio = 0, colFin = tamaño - 1;

        while (filaInicio <= filaFin && colInicio <= colFin) {
            for (int i = colInicio; i <= colFin; i++) matriz[filaInicio][i] = valor++;
            filaInicio++;
            for (int i = filaInicio; i <= filaFin; i++) matriz[i][colFin] = valor++;
            colFin--;
            for (int i = colFin; i >= colInicio; i--) matriz[filaFin][i] = valor++;
            filaFin--;
            for (int i = filaFin; i >= filaInicio; i--) matriz[i][colInicio] = valor++;
            colInicio++;
        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
