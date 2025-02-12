package Clase2;
import java.util.Scanner;
public class Ejercicio3 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		/*
		 * Diseña una aplicación que, a una frase introducida por teclado, devuelva la
		 * frase invertida. Si la frase introducida fuera “Hola mundo” el resultado sería “odnum aloH"
		 */
		 System.out.print("Introduce una frase:");
	     String frase = sc.nextLine();
	     
	     String fraseInvertida = "";
	     
	     for (int i = frase.length() - 1; i >= 0; i--) {
	        fraseInvertida += frase.charAt(i);
	     }
	     System.out.print("Frase invertida: " + fraseInvertida);
	sc.close();
	}

}