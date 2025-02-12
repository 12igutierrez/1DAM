package ejerciciosEnClase;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4_16ConExcepciones {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int hola = leerNumero("Introduce un numero: ",1,100);
	}


	public static int leerNumero(String texto, int minimo, int maximo) {
		boolean entradavalida=false;
		int dato=0;
        do{
        	try {
                System.out.print("Introduce un número: ");
                int n = sc.nextInt();
                sc.nextLine();
            		
                DivisoresPrimos(n);
            	}catch (java.util.InputMismatchException ex) {
            		System.out.println("Introduce un numero correcto");
            		sc.nextLine();
            	}
        }while (entradavalida!=true);
        
        return dato;
    }
	
	private static void DivisoresPrimos(int n) {
        System.out.println("Divisores primos de " + n + ":");

        for (int i = 2; i <= n; i++) { 
            if (n % i == 0 && Esprimo(i)) {
                System.out.println(i + " es primo");
            }
        }
    }

    private static boolean Esprimo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
