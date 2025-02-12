package ejerciciosEnClase;
import java.util.Scanner;
public class for2Factorial {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            n = n * -1; // Convertimos el número a positivo si es negativo
        }
        
        int factorial = 1;
        String resultado = n + "! = ";
        
        
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                resultado += i;
                
                if (i < n) {
                    resultado += " * ";
                }
            }
        
        resultado += " = " + factorial;
        System.out.println(resultado);
	
	}
}