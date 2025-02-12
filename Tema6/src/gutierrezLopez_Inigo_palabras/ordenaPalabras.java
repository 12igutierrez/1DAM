package gutierrezLopez_Inigo_palabras;
import java.util.Arrays;

public class ordenaPalabras {

	/*Escribe la función OrdenaPalabrasComas a la que le pasamos una cadena que contiene varias palabras separadas por 
	 *barras bajas y nos devuelve otra cadena con las mismas palabras separadas por comas, pero ordenadas en orden alfabético.
	 *Ej.: “hola_don_pepito_pasó_usted_ya_por_casa” Devolvería: “casa,don,hola,pasó,pepito,por,usted,ya”
	*/
	public static void main(String[] args) {
	    String cad = "hola_don_pepito_pasó_usted_ya_por_casa";
	    String resul = OrdenaPalabrasComas(cad);
	    System.out.println(OrdenaPalabrasComas(resul));
	}
	
	
	public static String OrdenaPalabrasComas(String cadena) {
	    String [] palabras = cadena.split("_");
	        
	    Arrays.sort(palabras);
	        
	    String resultado = "";
	    for (int i = 0; i < palabras.length; i++) {
	        resultado += palabras[i];
	        if (i < palabras.length - 1) {
	                resultado += ",";
	        }
	    }   
	return resultado;
	}

}