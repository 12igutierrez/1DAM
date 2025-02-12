package gutierrezLopez_Inigo_cesar;
import java.util.Scanner;
public class cifradoConCesar {

	/*Implemente una función que sirva para cifrar un texto con el conocido método de César.
	 *El criptosistema consiste en el desplazamiento de N caracteres desde la posición del carácter a cifrar.
	 *Si N fuese 3, la A se sustituye por la D, la B por la E, …, la X por la A, la Y por la B y la Z por la C.
	 *Por simplicidad, supondremos que el texto a cifrar solo contiene caracteres alfabéticos. Por tanto el ejercicio
	 *consiste en implementar la función que recibe como parámetro la cadena a cifrar y el desplazamiento N de las letras.
	 *Este devuelve un objeto String con la cadena cifrada mediante el sistema de César.
	 */
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		String cadena = "xyz";
		System.out.println("Mensaje cifrado: "+(sistemaCesar(cadena)));
	}
	
	
	public static String sistemaCesar(String cad) {
		System.out.print("Indica el desplazamiento que quieres: ");
		int desplazamiento = sc.nextInt();
		String resultado = "";
		
		for (int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);

            if (c == ' ') {
                resultado += c;
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + desplazamiento) % 26 + 'a');
                resultado += c;
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + desplazamiento) % 26 + 'A');
                resultado += c;
            } else {
                resultado += c;
            }
		}
		
	return resultado;
	}
	
}
