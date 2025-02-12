package Clase2;

public class ejercicio3 {

	public static void main(String[] args) {
		/*Crear una tabla de 10 elementos del tipo que prefieras.
		 * Crea 2 variables que referencien a esa tabla y haz que ambas
		 * dejen de referenciar a la misma
		 */
		
		int []tabla = new int [10], a, b;
		
		a = tabla;
		b = tabla;

		a[0] = 99;
		b[0] = 1;
		System.out.println("A-:"+a[0]+"   B-:"+b[0]);
		
		System.out.println("A está en: "+a+" y B está en: "+b);
		
		a = null;
		b = null;
		
		System.out.println("A está en: "+a+" y B está en: "+b);
		
	}

}
