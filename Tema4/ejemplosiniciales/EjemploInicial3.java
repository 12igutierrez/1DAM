package ejemplosiniciales;

public class EjemploInicial3 {

	public static void main(String[] args) {
		int a = 2, b = 9, c = 4;
		SumaNumeros(100, 200); //llamada a la función, se ejecuta código de la función
		SumaNumeros(a * b, b * c); 

		int sum = SumaDosNumeros(20, 30);
		System.out.println("La suma es: " + sum);

		System.out.println("La suma es: " + SumaDosNumeros(20 * a, 30 * b));		

	}//main

	// Función sin parámetros, visualiza 2 saludos en pantalla
	// No recibe ni devuelve ningún valor
	private static void Saludar() {
		System.out.println("Buenos días");
		System.out.println("Saludos desde Guadalajara");
	}

	// Función que recibe 2 parámetros enteros y muestra la suma en pantalla
	private static void SumaNumeros(int a, int b) {
		int suma = a + b;
		System.out.println("La suma es: " + suma);
	}

	// Función que recibe 2 parámetros enteros y devuelve la suma
	private static int SumaDosNumeros(int a, int b) {
		int suma = a + b;
		return suma;
	}

}
