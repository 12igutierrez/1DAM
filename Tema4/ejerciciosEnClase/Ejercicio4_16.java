package ejerciciosEnClase;
import java.util.Scanner;

public class Ejercicio4_16 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    	try {
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.nextLine();
    		
        DivisoresPrimos(n);
    	}catch (java.util.InputMismatchException ex) {
    		System.out.println("Introduce un numero correcto");
    		sc.nextLine();
    	}
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