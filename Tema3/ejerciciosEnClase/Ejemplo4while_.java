package ejerciciosEnClase;
import java.util.Scanner;
public class Ejemplo4while_ {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num, maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
		
		System.out.print("Introduce un numero: ");
		num= sc.nextShort();
		
		while( num > 0){
			if (num > maximo) {
				maximo = num;
			}
		    if (num < minimo) {
			    minimo = num;		
		    }

		    System.out.print("Introduce otro numero: ");
		    num= sc.nextShort();
		}
		System.out.println("-----------------------");
		System.out.println("Valor máximo: "+maximo);
		System.out.println("Valor mínimo: "+minimo);		
	}

}
