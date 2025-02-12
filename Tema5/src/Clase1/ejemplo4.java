package Clase1;

import java.util.Scanner;
public class ejemplo4 {

	public static void main(String[] args) {
		/*Leer la longitud de una tabla por teclado y definirla con ese nuevo valor
		Despues rellenar la tabla con valores tambien leidos por teclado*/
		
		int edades[];
		int longitud = 0;
		Scanner scan = new Scanner (System.in);
		
		while(longitud <= 0) {
			System.out.print("Introduce la longitud de la tabla: ");
			longitud = scan.nextInt();
			scan.nextLine();
		}
		
		edades = new int[longitud];
		System.out.println("Longitud elegida: "+longitud);
	}

}
