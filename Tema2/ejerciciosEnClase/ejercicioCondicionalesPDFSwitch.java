package ejerciciosEnClase;

import java.util.Scanner;

public class ejercicioCondicionalesPDFSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//Este es el ejercicio del PDF Ejercicios_Condicionales
		//ENTRADA DE DATOS POR TECLADO
		System.out.println("Introduce el código del vendedor: ");
		int cod_vendedor = sc.nextInt();
		
		System.out.println("Introduce el nombre del vendedor: ");
		String nomb_vendedor = sc.nextLine();
		
		System.out.println("Introduce la zona de venta (1 a 4): ");
		byte zona_venta = sc.nextByte();
		
		System.out.println("Introduce la categoría del vendedor (P, S o T): ");
		char cat_vendedor = sc.nextLine().charAt(0);
		
		System.out.println("Introduce el importe de la venta: ");
		double importe = sc.nextDouble();

		
		//NOMBRE DE ZONA y CATEGORIA
		String nombre_zona = "", nombre_categoria = "";
		//IMPORTE ZONA Y CATEGORIA
		double importe_zona=0, importe_categoria =0;
		
		switch(zona_venta) {
		case 1:
			System.out.println("Centro");
			break;
		case 2:
			System.out.println("Sur");
			break;
		case 3:
			System.out.println("Este-Oeste");
			break;
		case 4:
			System.out.println("Norte");
			break;
		default:
			System.out.println("No definida");
			break;
		}
		
		switch(cat_vendedor) {
		case 'P':
			System.out.println("Primera");
			break;
		case 'S':
			System.out.println("Segunda");
			break;
		case 'T':
			System.out.println("Tercera");
			break;
		default:
			System.out.println("No definida");
			break;
		}

		System.out.println("====================================");
		System.out.println("Vendedor: "+cat_vendedor+", "+nomb_vendedor);
		System.out.println("Zona: "+zona_venta+"=> "+nombre_zona);
		System.out.println("Categoría: "+cat_vendedor+"=> "+nombre_categoria);
		

	}

}
