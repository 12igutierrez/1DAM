import java.util.Scanner;
public class EjRepaso2 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		/*
         * Diseña una función que, a una frase introducida por teclado, reemplace las letras:
         * l por 1
         * s por 2
         * e por 3
         * o por 0
         * r por 7
         * y devuelva una tabla con la cantidad de letras de cada tipo que ha modificado.
         */

		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		
		System.out.println(ReemplazarLetras(frase));
	}
	
	public static String ReemplazarLetras(String cad) {
		for (int i = 0; i < cad.length(); i++) {
			
		}
		
	return cad;
	}

}
