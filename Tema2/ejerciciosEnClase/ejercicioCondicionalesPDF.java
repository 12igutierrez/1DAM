package ejerciciosEnClase;
import java.util.Scanner;
public class ejercicioCondicionalesPDF {

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

	
	//NOMBRE DE ZONA
	
	String nombre_zona = ""; //No definida
	if (zona_venta == 1)
		nombre_zona = "CENTRO";
	if (zona_venta == 2)
		nombre_zona = "SUR";
	if (zona_venta == 3)
		nombre_zona = "ESTE-OESTE";
	if (zona_venta == 4)
		nombre_zona = "NORTE";
	
	//NOMBRE DE CATEGORIA
	String nombre_categoria = ""; //No definida
	if (cat_vendedor == 'P')
		nombre_categoria = "PRIMERA";
	if (cat_vendedor == 'S')
		nombre_categoria = "SEGUNDA";
	if (cat_vendedor == 'T')
		nombre_categoria = "TERCERA";

	System.out.println("====================================");
	System.out.println("Vendedor: "+cat_vendedor+", "+nomb_vendedor);
	System.out.println("Zona: "+zona_venta+"=> "+nombre_zona);
	System.out.println("Categoría: "+cat_vendedor+"=> "+nombre_categoria);
	
	//CALCULO DEL IMPORTE TOTAL
	
	
	}

}
