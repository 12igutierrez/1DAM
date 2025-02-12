package gutierrezLopez_Inigo_camel;
public class nomenclaturaCamel {
	
	/*Escribe una función que convierte una frase (que puede estar en combinación de mayúsculas y minúsculas)
	 *en el nombre de una variable que utilice la nomenclatura Camel. Por ejemplo, la frase “Me GUsta dAr pASeOs”,
	 *se convertirá en “meGustaDarPaseos”. Supondremos que cada palabra está separada por 1 único espacio.
     *La frase podrá contener números mezclados con las letras pero nunca como primer caracter, no se pasará como
     *separador(siempre se pasará un espacio como separación entre palabras).
    */

	public static void main(String[] args) {
	    String frase = "Me GUsta dAr 	pASe0s";
	    String frase2 = "  otr0 Ej3mplo de fr4se";
	    System.out.println(fraseCamel(frase));
	    System.out.println(fraseCamel(frase2));
	}

	public static String fraseCamel(String cad) {
	    cad = cad.toLowerCase().trim();
	    String resultado = "";
	    boolean convertirSiguiente = false;

	    for (int i = 0; i < cad.length(); i++) {
	        char c = cad.charAt(i);

	        if (c == ' ' || c == '\t') {
	            convertirSiguiente = true;
	        } else {
	            if (convertirSiguiente) {
	                resultado += Character.toUpperCase(c);
	                convertirSiguiente = false;
	            } else {
	                resultado += c;
	            }
	        }
	    }

	    return resultado;
	}

}
