package Clase4;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1:
		 * Un anagrama es una palabra que resulta del cambio del orden
		 * de los caracteres de otra. Se debe crear un metodo que reciba 
		 * dos palabras y decida si son anagramas una de la otra.
		 * Devolvera un boolean que será true si lo son y false si no.
		 */
		System.out.println(esAnagrama("",""));
	}
	
	static boolean esAnagrama (String palabra1, String palabra2) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce la primera palabra: ");
		palabra1 = sc.nextLine();
		
		System.out.print("Introduce la segunda palabra: ");
		palabra2 = sc.nextLine();
		
		if(palabra1.length() != palabra2.length()) {
			return false;
		}
		char[] arrayPalabra1 = palabra1.toCharArray();
		char[] arrayPalabra2 = palabra2.toCharArray();
		
		Arrays.sort(arrayPalabra1);
		Arrays.sort(arrayPalabra2);
		
		return Arrays.equals(arrayPalabra1, arrayPalabra2);
	}
}
