package otros;
import java.util.Scanner;

public class EjercicioHoyRaro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeros = ""; // Cadena que acumula los números ingresados
        int contador = 0; // Contador manual para rastrear cuántos números se han ingresado
        boolean continuar = true; // Control para finalizar el ingreso

        // Entrada de datos
        while (continuar) {
            System.out.print("Dame numero (de 0 a 9, 0 para terminar): ");
            String entrada = scanner.next(); // Leer entrada como texto

            // Validar entrada
            if (esUnicoCaracter(entrada)) { // Validar que la entrada sea de un solo carácter
                char caracter = entrada.charAt(0); // Extraer el primer carácter

                if (caracter >= '0' && caracter <= '9') { // Verificar que sea un dígito
                    if (caracter == '0') {
                        continuar = false; // Terminar si el número es 0
                    } else {
                        numeros += caracter; // Concatenar el número a la cadena
                        contador++; // Incrementar manualmente el contador
                    }
                } else {
                    System.out.println("Valor incorrecto, introduce valor entre 0 y 9.");
                }
            } else {
                System.out.println("Dato incorrecto tienes que dar un valor entre 0 y 9.");
            }
        }

        // SALIDA 1
        System.out.println("\nSALIDA 1:");
        for (int i = 0; i < contador; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(numeros.charAt(j)); // Imprimir acumulación de números
            }
            System.out.println(); // Salto de línea
        }

        // SALIDA 2
        System.out.println("\nSALIDA 2:");
        for (int i = 0; i < contador; i++) {
            // Agregar espacios para desplazar el número en forma diagonal
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(numeros.charAt(i)); // Imprimir número en su posición diagonal
        }

        scanner.close();
    }

    // Método para validar si la entrada es de un único carácter sin usar .length()
    public static boolean esUnicoCaracter(String entrada) {
        int largo = 0; // Contador manual para la longitud
        for (int i = 0; hayCaracterEnPosicion(entrada, i); i++) {
            largo++; // Incrementar la longitud manualmente
        }
        return largo == 1; // La entrada es válida si tiene exactamente un carácter
    }

    // Método para verificar si hay un carácter en una posición específica
    public static boolean hayCaracterEnPosicion(String cadena, int posicion) {
        try {
            char c = cadena.charAt(posicion); // Intentar acceder al carácter
            return true; // Si no lanza excepción, hay un carácter
        } catch (IndexOutOfBoundsException e) {
            return false; // Si lanza excepción, no hay carácter en esa posición
        }
    }
}