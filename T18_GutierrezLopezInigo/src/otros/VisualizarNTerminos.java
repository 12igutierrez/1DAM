package otros;

import java.util.Scanner;
public class VisualizarNTerminos {
    public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	
    // Intentar leer N con manejo de excepciones
    try {
        System.out.print("Ingrese el valor de N: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, ingrese un número mayor a 0.");
        } else {
        	for (int i = 1; i <= N; i++) {
                // Generar el término de la serie manualmente
                String termino = "";

                // Generar las 'A'
                for (int j = 0; j < i; j++) {
                    termino += "A";  // Concatenar 'A' manualmente
                }
                
                termino += i;
                System.out.print(termino);

                // Imprimir una coma y espacio
                if (i < N) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    } catch (Exception e) {
        System.out.println("Error: Por favor, ingrese un número entero.");
    }
}
}