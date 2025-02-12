package ejerciciosEnClase;

public class dowhile20_30 {

	public static void main(String[] args) {
		int c=20, cuadrado, cubo;
		System.out.println("Numero        Cuadrado           Cubo");
		System.out.println("=======================================");
		do {
			cuadrado= c * c;
			cubo= cuadrado * c;
			//HAY QUE CAMBIARLO Y HACERLO CON PRINTF
			System.out.println(c+"               "+cuadrado+"            "+cubo);
			c++;
		}while (c<30);
		
	}

}
