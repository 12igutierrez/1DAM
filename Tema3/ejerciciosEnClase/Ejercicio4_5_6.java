package ejerciciosEnClase;
import java.util.Scanner;
public class Ejercicio4_5_6 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Dame un numero: ");
		int n = sc.nextInt();
		
		while(n>0) {
			//pintar cuadrado
			for(int f=1; f<=n;f++) {
				for(int c=1; c<=n;c++) {
					if(f==c)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				
			System.out.println();
			}
			
			System.out.print("Dame un numero: ");
			n = sc.nextInt();
			sc.nextLine();
		}

	}

}