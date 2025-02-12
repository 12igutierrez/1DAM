import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroFilas;
        int numeroMontanas;

        do {
            System.out.print("Numero de filas de la montaña: ");
            numeroFilas = scanner.nextInt();

            if (numeroFilas > 0) {
                System.out.print("Numero de montañas: ");
                numeroMontanas = scanner.nextInt();

                if (numeroMontanas > 0) {
                    // Dibujar montañas conectadas
                    for (int fila = 1; fila <= numeroFilas; fila++) {
                        for (int montaña = 1; montaña <= numeroMontanas; montaña++) {
                            // Imprimir espacios iniciales de la fila actual
                            for (int espacio = 1; espacio <= (numeroFilas - fila); espacio++) {
                                System.out.print(" ");
                            }
                            // Imprimir el borde izquierdo de la montaña
                            System.out.print("*");
                            // Espacios internos de la montaña
                            if (fila > 1) {
                                for (int espacioInterno = 1; espacioInterno <= (fila - 1) * 2 - 1; espacioInterno++) {
                                    System.out.print(" ");
                                }
                                // Imprimir el borde derecho de la montaña
                                System.out.print("*");
                            }
                            // Espacios entre montañas (sin separarlas)
                            for (int espacio = 1; espacio <= (numeroFilas - fila); espacio++) {
                                System.out.print(" ");
                            }
                        }
                        System.out.println(); // Nueva línea al terminar una fila
                    }
                }
            }
        } while (numeroFilas > 0);

        System.out.println("Programa terminado.");
        scanner.close();
    }
}