package ejerciciosEnClase;
import java.util.Scanner;
public class Ejemplo1while_ {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Introduce un numero: ");
	int num = sc.nextInt();
	
	while(num <0) {
		System.out.print("Introduce otro numero :");
		num = sc.nextInt();		
	}
	System.out.println("------------------------------");
	System.out.println("El numero es mayor que 0");
	}

}
