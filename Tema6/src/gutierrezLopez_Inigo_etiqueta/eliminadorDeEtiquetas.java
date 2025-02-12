package gutierrezLopez_Inigo_etiqueta;
import java.util.Scanner;
public class eliminadorDeEtiquetas {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
        String textoConTags = "<p>Esto es texto normal y <b>esto es texto en negrita.</b></p>";
        String textoSinTags = eliminaEtiquetas(textoConTags);
        System.out.println(textoSinTags); // Esto es texto normal y esto es texto en negrita.
    }
	
	public static String eliminaEtiquetas(String cadena) {
	    String resultado = "";
	    boolean dentroEtiqueta = false;

	    for (char c : cadena.toCharArray()) {
	        if (c == '<') {
	            // Entramos en una etiqueta
	            dentroEtiqueta = true;
	        } else if (c == '>') {
	            // Salimos de una etiqueta
	            dentroEtiqueta = false;
	        } else if (!dentroEtiqueta) {
	            // Agregamos solo si no estamos dentro de una etiqueta
	            resultado += c;
	        }
	    }
	    return resultado;
	}
}
