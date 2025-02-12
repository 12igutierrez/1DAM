package ejerciciosEnClase;

public class Ejercicio4_18 {

	public static void main(String[] args) {
		int min = 1, max = 100, n = 10;
		generarAleatorios(min, max, n);
		
		generarAleatorios(20, 30, 15);
	}
	
	private static void generarAleatorios(int min, int max, int n) {
		System.out.println("Numeros aleatorios entre: "+min+" y "+max);
		System.out.println();
		for(int i = 1; i <= n; i++) {
			int n1 = (int) (Math.random() * (max - min + 1) + min);
			System.out.print(n1+" ");
		}
		System.out.println();
	}

}
