package Clase4;

import java.util.Arrays;

public class Ejercicio2 {
	
	
	public static void main(String[] args) {
        String cadena = "patata camaleon batata";
        int[] resultado = CuentaLetras(cadena);
        System.out.println("Resultado: "+Arrays.toString(resultado));

        System.out.println(cuenta26letras(cadena));
    }
	
	
    public static int[] CuentaLetras(String cadena) {
    	/*
    	 * Escribe la función CuentaLetras a la que le pasas una cadena por parámeto y te devuelve un array de enteros.
		 * El tamaño del array será 5 y el contenido será el número de veces que aparecen las letras "a", "b", "c", "d" y "e",
		 * respectivamente en la cadena que le hemos pasado (independientemente de si son mayusculas o minusculas).
		 * Ej: cadena = "patata camaleon batata", resultado: [8,1,1,0,1]
		*/	 
        cadena = cadena.toLowerCase();
        int[] cuenta = new int[5];
        
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            switch (letra) {
                case 'a', 'á'-> cuenta[0]++;
                case 'b'-> cuenta[1]++;
                case 'c' -> cuenta[2]++;
                case 'd' ->cuenta[3]++;
                case 'e', 'é' -> cuenta[4]++;
            }
        }
        return cuenta;
    }
    
    
    //Parte 2. Todas las letras del abecedario
    public static String cuenta26letras (String s) {
    	int letras26 [] = new int [26];
    	Arrays.fill(letras26, 0);
    	s = s.toLowerCase();
    	
    	for (int i = 0; i < s.length(); i++) {
    		char car = s.charAt(i);
    		if (car >= 'a' && car <= 'z') {
    			letras26 [car-'a']++;
    		}
    	}
    	return Arrays.toString(letras26);
    }
}

