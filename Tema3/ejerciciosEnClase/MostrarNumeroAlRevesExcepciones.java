package ejerciciosEnClase;
import java.util.Scanner;
public class MostrarNumeroAlRevesExcepciones {
	
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		int n = PedirNumero();
		
		Resultado(n);

	}
	private static void Resultado(int n) {
		int cociente;
		int resto;
		if(n > 0) {
			System.out.print("Resultado: ");
			do {
				cociente = n / 10;
				resto = n % 10;
				System.out.print(resto);
				n = cociente;
			}while (cociente != 0);
		}
	}
	private static int PedirNumero() {
		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		return n;
	}

}