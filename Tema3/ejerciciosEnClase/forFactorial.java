package ejerciciosEnClase;
import java.util.Scanner;
public class forFactorial {

	static Scanner sc;
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Dame un numero: ");
		int X= sc.nextInt();
		sc.nextLine();
		
		while (X>0) {
		int suma=1;
		System.out.print(X +"! == ");
		
		for(int i=1; i<=X; i++) {
			System.out.print(i+ (i==X?"":" x "));
			suma *= i;
		}
		System.out.print(" = "+suma);
		
		System.out.print("\n\nDame otro numero (< o = 0 para terminar): ");
		X= sc.nextInt();
		sc.nextLine();
		}
		
		
	}
}

