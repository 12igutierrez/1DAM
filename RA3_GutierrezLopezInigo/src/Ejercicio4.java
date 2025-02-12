import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numero; // El número grande (tipo long)
        short digito; // El dígito a buscar (tipo short)

        while (true) {
            System.out.print("Introduzca un número: ");
            try {
                numero = Long.parseLong(scanner.nextLine());
                if (numero == 0) {
                    System.out.println("Programa finalizado.");
                    break; // Finaliza el programa si el número es 0
                }
                if (numero < 0) {
                    System.out.println("El número no puede ser negativo. Inténtelo de nuevo.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrecto. Entrada no válida. Inténtelo de nuevo.");
                continue;
            }

            while (true) {
                System.out.print("Introduzca el dígito a buscar (0 a 9): ");
                try {
                    digito = Short.parseShort(scanner.nextLine());
                    if (digito < 0 || digito > 9) {
                        System.out.println("El dígito debe estar entre 0 y 9. Inténtelo de nuevo.");
                        continue;
                    }
                    break; // Sal del bucle si el dígito es válido
                } catch (NumberFormatException e) {
                    System.out.println("Incorrecto. Entrada no válida. Inténtelo de nuevo.");
                }
            }

            // Buscar las posiciones del dígito en el número
            String numeroStr = Long.toString(numero);
            boolean encontrado = false;
            System.out.println("Posiciones en las que se encuentra el dígito " + digito + 
                               ", en el número " + numero + ":");
            System.out.print("Posiciones: ");
            for (int i = 0; i < numeroStr.length(); i++) {
                if (numeroStr.charAt(i) == Character.forDigit(digito, 10)) {
                    System.out.print((i + 1) + " ");
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.print("NO SE ENCUENTRA EL DIGITO " + digito);
            }
            System.out.println("\n============================================");
        }

        scanner.close();
    }
}