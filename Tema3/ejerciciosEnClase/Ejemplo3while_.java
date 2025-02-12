package ejerciciosEnClase;
import java.util.Scanner;
public class Ejemplo3while_ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("                         MENÚ PRINCIPAL");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Introduce el numero correspondiente a la operación :");
		System.out.println("1. Sumar      2. Restar     3. Multiplicar");
		System.out.println("4. Dividir    5. Fin");
		System.out.println("---------------------------------------------------------------------");
		
		short menu = sc.nextShort();
		
		while (menu == 1) {
			System.out.println("OPCION ELEGIDA: Sumar");
			System.out.print("Introduce el primer numero :");
			int n1 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Introduce el segundo numero :");
			int n2 = sc.nextInt();
			sc.nextLine();
			
			int suma = n1+n2;
			System.out.println("La suma de "+n1+" + "+n2 +" es igual a : "+suma);
			System.out.println("-------------------------------------");
			System.out.println("¿Que operacion quieres realizar?");
			menu = sc.nextShort();
		}
		while (menu == 2) {
			System.out.println("OPCION ELEGIDA: Restar");
			System.out.print("Introduce el primer numero :");
			int n1 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Introduce el segundo numero :");
			int n2 = sc.nextInt();
			sc.nextLine();
			
			int resta = n1-n2;
			System.out.println("La resta de "+n1+" - "+n2 +" es igual a : "+resta);
			System.out.println("-------------------------------------");
			System.out.println("¿Que operacion quieres realizar?");
			menu = sc.nextShort();
			
		}
		while (menu == 3) {
			System.out.println("OPCION ELEGIDA: Multiplicar");
			System.out.print("Introduce el primer numero :");
			int n1 = sc.nextInt();
			
			System.out.print("Introduce el segundo numero :");
			int n2 = sc.nextInt();
			
			int mult = n1*n2;
			System.out.println("La multiplicacion de "+n1+" * "+n2 +" es igual a : "+mult);
			System.out.println("-------------------------------------");
			System.out.println("¿Que operacion quieres realizar?");
			menu = sc.nextShort();
			sc.nextLine();
		}
		while (menu == 4) {
			try {
			System.out.println("OPCION ELEGIDA: Dividir");
			System.out.print("Introduce el primer numero :");
			int n1 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Introduce el segundo numero :");
			int n2 = sc.nextInt();
			sc.nextLine();
			
			int div = n1/n2;
			System.out.println("La divison de "+n1+" / "+n2 +" es igual a : "+div);
			}catch(java.lang.ArithmeticException exe) {
				System.out.println("ERROR: NO puedes dividir entre 0");
				int div = 0;
			}
			System.out.println("-------------------------------------");
			System.out.println("¿Que operacion quieres realizar?");
			menu = sc.nextShort();
			sc.nextLine();
		}
		while (menu == 5) {
			System.out.print("FIN DEL PROGRAMA");
			break;
		}
	}

}