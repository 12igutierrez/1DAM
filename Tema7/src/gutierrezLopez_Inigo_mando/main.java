package gutierrezLopez_Inigo_mando;
import java.util.Scanner;
public class main {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		boolean entradaValida = false;
		MandoADistancia Television = new MandoADistancia();
		
		int respuesta = 0;
		System.out.println("Soy el mando a distancia, ¿qué quieres hacer?");
		
		do {
			try {
				System.out.println();
				System.out.print("1. Encender la television / Apagar la television \n2. Subir volumen \t3. Bajar volumen \n4. Cambiar canal(+) "
						           + "\t5. Cambiar canal(-) \n-1. Salir \nOpcion elegida: ");
				respuesta = sc.nextInt();
				
				switch (respuesta) {	
				case 1:
					if (Television.getEstado() == MandoADistancia.Estado.ENCENDIDO) {
						Television.apagarTelevision();
					} else {
						Television.encenderTelevision();
					}
					break;
				case 2:
					Television.incrementarVolumen();
					break;
				case 3:
					Television.disminuirVolumen();
					break;
				case 4:
					Television.siguienteCanal();
					break;
				case 5:
					Television.anteriorCanal();
					break;
				}
			} catch (java.util.InputMismatchException ex) {
				System.out.println("ERROR. Introduce una opcion correcta.");
				sc.nextLine();
			}
		} while (respuesta != -1 && entradaValida != true);
		if (respuesta == -1) {
			System.out.println("Saliendo");
		}
	}

}
