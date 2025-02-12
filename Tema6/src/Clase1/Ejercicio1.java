package Clase1;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Imprime por pantalla todos los caracteres Unicode comprendidos entre
		 * \u0000 y \uffff mostrando el caracter y su codePoint.
		 */
		
		for(int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
			System.out.println(Integer.toHexString(codePoint)+" "+(char)codePoint);		}
	}
	

}
