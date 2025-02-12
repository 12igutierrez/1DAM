package datos;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		 Scanner leer = new Scanner(System.in);
		    
		    System.out.println("Ingrese su nombre: ");
		    String nombre = leer.nextLine();
		    
		    System.out.println("Ingrese su Edad: ");
		    int edad = leer.nextInt();
		    
		    System.out.println("Ingrese un caracter: ");
		    char c = leer.next().charAt(0);
		    
		    System.out.println("Ingrese una palabra: ");
		    String palabra = leer.next();
		    
		    System.out.println("Nombre: "+ nombre);
		    System.out.println("Edad: "+ edad);
		    System.out.println("Valor de Char: "+ c);
		    System.out.println("Valor de palabra: "+ palabra);

	}

}
