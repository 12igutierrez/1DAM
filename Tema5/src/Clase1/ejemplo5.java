package Clase1;

import java.util.Scanner;
public class ejemplo5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Introduce un número:");
	        int numero = scanner.nextInt();
	        
	        String numeroStr = Integer.toString(numero);
	        
	        // Crear un array para almacenar los dígitos
	        int[] digitos = new int[numeroStr.length()];
	        
	        // Rellenar el array con los dígitos del número
	        for (int i = 0; i < numeroStr.length(); i++) {
	            digitos[i] = Character.getNumericValue(numeroStr.charAt(i));
	        }
	        
	        // Mostrar el número introducido y el contenido del array
	        System.out.println("Número introducido: " + numero);
	        System.out.print("Dígitos: ");
	        for (int digito : digitos) {
	            System.out.print(digito + " ");
	    }
    }
}
	
