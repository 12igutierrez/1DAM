package otros;
import java.util.Scanner;
public class EdadMaximaYMinima {
	
	//Propuesta 3.1. Muestra la edad máxima y la edad mínima de un
	//grupo de alumnos. El usuario introduce las edades y
	//termina escribiendo un -1.


	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		short edad, maximo = -9999, minimo = 9999;
		
		System.out.print("Dame la edad: ");
		edad= sc.nextShort();
		
		while( edad != -1){
			if (edad > maximo) {
				maximo = edad;
			}
		    if (edad < minimo) {
			    minimo = edad;		
		    }

		    System.out.print("Dame la edad: ");
		    edad= sc.nextShort();
		}
		
		System.out.println("Edad maxima: "+maximo);
		System.out.println("Edad minima: "+minimo);
			
	}

}