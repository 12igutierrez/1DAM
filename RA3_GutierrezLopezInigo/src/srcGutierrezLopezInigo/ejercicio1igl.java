package srcGutierrezLopezInigo;

public class ejercicio1igl {
	public static void main(String[] args) {
		
		System.out.println("EJERCICIO 1. Inigo Gutierrez Lopez");
		RelojArena(7);
		RelojArena(10);
		RelojArena(5);
		RelojArena(1);
		RelojArena(0);
		RelojArena(3);	
	}
	
	public static void RelojArena(int altura) {
		System.out.println();
		System.out.println("Reloj arena de altura: "+altura);
		
		if (altura <= 0) {
			System.out.println("La altura debe ser un mayor que 0");
			System.out.println();
		return;
		} if (altura % 2 == 0) {
			System.out.println("La altura debe ser impar");
			System.out.println();
		return;
		}
		
		//Parte de arriba
		for (int i = 0; i < altura / 2 + 1; i++) {
			for (int j = 0; j < i; j++){
				System.out.print(" ");
			}
		
		    for (int j = i; j < altura - i; j++) {
			    System.out.print(j - i + 1+" ");
		}
		System.out.println();
		}
		
		//Parte de abajo
		for (int i = altura / 2 - 1; i >= 0; i--){
			for (int j = i; j < i; j++) {
				System.out.print(" ");
			}
			
		    for (int j  = i;j < altura - i; j++) {
			    System.out.print((j - i + 1)+ " ");
		    }
		System.out.println();
		}
	}

}
