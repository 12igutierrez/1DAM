package gutierrezLopez_Inigo_texto;
import java.util.Scanner;
public class numerosAl99 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		/*Escribe una función numeroATexto a la que le pasamos un entero y nos devuelve una cadena con 
		 *ese número puesto como texto (p.ej.: 76 = “setenta y seis”).
		 *El número deberá estar comprendido entre 0 y 99. En caso contrario, devuelve una cadena vacía.
		 *Se recomienda escribir la función NumeroTexto9 que hace lo mismo, pero sólo con números del 0 al 9.
		 *Escribir un switch de 100 elementos NO es la solución.
		 */
        System.out.println(numeroATexto(0));
        System.out.println(numeroATexto(15));
        System.out.println(numeroATexto(99));
        System.out.println(numeroATexto(100));
	}
	
	
	
	private static String numeroTexto9(int numero) {
	    switch (numero) {
	        case 0: return "cero";
	        case 1: return "uno";
	        case 2: return "dos";
	        case 3: return "tres";
	        case 4: return "cuatro";
	        case 5: return "cinco";
	        case 6: return "seis";
	        case 7: return "siete";
	        case 8: return "ocho";
	        case 9: return "nueve";
	        default: return "";
	    }
	}

	// Convierte un número entre 0 y 99 a texto
	public static String numeroATexto(int numero) {
	    if (numero < 0 || numero > 99) {
	        return "";
	    }

	    if (numero < 10) {
	        return numeroTexto9(numero);
	    }

	    if (numero < 20) {
	       switch (numero) {
	            case 10: return "diez";
	            case 11: return "once";
	            case 12: return "doce";
	            case 13: return "trece";
	            case 14: return "catorce";
	            case 15: return "quince";
	            case 16: return "dieciséis";
	            case 17: return "diecisiete";
	            case 18: return "dieciocho";
	            case 19: return "diecinueve";
	            default: return "";
	       }
	    }

	    // Decenas (20, 30, ..., 90)
	    String[ ] decenas = {"", "","veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};

	    int unidad = numero % 10;
	    int decena = numero / 10;

	    if (unidad == 0) {
	        return decenas[decena];
	    }
	    if (decena == 2) {
	        return "veinti" + numeroTexto9(unidad);
	    }
	    return decenas[decena] + " y " + numeroTexto9(unidad);
	    }
}