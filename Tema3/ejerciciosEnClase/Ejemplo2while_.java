package ejerciciosEnClase;
import java.util.Scanner;
public class Ejemplo2while_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero :");
		int num = sc.nextInt();
		
		while (num<1 || num>7) {
			System.out.print("Introduce otro numero :");
			num = sc.nextInt();
		}
		System.out.print("El numero esta entre 1 y 7 : "+num);
	}

}
