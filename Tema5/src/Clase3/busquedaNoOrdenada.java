package Clase3;

public class busquedaNoOrdenada {

	public static void main(String[] args) {
		
		int tabla[] = {11,5,24,3,83,45};
		
		int indice1 = buscaTablaNoOrdenada(tabla,83);
		int indice2 = buscaTablaNoOrdenada(tabla,93);
		System.out.println("La 1º busqueda da: "+indice1+" y la 2º busqueda da: "+indice2);
		
	}
	
	public static int buscaTablaNoOrdenada(int tabla[], int a_buscar) {
		int indice_enc = -1;
		int contador = 0;
		for (int num : tabla) {
			if (num == a_buscar) {
				indice_enc =  contador;
				break;
			}
			contador++;
		}
		return indice_enc;
	}

}
