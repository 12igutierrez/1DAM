package gutierrezLopez_Inigo_telefono;

import java.util.Scanner;

public class agendaDeTelefonos {
	static Scanner sc = new Scanner(System.in);
	static String[] contactos = new String[100]; // Array para almacenar contactos
	static int contador = 0; // Contador de contactos

	public static void main(String[] args) {
		/* Diseña un programa que se comporte como una pequeña agenda. Mediante un menú el usuario podrá elegir entre:
		 * Añadir un nuevo contacto (nombre y teléfono)
		 * Buscar un teléfono de un contacto por el nombre
		 * Mostrar la información de todos los contactos ordenados alfabéticamente por el nombre.
		 * Pista: El nombre y el teléfono se guardarán como una única cadena nombre:telefono
		 */
		while (true) {
			System.out.println("===================== MENÚ ====================");
			System.out.print("1. Añadir un nuevo contacto (nombre + telefono)\n"
					+ "2. Buscar un telefono de un contacto por el nombre\n"
					+ "3. Mostrar informacion de los contactos\n"
					+ "0. FIN\n");
			System.out.println("===============================================");
			System.out.print("ELIGE TU OPCIÓN: ");
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
				Caso3();
				break;
			case 0:
				System.out.println("Fin del programa.");
				return;
			default:
				System.out.println("Error: Introduce un número válido.");
			}
		}
	}

	public static void Caso1() {
		System.out.print("\n¿Cuántos contactos deseas agregar? ");
		int n_contactos = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n_contactos; i++) {
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Teléfono: ");
			String telefono = sc.nextLine();

			if (contador < contactos.length) {
				contactos[contador] = nombre + ":" + telefono;
				contador++;
				System.out.println("Nuevo contacto añadido: " + nombre + ", " + telefono);
			} else {
				System.out.println("No se pueden agregar más contactos. La agenda está llena.");
			}
		}
	}

	public static void Caso2() {
		System.out.print("\nIntroduce el nombre del contacto a buscar: ");
		String nombre = sc.nextLine();
		boolean encontrado = false;

		for (int i = 0; i < contador; i++) {
			String[] partes = contactos[i].split(":");
			if (partes[0].equalsIgnoreCase(nombre)) {
				encontrado = true;
				System.out.println("Teléfono encontrado: " + partes[1]);
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Contacto no encontrado.");
		}
	}

	public static void Caso3() {
		if (contador == 0) {
			System.out.println("No hay contactos en la agenda.");
			return;
		}

		String[] copia = new String[contador];
		System.arraycopy(contactos, 0, copia, 0, contador);

		// Ordenar alfabéticamente
		for (int i = 0; i < copia.length - 1; i++) {
			for (int j = i + 1; j < copia.length; j++) {
				if (copia[i].compareToIgnoreCase(copia[j]) > 0) {
					String temp = copia[i];
					copia[i] = copia[j];
					copia[j] = temp;
				}
			}
		}

		System.out.println("\nContactos ordenados alfabéticamente:");
		for (String contacto : copia) {
			System.out.println(contacto);
		}
	}
}
