package Clase2;

public class Ejercicio1 {
	    public static void main(String[] args) {
	        String cadena1 = "Holahola";
	        String cadena2 = "holahola123";

	        int resultado = leerCadenas(cadena1, cadena2);
	        System.out.println("Resultado: " + resultado);
	    }

	    /**
	     * Compara dos cadenas y devuelve:
	     * 0 si son iguales,
	     * 1 si la primera es mayor,
	     * 2 si la segunda es mayor.
	     * Se asegura de que las cadenas contengan solo letras.
	     */
	    static int leerCadenas(String cad1, String cad2) {
	        // Validar que ambas cadenas contengan solo letras
	        if (!cad1.matches("[a-zA-Z]+") || !cad2.matches("[a-zA-Z]+")) {
	            System.out.println("Error: Las cadenas deben contener solo letras.");
	            return -1; // Código de error
	        }

	        // Ignorar mayúsculas y minúsculas en la comparación
	        cad1 = cad1.toLowerCase();
	        cad2 = cad2.toLowerCase();

	        if (cad1.equals(cad2)) {
	            return 0; // Son iguales
	        } else if (cad1.compareTo(cad2) > 0) {
	            return 1; // La primera es mayor
	        } else {
	            return 2; // La segunda es mayor
	        }
	    }
}