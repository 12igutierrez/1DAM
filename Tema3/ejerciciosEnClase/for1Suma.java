package ejerciciosEnClase;
import java.util.Scanner;
public class for1Suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Número: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            n = n * -1; // Convertimos el número a positivo si es negativo
        }
        
        if (n == 0) {
            System.out.println("No se realiza la suma.");
        } else {
            int suma = 0;
            StringBuilder resultado = new StringBuilder();
            
            for (int i = 1; i <= n; i++) {
                suma += i;
                resultado.append(i);
                
                if (i < n) {
                    resultado.append(" + ");
                }
            }
            
            resultado.append(" = ").append(suma);
            System.out.println(resultado);
        }		
	}

}