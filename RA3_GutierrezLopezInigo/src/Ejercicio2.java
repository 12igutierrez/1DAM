import java.util.Scanner;
public class Ejercicio2 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		int n1 = 0; 
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		
		int ns1 = 9;
		int ns2 = 8;
		int ns3 = 7;
		int ns4 = 6;
		int intento = 1;
		int coincidencias = 0;
		int aciertos = 0;
		
		
		for (intento = 1; intento  < 10; intento++) {
			System.out.println("Intento: "+intento);
				System.out.print("    Introduce un numero (0 y 9): ");
				n1 = sc.nextInt();
				sc.nextLine();
				System.out.print("    Introduce un numero (0 y 9): ");
				n2 = sc.nextInt();
				sc.nextLine();
				System.out.print("    Introduce un numero (0 y 9): ");
				n3 = sc.nextInt();
				sc.nextLine();
				System.out.print("    Introduce un numero (0 y 9): ");
				n4 = sc.nextInt();
				sc.nextLine();
				
				// Aciertos
				if (n1 == ns1) {
					aciertos++;
				} if (n2 == ns2) {
					aciertos++;
				} if (n3 == ns3) {
					aciertos++;
				} if (n4 == ns4) {
					aciertos++;
				}
				
				//Coincidencias
				if ( n1 == ns2 || n1 == ns3 || n1 == ns4) {
					coincidencias++;
				} if ( n2 == ns1 || n2 == ns3 || n2 == ns4) {
					coincidencias++;
				} if ( n3 == ns1 || n3 == ns2 || n3 == ns4) {
					coincidencias++;
				} if ( n4 == ns1 || n4 == ns2 || n4 == ns3) {
					coincidencias++;
				}
				if (n1 != n2 || n1 != n3 || n1 != n4 ||
					n2 != n1 || n2 != n3 || n2 != n4 ||
					n3 != n1 || n3 != n2 || n3 != n4 ||
					n4 != n1 || n4 != n2 || n4 != n3) {
					System.out.println("Numeros introducidos: ["+n1+"; "+n2+", "+n3+", "+n4+"]");	
				} else {
					System.out.println("Hay numeros repetidos: ["+n1+"; "+n2+", "+n3+", "+n4+"]");
				}
				System.out.println("Aciertos: "+aciertos);
				System.out.println("Coincidencias: "+coincidencias);
				System.out.println("");
				if (aciertos == 4) {
					System.out.println("ENHORABUENA, HAS ACERTADO LA COMBINACION EN "+intento+" INTENTOS");
				}
				aciertos = 0;
				coincidencias = 0;
		}
		
	
	}

}
