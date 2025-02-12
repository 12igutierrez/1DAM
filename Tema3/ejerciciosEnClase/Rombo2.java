package ejerciciosEnClase;
import java.util.Scanner;
public class Rombo2 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
			System.out.print("Introduce el numero de filas: ");
			    int f=sc.nextInt();
			System.out.print("Introduce el primer caracter: ");
		        char c1=sc.next().charAt(0);
		    System.out.print("Introduce el segundo caracter: ");
		        char c2=sc.next().charAt(0);
int medio=1;
		
		for(f = 5; f >= 1; f--) {
			for (int c = 1; c <= f; c++) { //c1
				System.out.print(c1);
			}
            for (int c = 1; c <= medio; c++) { //c2
				System.out.print(c2);
			}
            medio+=2;
            for (int c = 1; c <= f; c++) { //c1
        	   System.out.print(c1);
            }
            System.out.println();   
		}
		
		
        for(f = 1; f <= medio; f++) { //FILA SIN CARACTER C1
			System.out.print(c2);
		}
        System.out.println();
        
        medio-=2;
        for(f = 1; f <= 5; f++) {
			for (int c = 1; c <= f; c++) { //c1
				System.out.print(c1);
			}
            for (int c = 1; c <= medio; c++) { //c2
				System.out.print(c2);
			}
            medio-=2;
            for (int c = 1; c <= f; c++) { //c1
        	   System.out.print(c1);
            }
            System.out.println();   
		}
	}

}