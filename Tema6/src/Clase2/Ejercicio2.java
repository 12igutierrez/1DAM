package Clase2;
import java.util.Scanner;
public class Ejercicio2 {
	
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		/*
		 * Diseña una aplicación que, a una frase
		 * introducida por teclado, muestre por pantalla la misma frase sin espacios
		 * y una palabra por línea. “En un lugar de la mancha” --> Enunlugardelamancha
		 * En
		 * un
		 * lugar
		 * ...
		 */
		
		
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                System.out.print(c);
            }
        }
        System.out.println();
        
        
        //Esto lo he tenido que mirar con ChatGPT. No se me ocurría como solucionarlo
        int inicioPalabra = 0;
        for (int i = 0; i <= frase.length(); i++) {
            if (i == frase.length() || frase.charAt(i) == ' ') {
                if (i > inicioPalabra) {
                    for (int j = inicioPalabra; j < i; j++) {
                        System.out.print(frase.charAt(j));
                    }
                    System.out.println();
                }
                inicioPalabra = i + 1;
            }
        }
		
	}

}