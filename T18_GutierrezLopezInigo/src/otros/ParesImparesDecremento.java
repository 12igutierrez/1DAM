package otros;

public class ParesImparesDecremento {

	public static void main(String[] args) {
		
		//Pintar secuencia descendente del numero
		int LIMITE=100;
		for (int i = LIMITE; i >= 1; i--) {
			System.out.print( i +(i == 1 ? "" : ", "));
		}
		
		System.out.println();System.out.println();
		
		
		//Pintar numeros pares de 1 a 100
		for (int i = 2; i <= LIMITE; i += 2) {
			System.out.print( i +(i == LIMITE ? "" : ", "));
		}
		
		System.out.println();System.out.println();
		
		
		//Pintar numeros impares de 1 a 100
		for (int i = 1; i <= LIMITE; i += 2) {
			System.out.print( i +(i == LIMITE - 1 ? "" : ", "));
		}
		System.out.println();System.out.println();
		
		/*En un bucle calcular pares e impares usando una cadena
		para añadir numeros pares y otra cadena para añadir impares.
		Esas cadenas se muestran al salir del bucle*/
		
		String pares="",impares="";
		for (int p = 2, imp = 1; p <= LIMITE; p += 2, imp += 2) {
			pares = pares +( p +(p == LIMITE ? "":", "));
			impares = impares +(imp +(imp == LIMITE - 1 ?"":", "));
		}
		System.out.println("Pares: "+pares);
		System.out.println("Impares: "+impares);		
	}

}