package ejemplosiniciales;

public class EjemploInicial1 {

	public static void main(String[] args) {
		
		System.out.println ("Llamada1:");
		tresSaludos();
		
		System.out.println ("Llamada2:");
		tresSaludos();
		
		System.out.println ("Llamada3:");
		tresSaludos();

	}//main
	
	static void tresSaludos() {
		System.out.println ("Voy a saludar tres veces:");
		for (int i=0; i<3; i++) {
			System.out.println ("Hola.");	
		}		
	}//

}//fin
