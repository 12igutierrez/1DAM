package ejemplosiniciales;

import java.util.Scanner;

public class LeerEdades2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);

		short ed1 = LeerNumero("Dame primera edad: ");		
		short ed2 = LeerNumero("Dame segunda edad: ");
		short ed3 = LeerNumero("Dame tercera edad: ");
		short ed4 = LeerNumero("Dame cuarta edad: ");		

		//para que salgan decimales hacer cast
		float media = (float) (ed1 + ed2 + ed3 + ed4) / 4;

		System.out.printf("\nLa  edad media es: %,5.2f %n", media);

		
		//return;
	
	
	}

	private static short LeerNumero(String m) {
		System.out.print(m);
		short ed=0;
		try {
			ed = sc.nextShort();
		} catch (java.util.InputMismatchException ex) {
			
			System.out.println("LECTURA ERRONEA");
		}		
		
			
		sc.nextLine(); // ACONSEJABLE

		return ed;
	}//

}



