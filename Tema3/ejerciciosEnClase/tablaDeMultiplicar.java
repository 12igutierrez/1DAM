package ejerciciosEnClase;
import java.util.Scanner;
public class tablaDeMultiplicar {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		int n;
		System.out.println("Introduce un numero: ");
		n=sc.nextInt();
		
		if (n>0) {
			System.out.println("===========================");
			System.out.println("TABLA DE MULTIPLICAR DE "+n);
			System.out.println("===========================");
			for(int i=1;i <=n; i++) {
				System.out.println(n+" x "+i+" = "+n*i);
			}
		}
		else {
			System.out.println("EL NUMERO ES INCORRECTO");
		}

	}

}
