package Clase4;
import java.util.Scanner;
import Clase4.QueDiaEs.DiaSemana;
import Clase4.QueDiaEs.Meses;

public class main {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		QueDiaEs hoy = new QueDiaEs();
		System.out.println(hoy.queDiaEs());
		
		QueDiaEs ayer = new QueDiaEs("MARTES",4,"FEBRERO");
		System.out.println(ayer.queDiaEs());
		
	}
	
	/*public static String[] transformarTipoenumATipoString (Meses[] leer) {
		String[] cadenas = new String[leer.length];
		for (int i = 0; i < leer.length; i++) {
			cadenas[i] = leer[i].name();
		}
	return cadenas;
	}*/

}
