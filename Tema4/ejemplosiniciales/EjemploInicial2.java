package ejemplosiniciales;
import java.util.Scanner;

public class EjemploInicial2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int dep = LeerEntero("Dame el número de Departamento: ");
		int emp = LeerEntero("Dame el número de Empleado: ");
		System.out.println("Dep: " + dep + ", Empleado: " + emp);

	}//main

	private static int LeerEntero(String string) {
		System.out.print(string);
		int n = sc.nextInt();
		sc.nextLine();
		return n;
	}

}// fin
