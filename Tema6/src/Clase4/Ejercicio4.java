package Clase4;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio4 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		/*
		 * Ejercicio 4:
		 * Crea una funcion que reciba una secuencia de numeros y letras en las que los numeros corresponden
		 * a los espacios entre las palabras. El metodo devolverá la suma de los caracteres correspondientes a digitos
		 * decimales e imprimira por pantalla la frase sin los numeros y en minusculas menos el primer caracter.
		 */
		System.out.print("Introduce una cadena (los espacios son números): ");
		String cad = sc.nextLine();
		String aux = "";
		int resultado = 0;
    	for (int i = 0; i < cad.length();i++) {	
			if (Character.isDigit(cad.charAt(i))) {
				aux += " ";
				String num = String.valueOf(cad.charAt(i));
				resultado += Integer.parseInt(num);	
				
			}else { //si es letra
				aux += cad.charAt(i);
			}
		}
    	System.out.println(resultado);
    	System.out.println(aux);
	}
   
}