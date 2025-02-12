package ejerciciosEnClase;
import java.util.Scanner;
public class datosAlumnos {

	public static void main(String[] args) {
		String nombre;
		int curso;
		char sexo,opcion;
		Scanner sc = new Scanner(System.in);

		do {
			//leer nombre
			System.out.println("Introduce el nombre: ");
			nombre = sc.nextLine();
			
			//leer sexo
			do {
				System.out.println("Introduce el sexo: (H,h,M,m) ");
				sexo= sc.nextLine().charAt(0);
			}while (sexo!='m' && sexo!= 'M' && sexo!= 'h' && sexo!='H');
			
			//leer curso
			do {
				System.out.println("Introduce el curso: (1,2,3) ");
				curso= sc.nextInt();
				sc.nextLine();
			}while (curso<1 || curso>3);
			
			//leer opcion de introducir mas datos: n/N para seguir
			System.out.println("¿Desea introducir mas datos?");
			opcion= sc.nextLine().charAt(0);
		}while (opcion !='N' && opcion!='n');
		
		System.out.println("=================================");
		System.out.println("FALTA MOSTRAR EL NUMERO DE DATOS");
	sc.close();
	}

}
