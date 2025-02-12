package Clase3;

import java.util.Arrays;
public class foreach_2 {

	public static void main(String[] args) {
		/*Ejercicio 4: Crea una funcion a la que se le pase una tabla por parametro y devuelva el valor
		 * maximo. Utiliza for each para recorrer la tabla. En main, imprime toda la tabla seguida de 
		 * su maximo con el formato: [11, 5, 24, 3, 83, 45] --MAX : 83
		 */
		int tabla1[] = {11,5,24,3,83,45};
		int tabla2[] = {-11,-5,-24,-3,-83,-45};
		int tabla3[] = {11,-5,24,3,-83,45};
		
		int max1 = devolverMaximo(tabla1);
		int max2 = devolverMaximo(tabla2);
		int max3 = devolverMaximo(tabla3);
		
		System.out.println(Arrays.toString(tabla1)+"----- MAX: "+max1);
		System.out.println(Arrays.toString(tabla2)+"----- MAX: "+max2);
		System.out.println(Arrays.toString(tabla3)+"----- MAX: "+max3);
	}
	public static int devolverMaximo(int numeros[]) {
		int maximo = Integer.MIN_VALUE;
		for (int num : numeros) {
			if(num > maximo) {
				maximo = num;
			}
		}
		return maximo;
	}
}
