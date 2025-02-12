package Clase4;

import java.util.*;
public class busquedaOrdenada {

	public static void main(String[] args) {
		
		int tabla[] = {3,5,11,24,45,83};
		Arrays.sort(tabla);
		
		System.out.println(busquedaOrdenada(tabla,11));
		System.out.println(Arrays.binarySearch(tabla,10));
	}
	
	public static int busquedaOrdenada(int tabla[], int a_buscar) {
		int posicion = -1;
		
		if (tabla[0] < a_buscar && tabla[tabla.length-1] > a_buscar) {
			comparar(tabla,a_buscar,0,tabla.length-1);
		} else if (tabla[0] == a_buscar) {
			posicion = 0;
		} else if (tabla[tabla.length-1] == a_buscar) {
			posicion = tabla.length-1;
		}
		
		return posicion;
	}
	
	public static int comparar(int tabla[], int a_buscar, int inicio, int ultimo) {
		int posicion = -1;
		int indice = (ultimo-inicio)/2+inicio; //indice intermedio - inicio es 2 -ultimo es 8 -> indice es 4
		if (tabla[indice] == a_buscar) { //si el valor de tabla[indice] es el que busco
			posicion = indice;
		} else if((inicio+2)==ultimo){ //inicio y ultimo son casi consecutivos: inicio es 2 - ultimo es 4
			if(tabla[indice] == a_buscar) { // indice es 3, es el numero que busco?
				posicion = indice;
			}
			
		} else if (tabla[indice] < a_buscar) {
			comparar(tabla,a_buscar,inicio,indice);
		} else if (tabla[indice] > a_buscar) {
			comparar(tabla,a_buscar,inicio,indice);
		}
		return posicion;
	}
}
