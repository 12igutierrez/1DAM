package ejerciciosEnClase;

public class ejemploSwitchSinBreak {
	
	public static void main(String[] args) {
		
	//Es el ejercicio de la pagina 59 del libro
		
		int a= 10;
		switch (a-2) {
		case 1:
			System.out.print("Hola ");
		case 5:
			System.out.print("me ");
		case 8:
			System.out.print("alegro ");
		case 9:
			System.out.print("de ");
		case 11:
			System.out.print("conocerte. ");
		default:
			System.out.print("Sin coincidencia");
		}
		

	}

}
