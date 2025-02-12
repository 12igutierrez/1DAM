package ejerciciosEnClase;

public class ejemploSwitchConBreak {
	
	public static void main(String[] args) {
		
	//Es el ejercicio de la pagina 59 del libro
		
		int a= 10;
		switch (a-2) {
		case 1:
			System.out.print("Hola ");
			break;
		case 5:
			System.out.print("me ");
			break;
		case 8:
			System.out.print("alegro ");
			break;
		case 9:
			System.out.print("de ");
			break;
		case 11:
			System.out.print("conocerte. ");
			break;
		default:
			System.out.print("Sin coincidencia");
		}
		
		System.out.print("\nFIN DEL PROGRAMA");

	}

}
