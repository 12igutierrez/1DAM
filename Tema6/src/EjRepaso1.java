import java.util.Scanner;
public class EjRepaso1 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		/*
		 * Crea una funcion que reciba una palabra y nos diga si es un participio.
		 * Los participios terminan en -do en verbos regulares).
		 */
		System.out.print("Introduce una palabra: ");
		String palabra= sc.nextLine();
		
		System.out.println("¿Es participio?: "+Participio(palabra));

	}
	public static boolean Participio(String cad) {
		boolean EsPalabra = false;
		
		if (cad.endsWith("do")) {
			EsPalabra = true;
		}
		
	return EsPalabra;	
	}

}
