package datos;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		 Scanner leer = new Scanner(System.in);
		    
		    System.out.println("Ingrese su nombre: ");
		    String nombre = leer.nextLine();
		    
		    System.out.println("Ingrese su edad: ");
		    int edad = leer.nextInt();
		    leer.nextLine();
		    
		    System.out.println("Ingrese su curso: ");
		    int curso= leer.nextInt();
		    leer.nextLine();
		    
		    System.out.println("Ingrese su media: ");
		    float media = leer.nextFloat();
		    leer.nextLine();
		    
		    System.out.println("Ingrese una asignatura: ");
		    String asig = leer.nextLine();
		    
		    System.out.println("Nombre: "+ nombre);
		    System.out.println("Edad: "+ edad);
		    System.out.println("Curso: "+ curso);
		    System.out.println("Media: "+ media);
		    System.out.println("Asignatura: "+ asig);

	}

}
