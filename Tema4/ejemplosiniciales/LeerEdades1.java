package ejemplosiniciales;
import java.util.Scanner;

public class LeerEdades1 {

	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.print("Dame primera edad: ");
		short ed1 = sc.nextShort();

		System.out.print("Dame segunda edad: ");
		short ed2 = sc.nextShort();

		System.out.print("Dame tercera edad: ");
		short ed3 = sc.nextShort();

		System.out.print("Dame cuarta edad: ");
		short ed4 = sc.nextShort();

		//para que salgan decimales hacer cast
		float media = (float) (ed1 + ed2 + ed3 + ed4) / 4;


		System.out.printf("\nLa  edad media es: %,5.2f %n", media);

	}

}
