public class vocales_3 {

	public static void main(String[] args) {
		  secuenciaDePalabras("hola mundo");
		  secuenciaDePalabras("esto es una prueba");
	}

    public static void secuenciaDePalabras(String frase) {
		  for (int i = 0; i < frase.length(); i++) {
		        Object [] resultado = contarVocales(frase);

		        if (resultado != null) {
		            System.out.println("La letras mas repetida es la " + resultado[0] + "\nSe repite : " + resultado[1]+ " veces en cada palabra");
		            break;
		        } else {
		            System.out.println(", No contiene vocales.");
		        }
		  }
    System.out.println();
    }

    public static Object[] contarVocales(String palabra) {
		  int[] conteoVocales = new int[5];
		  char[] vocales = {'a', 'e', 'i', 'o', 'u'};

		  for (char c : palabra.toLowerCase().toCharArray()) {
		       switch (c) {
		            case 'a': conteoVocales[0]++; break;
		            case 'e': conteoVocales[1]++; break;
		            case 'i': conteoVocales[2]++; break;
		            case 'o': conteoVocales[3]++; break;
		            case 'u': conteoVocales[4]++; break;
		       }
		  }

		  int maxConteo = 0;
		  char vocalMax = '\0';

		  for (int i = 0; i < conteoVocales.length; i++) {
		       if (conteoVocales[i] > maxConteo) {
		            maxConteo = conteoVocales[i];
		            vocalMax = vocales[i];
		       }
		  }

		  if (maxConteo > 0) {
		        return new Object[]{vocalMax, maxConteo};
		  } else {
		        return null;
		  }

	  }

}