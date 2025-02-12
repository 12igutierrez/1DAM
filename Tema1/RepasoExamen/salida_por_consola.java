package RepasoExamen;

public class salida_por_consola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//salida por consola
		//imprimir por pantalla
		String texto="Vamos a aprobar programación";
		int numero1=33;
		float decimal1=2.34f;
		char letra1='a';
		System.out.print("imprimiendo en la misma linea");//Si uso varias veces print, este lo imprimirá en la misma linea
		System.out.println("imprimiendo en distintas lineas");//si uso varias veces println, cada println se hará en una linea distinta
		
		System.out.printf("\t la palabra es :\"%s\",%nel primero numeroes: %d%nDecimal:%,12.2f%nCaracter:%c",texto,numero1,decimal1,letra1);
		// Caracteres de escape en Java
		//  \n--> salto de linea 
		//  \t-->tecla tabulador 
		// %n--> salto de linea en printf 
		//  \" -->introducir comillas
		
		/*
		 * %s: Especificador de formato para una cadena de texto.
			%d: Especificador de formato para un número entero.
			%f: Especificador de formato para un número de punto flotante.-->%,12.2-->la coma indica que muestre punto en los miles, el 12 indica que los espacios que ocupará el numero 
			inlcuido las comas y puntos, si el numero ocupa 9 posiciones y le asigno 12,este dejará huecos a la izquierda para ocupar 12 posiciones, el 2 indica cuantos decimales a mostrar, en este caso 2
			%n: Inserta un salto de línea.
			%%: Imprime un carácter de porcentaje literal.
			%c: Especificador de formato para un carácter.

		 */
	}

}
