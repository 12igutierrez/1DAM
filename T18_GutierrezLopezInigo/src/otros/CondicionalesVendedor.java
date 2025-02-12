package otros;
import java.util.Scanner;
public class CondicionalesVendedor {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada de datos
	        System.out.print("Código del vendedor: ");
	        int codigo = scanner.nextInt();
	        scanner.nextLine(); // Consumir la línea pendiente
	        System.out.print("Nombre del vendedor: ");
	        String nombre = scanner.nextLine();
	        System.out.print("Zona de venta (1 a 4): ");
	        int zona = scanner.nextInt();
	        System.out.print("Categoría del vendedor (P, S, T): ");
	        char categoria = scanner.next().charAt(0);
	        System.out.print("Importe de la venta: ");
	        double importeVenta = scanner.nextDouble();

	        // Determinación de la zona
	        String nombreZona;
	        switch (zona) {
	            case 1 -> nombreZona = "CENTRO";
	            case 2 -> nombreZona = "SUR";
	            case 3 -> nombreZona = "ESTE-OESTE";
	            case 4 -> nombreZona = "NORTE";
	            default -> nombreZona = "No definida";
	        }

	        // Determinación de la categoría
	        String nombreCategoria;
	        switch (categoria) {
	            case 'P' -> nombreCategoria = "Primera";
	            case 'S' -> nombreCategoria = "Segunda";
	            case 'T' -> nombreCategoria = "Tercera";
	            default -> nombreCategoria = "No definida";
	        }

	        // Salida del apartado A
	        System.out.println("\nA)=====================================");
	        System.out.println("Vendedor: " + codigo + ", " + nombre);
	        System.out.println("Zona: " + zona + " => " + nombreZona);
	        System.out.println("Categoría: " + categoria + " => " + nombreCategoria);

	        // Determinación de importes para el apartado B
	        double importeZona;
	        double importeCategoria;

	        switch (zona) {
	            case 1 -> importeZona = 2000;
	            case 2 -> importeZona = 3400;
	            case 3 -> importeZona = 2350;
	            case 4 -> importeZona = 2500;
	            default -> importeZona = 0;
	        }

	        switch (categoria) {
	            case 'P' -> importeCategoria = 200;
	            case 'S' -> importeCategoria = 150;
	            case 'T' -> importeCategoria = 100;
	            default -> importeCategoria = 0;
	        }

	        double importeTotal = importeVenta + (0.1 * importeVenta) + importeZona + importeCategoria;

	        // Salida del apartado B
	        System.out.println("\nB)=====================================");
	        System.out.println("Importe        : " + importeVenta);
	        System.out.println("Importe total  : " + importeTotal);
	    }
	}
