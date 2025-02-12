package otros;

public class PintarTrianguloYCuadrado {

	public static void main(String[] args) {

		int n = 9;
		
		// Imprimir un triángulo ascendente alineado a la derecha
		System.out.println("Triangulo 1");
		for (int i = 0; i < n; i++) {
		    // Imprimir espacios en blanco a la izquierda
		    for (int j = 0; j < n - i; j++) {
		         System.out.print("  ");
		    }
		    // Imprimir asteriscos alineados a la derecha
		    for (int k = 0; k <= i; k++) {
		         System.out.print(i+" ");
		    }
		         System.out.println();
		    }


	    // Imprimir un triángulo isósceles
		System.out.println("Triangulo 2");
		for (int i = 0; i < n; i++) {
	        // Imprimir guión a la izquierda
		    for (int j = 0; j < n - i - 1; j++) {
		         System.out.print("- ");
		    }
		    // Imprimir asteriscos
		    for (int k = 0; k < (2 * i + 1); k++) {
		    System.out.print("* ");
		    }
		    // Imprimir guión a la derecha
		    for (int j = 0; j < n - i - 1; j++) {
		         System.out.print("- ");
		    }
		    System.out.println();
		}
		   

		// Imprimir un cuadrado
	    System.out.println("Cuadrado");
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		    	if (i==j) {
		         System.out.print("0 ");
		    	}else { System.out.print("* ");
		    	}
		    }
		    System.out.println();   
	    }		
	}	
}