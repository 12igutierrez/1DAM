package Clase4;

import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio7 {
	static Scanner sc = new Scanner (System.in);
	
    public static void main(String[] args) {
        /* Define dos funciones que reciban la lista de numeros premiados y el numero de un boleto.
         * En ambos casos devuelve un boolean: true si esta premiado y false si no.
         * - Una funcion copia la tabla para no modificarla, la ordena y despues busca si el numero ha sido premiado
         * - La otra funcion busca sin ordenar
         */
        int n_premiados[] = {3, 45, 73, 256, 23};
        
        System.out.print("Introduce tu numero de boleto: ");
        int num_boleto = sc.nextInt();
        sc.nextLine();

        boolean estaPremiadoOrdenado = buscarConOrden(n_premiados, num_boleto);
        boolean estaPremiadoSinOrdenar = buscarSinOrdenar(n_premiados, num_boleto);
        
        System.out.println("============================================================");
        System.out.println("¿El boleto " + num_boleto + " está premiado? (Ordenado): " + estaPremiadoOrdenado);
        System.out.println("¿El boleto " + num_boleto + " está premiado? (Sin ordenar): " + estaPremiadoSinOrdenar);
    }

    public static boolean buscarConOrden(int[] numeros, int boleto) {
        int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copiaNumeros);
        return Arrays.binarySearch(copiaNumeros, boleto) >= 0;
    }

    public static boolean buscarSinOrdenar(int[] numeros, int boleto) {
        for (int numero : numeros) {
            if (numero == boleto) {
                return true;
            }
        }
        return false;
    }
}