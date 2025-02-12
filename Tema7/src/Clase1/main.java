package Clase1;
import java.util.Scanner;
public class main {

static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Alumno [] alumnos = new Alumno[10];
		
		for (int i = 0; i <= alumnos.length; i++) {
			alumnos [i] = new Alumno();
			
			System.out.print("Identificador: ");
			alumnos[i].id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nombre: ");
			alumnos[i].nombre = sc.nextLine();
			
			System.out.print("Apellidos: ");
			alumnos[i].apellidos = sc.nextLine();
			if (alumnos[i].apellidos.contains(" ")) {
				alumnos[i].apellidos = alumnos[i].apellidos.replace(" ","_");
			}
			
			System.out.print("Nota media: ");
			alumnos[i].nota_media = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Año de matriculación: ");
			alumnos[i].anio_matriculacion = sc.nextInt();
			
			System.out.println("\nID: "+alumnos[i].id+"\nNombre: "+alumnos[i].nombre+"\nApellidos: "+alumnos[i].apellidos
					           +"\nNota media: "+alumnos[i].nota_media+"\nAño de matriculacion: "+alumnos[i].anio_matriculacion);
			System.out.println();
			
		}
		
		
	}

}