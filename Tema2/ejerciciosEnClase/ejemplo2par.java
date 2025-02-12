package ejerciciosEnClase;
import java.util.Scanner;
public class ejemplo2par {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n;
	
	
	//Ejemplo con 2 if
	System.out.println("Dame un numero entero: ");
	n = sc.nextInt();
	
	if(n%2==0)
		System.out.println("(Ejemplo 1) El numero es par");
	if(n%2!=0)
		System.out.println("(Ejemplo 1) El numero es impar");
	
	System.out.println("---------------------------------------------");
	
	//Ejemplo con 1 if
	String resultado="(Ejemplo 2) El numero es impar";
	if(n%2==0)
		resultado = "(Ejemplo 2) El numero es par";
	System.out.println(resultado);
	}

}
