package Resumen_T5;
import java.util.Arrays;
public class Resumen_T5 {

	public static void main(String[] args) {
		/*
		 *  Componentes de una tabla:
		 *  - Longitud
		 *  - Tipo
		 *  
		 *  Índices: 0-n
		 *  Si el índice está fuera de rango nos dará el error
		 *  "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:"
		 *  
		 *  Declarar y definir la tabla en la misma línea:
		 *  tipo nombreVariable [] = new tipo [longitud];
		 *  
		 *  El operador new calcula el espacio fisico que ocupara la tabla con la siguiente formula:
		 *  tamaño en memoria X nº elementos en tabla
		 *  Ejemplo: Tabla de 7 int - 7*4 bytes = 28 bytes.
		 *  Int ocupa 4 bytes, long 8 bytes y char 2 bytes.
		 *  
		 *  
		 *  REFERENCIAS:
		 *  Las variables no almacenan numeros o caracteres, sino la referencia.
		 *
		    int a [] = new int [10];
		    System.out.println(a);
		/*  [I@372f7a8d
		 * I --> Tipo de dato (int)
		 * 372f7a8d --> Posicion en la memoria en hexadecimal
		 */ 
		    
		    
		//CLASE ARRAY  
		    
		int variable [] = new int [3];
		int variable2 [] = new int [10];
		
		//.length --> Obtener la longitud
		System.out.println(variable.length);
		
		//Arrays.toString() --> Ver la tabla
		System.out.println(Arrays.toString(variable));
		
		
		//Inicializar la tabla con el mismo valor
		for (int i = 0; i < variable.length; i++) {
			variable[i] = 1;
		}
		
		//Arrays.fill --> También inicializa la tabla al mismo valor
		Arrays.fill(variable2, 2);
		
		//(variable,desde,hasta,valor)
		Arrays.fill(variable2,1,9,9);
		System.out.println(Arrays.toString(variable2));
		
		
		//for each --> recorrer la tabla sin necesidad de un índice.
		int variable3 [] = new int [2];
		Arrays.fill(variable3, 8);
		
		for (int valor : variable3) {
			System.out.println(valor);
		}

		//Arrays.sort --> Ordenación de valores
		int tabla [] = {12,45,23,1,54,21,39,9};
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		
		//Arrays.binarySearch --> Busqueda en una tabla ordenada
		int posicion [] = {12,23,4,5,6,43,2,76,97,34,54}; //Creamos la tabla desordenada
		Arrays.sort(posicion); //Ordenamos la tabla
		System.out.println(Arrays.toString(posicion)); //Observamos la tabla y vemos que está en el indice 5
		System.out.println(Arrays.binarySearch(posicion,23)); //Devuelve el valor 5
		
		//Arrays.copyOf --> copia de una tabla
		int tabla2 [] = {12,3,4,5,8};
		int[] copiaArray = Arrays.copyOf(tabla2,3);
		System.out.println(Arrays.toString(copiaArray));
		
		//Arrays.copyOfRange --> copia de una tabla indicando el rango
		int[] copiaArray2 = Arrays.copyOfRange(tabla2, 1, 4);
		System.out.println(Arrays.toString(copiaArray2));
		
		//Arrays.equals --> Comparacion de tablas
		System.out.println(Arrays.equals(tabla, tabla2)); //devuelve boolean
		
	
		
		
		//CONVERTIR NUMEROS Y CADENAS
		
		//entero a cadena
		int a=12345;
		String ca = String.valueOf(a);
		System.out.printf("Entero: %d en Cadena: %s %n", a, ca);

		//float a cadena
		float d=12345.65f;
		String cd = String.valueOf(d);
		System.out.printf("Decimal: %f en Cadena: %s %n", d, cd);

		String formato = String.format("%,9.2f", d);
		System.out.println("Dando Formato con String.format(): "+ formato);

		//VICEVERSA
		//Pasar cadena a entero, el entero debe ser un numero valido
		String cad1 ="12345";
		int x = Integer.parseInt(cad1);
		System.out.printf("Cadena: %s en Entero: %d %n", cad1, x);

		//Pasar cadena a float, el float debe ser un numero valido
		String cad2 ="123.45"; //usamos el punto para el decimal
		float y = Float.parseFloat(cad2);
		System.out.printf("Cadena: %s en Float: %f %n", cad2, y);
		
	}
	
	
}
