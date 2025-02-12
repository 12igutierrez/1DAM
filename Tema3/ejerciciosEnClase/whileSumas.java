package ejerciciosEnClase;
import java.util.Scanner;
	public class whileSumas {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	int N, SUMA, CUENTA, CUAD, CUBO;
	SUMA=0; CUENTA=0;
	
	System.out.print("Dame un número: ");
	N=sc.nextInt(); sc.nextLine();
	
	while (N !=0) {
		CUENTA = CUENTA + 1;
		SUMA = SUMA + N;
		CUAD = N * N;
		CUBO= CUAD * N;
		System.out.println("\tCuadrado: " + CUAD+ " Cubo: " + CUBO);
		System.out.print("Dame un número: ");
		N=sc.nextInt(); sc.nextLine();
	}
	System.out.println("SUMA: " + SUMA +", NUMEROS DISTINTOS 0: " + CUENTA);
	
	
    }
}
