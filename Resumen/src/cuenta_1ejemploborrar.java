import java.util.Scanner;
public class cuenta_1ejemploborrar {
	static Scanner sc = new Scanner (System.in);
	static int [] [] matriz;
	public static void main(String[] args) {
		System.out.print("Introduce el numero de filas y columnas: ");
		int n = sc.nextInt();
		int[] [] matriz = llenarMatriz(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.printf("%02d ", matriz[i][j]);
			}
			System.out.println();
		}
		

	}

	public static int [] [] llenarMatriz(int n){
		int valor = n * n;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0;j < n; j++) {
				matriz [i][j] = valor--;
			}
		}
	return matriz;
	}

}
