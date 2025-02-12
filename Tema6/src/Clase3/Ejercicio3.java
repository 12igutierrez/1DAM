package Clase3;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Diseña una función que, a una frase introducida por teclado, reemplace las letras:
         * l por 1
         * s por 2
         * e por 3
         * o por 0
         * r por 7
         * y devuelva una tabla con la cantidad de letras de cada tipo que ha modificado.
         */
        
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        // Llama a la función para procesar la frase
        String resultado = reemplazarYContar(frase);

        System.out.println("Frase modificada: " + resultado);
    }

    static String reemplazarYContar(String frase) {
        int letraL = 0;
        int letraS = 0;
        int letraE = 0;
        int letraO = 0;
        int letraR = 0;

        StringBuilder nuevaFrase = new StringBuilder(frase);

        // Recorre la frase y realiza el reemplazo contando las modificaciones
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            switch (c) {
                case 'l':
                    letraL++;
                    nuevaFrase.setCharAt(i, '1');
                    break;
                case 's':
                    letraS++;
                    nuevaFrase.setCharAt(i, '2');
                    break;
                case 'e':
                    letraE++;
                    nuevaFrase.setCharAt(i, '3');
                    break;
                case 'o':
                    letraO++;
                    nuevaFrase.setCharAt(i, '0');
                    break;
                case 'r':
                    letraR++;
                    nuevaFrase.setCharAt(i, '7');
                    break;
                default:
                    // No hace nada si el carácter no está en la lista
                    break;
            }
        }

        // Imprime el conteo de cada letra modificada
        System.out.println("Cantidad de letras modificadas: ");
        System.out.println("l: " + letraL + ", s: " + letraS + ", e: " + letraE + ", o: " + letraO + ", r: " + letraR);

        return nuevaFrase.toString();
    }
}
