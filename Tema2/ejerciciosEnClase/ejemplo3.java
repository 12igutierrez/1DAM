package ejerciciosEnClase;
import java.util.Scanner;
public class ejemplo3 {

	public static void main(String[] args) {

	//El programa indica si el numero que introduces es
	//mayor, menor o igual a 0
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce un numero: ");
	int num = sc.nextInt();
	
	if(num>0) {
		System.out.println("El numero es mayor a 0");
	} else {
		if(num<0) {
		System.out.println("El numero es menor a 0");
		}
		else {
		System.out.println("El numero es igual a 0");
		}
	}
	System.out.println("FIN DEL PROGRAMA");
	}
}
