package ejerciciosEnClase;
import java.util.Scanner;
public class Propuesta3_1yActividadResuelta3_2 {
	
	//Propuesta 3.1. Muestra la edad máxima y la edad mínima de un
	//grupo de alumnos. El usuario introduce las edades y
	//termina escribiendo un -1.
	
	//MOSTRAR LA SUMA DE LAS EDADES
	//MOSTRAR LA MEDIA
	//MOSTRAR NUMERO DE ALUMNOS
	//CUANTOS SON MAYORES DE EDAD
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		short edad, maximo = -9999, minimo = 9999;
		short sumaedad=0,cuentaalumnos=0,mayoredad=0;
		double edadmedia=0;
		
		System.out.print("Dame la edad: ");
		edad= sc.nextShort();
		
		while( edad > 0){
			if (edad > maximo) {
				maximo = edad;
			}
		    if (edad < minimo) {
			    minimo = edad;		
		    }
		    sumaedad += edad;
			cuentaalumnos++;
			
			if(edad >= 18)
				mayoredad++;
			
		    System.out.print("Dame la edad: ");
		    edad = sc.nextShort(); 
		}
		//EDAD MAXIMA
		System.out.println("Edad maxima: "+maximo);
		//EDAD MINIMA
		System.out.println("Edad minima: "+minimo);
		//SUMA DE EDADES
		System.out.println("Suma de edades: "+sumaedad);
		//MEDIA DE EDADES
		edadmedia = (double) sumaedad / cuentaalumnos;
		System.out.println("Edas media: "+edadmedia);
		//NUMERO DE ALUMNOS
		System.out.println("Numero de alumnos: "+cuentaalumnos);
		//MAYORES DE EDAD
		System.out.println("Alumnos mayores de edad: "+mayoredad);
	}

}
