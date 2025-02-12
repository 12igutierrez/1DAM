package Clase4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Ejercicio3 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		/*
		 * Ejercicio 3:
		 * El programa debe pedir una palabra cuyas letras se desordenarán y se mostrarán por pantalla.
		 * Otra persona deberá introducir palabras hasta dar con la palabra correcta.
		 * 
		 * Ejercicio 3.2: Cuando la segunda persona introduzca una palabra deberá indicarle cuantas letras
		 * son correctas colocando asteriscos en las que no son correctas.
		 */
		System.out.print("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		System.out.println("Palabra desordenada: "+(palabraCorrecta(palabra)));
	}
	public static String palabraCorrecta (String cad) {
	    char[] letras = cad.toCharArray();
	    Random random = new Random();

	    // Mezclar los caracteres
	    for (int i = 0; i < letras.length; i++) {
	        int indiceAleatorio = random.nextInt(letras.length);
	        char temp = letras[i];
	        letras[i] = letras[indiceAleatorio];
	        letras[indiceAleatorio] = temp;
	    }
	    
	    //Pasar el array a String para poder imprimirlo
	    String var ="";
	    for (int i = 0; i < letras.length; i++) {
	    	var += letras[i];	
	    }
	return var;
	
	}
	
	
	
	
	
	
	
}