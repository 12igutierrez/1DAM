package ejemplosiniciales;

public class PruebaSobrecarga {
	
	public static void main(String[] args) {
		int a = 34;
		int b = 12;
		int c = 56;
		System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		System.out.println("El mayor de a y b es: " + mayor(a, b));
		System.out.println("El mayor de a, b y c es: " + mayor(a, b, c));
	}

	// Definicion de mayor de dos numeros enteros
	public static int mayor(int x, int y) {
		return x > y ? x : y;
	}

	// Definicion de mayor de tres numeros enteros
	public static int mayor(int x, int y, int z) {
		return mayor(mayor(x, y), z);
	}

	// No se permite, da error, ya hay definida una función que recibe dos enteros
	//public static String mayor(int x, int y) {
	//	return null;
	//}

	public static int mayor(String x, int y) {
		return 0;
	}

}//fin
