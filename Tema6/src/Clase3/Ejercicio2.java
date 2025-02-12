package Clase3;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Crea una funcion que reciba una palabra y nos diga si es un participio.
		 * Los participios terminan en -do en verbos regulares).
		 */
	}
	static boolean esParticipio (String verbo) {
		boolean com = false;
		
		if (verbo.length() > 2) {
			com = verbo.endsWith("do");
		}
		
	    return com;
	}
}