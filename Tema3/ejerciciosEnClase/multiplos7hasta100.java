package ejerciciosEnClase;

public class multiplos7hasta100 {

	public static void main(String[] args) {
		
		int LIMITE=100;
		for (int i = 0; i <= LIMITE; i += 7) {
			System.out.print( i +(i == LIMITE-7 ? "" : ", "));
		}

	}

}
