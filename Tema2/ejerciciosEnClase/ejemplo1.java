package ejerciciosEnClase;
import java.util.Scanner;
public class ejemplo1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n;
	//EJEMPLO DEL DIAGRAMA DE FLUJO DE ESTE EJERCICIO ESTÁ EN EL ARCHIVADOR
	//Lee un numero entero y si es > 0 muestra en pantalla un mensaje 
	//indicando que el numero leido de teclado es mayor que 0
	
	System.out.println("Introduce un numero: ");
	n = sc.nextInt();
	
	if(n>0)
		System.out.println("El numero leido es mayor que 0");
	
	//Variante: si es mayor que 0 pintar un mensaje y pedir un segundo numero
	//y mostrar la suma de los dos
	
	if(n>0) {
		System.out.println("(Opcion true)");
		int n2;
		System.out.println("Introduce un segundo numero: ");
		n2 = sc.nextInt();
		sc.nextLine();

		System.out.println("La suma es: "+(n+n2));
	}
	
	System.out.println("FIN DE PROGRAMA");
	}

}
