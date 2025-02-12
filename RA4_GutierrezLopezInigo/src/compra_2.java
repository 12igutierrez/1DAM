import java.util.InputMismatchException;
import java.util.Scanner;
public class compra_2 {
	static Scanner sc = new Scanner (System.in);
	static String[] cesta = new String[100]; 
	static int contador = 0; 
	static int n_productos = 0;
	static boolean entradavalida = false;
	public static void main(String[] args) {
		do {
			try {
				while (true) {
					System.out.println("¿Que quiere hacer?");
					System.out.print("1. Producto a añadir a la lista\n"+"2. Producto ya comprado\n"+"3. Fin\n");
					System.out.print("Introduce opcion: ");
					int opcion = sc.nextInt();
					sc.nextLine();

					switch (opcion) {
					case 1:
						Caso1();
						break;
					case 2:
						Caso2();
						break;
					case 3:
						System.out.println("Fin del programa.");
						return;
					default:
						System.out.println("Error: Introduce un número válido.\n");
					}
				}
			}catch (InputMismatchException ex) {
                System.out.println("ERROR: Numero no valido. Por favor, ingrese un número.\n");
                sc.nextLine();
            }
		}while (entradavalida!=true);
		

	}
	
	public static void Caso1() {
		do {
			try {
				System.out.print("\n¿Cuantos productos deseas añadir a la lista? ");
				n_productos = sc.nextInt();
				sc.nextLine();
			}catch (InputMismatchException ex) {
                System.out.println("ERROR: Numero no valido. Por favor, ingrese un número.");
                sc.nextLine();
            }
		
		
		for (int i = 0; i < n_productos; i++) {
			System.out.print("Nombre del producto: ");
			String nombre = sc.nextLine();
			System.out.print("Cantidad del producto: ");
			String cantidad = sc.nextLine();

			if (contador < cesta.length) {
				cesta[contador] = nombre + ":" + cantidad;
				contador++;
				System.out.println(nombre + " : " + cantidad);
			} else {
				System.out.println("No se pueden agregar más productos. La cesta está llena.");
			}
		}
	}while (entradavalida!=true);
	}
	
	public static void Caso2() {
		if (n_productos == 0) {
			System.out.println("La cesta está vacia.");
		}
		System.out.print("\nIntroduce el nombre del producto: ");
		String nombre = sc.nextLine();
		boolean encontrado = false;

		
		for (int i = 0; i < contador; i++) {
			String[] partes = cesta[i].split(":");
			if (partes[0].equalsIgnoreCase(nombre)) {
				encontrado = true;
				System.out.println("Cantidad a comprar: " + partes[1]);
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Producto no encontrado.\n");
		}
		
	}

}
