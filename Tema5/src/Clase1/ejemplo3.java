package Clase1;
import java.util.Scanner;
public class ejemplo3 {

	public static void main(String[] args) {
		
		
		//ARRAY INTRODUCIENDO UN NUMERO Y UTILIZANDO SCANNER
		
		int longitud = 3;
		int num = 0;
		int edades[] = new int[longitud];
		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < longitud; i++) {
		    System.out.print("Introduce un numero: ");
		    edades[i] = sc.nextInt();
		    sc.nextLine();

		}
		for(int i = 0; i < longitud; i++){
				System.out.print("Valor: "+edades[i]+" ");
		}

	}

}
