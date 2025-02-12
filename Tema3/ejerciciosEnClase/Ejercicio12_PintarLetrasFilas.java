package ejerciciosEnClase;
import java.util.Scanner;
public class Ejercicio12_PintarLetrasFilas {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int con=0; con <= num; con++);
		    num+=num+1;
		    System.out.print(num);
	}

}
