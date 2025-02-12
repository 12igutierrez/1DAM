package ejemplosiniciales;

public class EjemploInicial4 {

	public static void main(String[] args) {
		variosSaludos(2);
		int n = 3;
		variosSaludos(n);
		//
		pintaMensaje("==============================");
		pintaMensaje("La suma de 10 + 20 es: " + suma(10,20));		
		pintaMensaje("==============================");
		
		int a=5, b=8;
		pintaMensaje("La suma de "+a+ " + " + b + " es: " + suma(a,b));		
		pintaMensaje("==============================");
		
		
	}// main

	// Función que recibe el número de veces que se pintará en pantalla un saludo.
	private static void variosSaludos(int veces) {
		for (int i = 0; i < veces; i++) {
			System.out.println("Hola.");
		}
	}//variosSaludos

	static int suma(int x, int y) {
		int resul = x + y;
		return resul;
	}//suma

	static void pintaMensaje(String m) {
		System.out.println(m);
	}//pintaMensaje

}// FIN
