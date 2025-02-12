package Clase4;

import java.util.Arrays;
public class inserccionOrdenada {

	public static void main(String[] args) {
		
		int tabla[] = {3,5,11,24,45,83};
		int tablaDestino[] = new int[(tabla.length+1)];
		int valor = 12;
		int posicion = Arrays.binarySearch(tabla,valor);
		int indice = -posicion - 1;
		
		for(int i = 0; i < tabla.length; i++) {
			if(i < indice) { //Si estamos en una posicion anterior a la que debemos colocar el numero
				tablaDestino[i] = tabla[i]; //movemos igualando
			} else if (i == indice) { //Si es la posicion en la que debe estar el numero nuevo
				tablaDestino[i] = valor; //Coloco el numero
			} else if (i > indice) { //Todas las posiciones posteriores
				tablaDestino[i] = tabla[i-1]; //Se adelantan un indice 2->3, 3->4 ...
			}
		}

	}

}
