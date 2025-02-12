package ejerciciosEnClase;

import java.util.Scanner;

public class ejemplo4 {
	
	//El programa compara dos numeros e indica si el numero 1
	//es mayor, menor o igual al numero 2

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		
		System.out.println("Introduce un numero: ");
		int num2 = sc.nextInt();
		
		
		if(num>num2) {
			System.out.println("El numero "+num+" es mayor que "+num2);
		} else {
			if(num<num2) {
			System.out.println("El numero:"+num +" es menor que "+num2);
			}
			else {
			System.out.println("Los numeros son iguales");
			}
		}
		System.out.println("FIN DEL PROGRAMA");

	}

}
