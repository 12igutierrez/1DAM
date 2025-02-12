package ejerciciosEnClase;

public class TablaProducto1 {
	public static void main (String [] args) {
		
	//Ejercicio de ejemplo con la sentencia continue
	//Lo que hace continue es saltar esa instruccion y continua con el bucle
		
		int valor=8;
		System.out.println("Tabla de multiplicar del numero " + valor);
    
		for (int i = 1; i <= 10; i++) { 
			if (i == 5) continue;
		    System.out.println(valor + " * " + i + " = " + valor * i);
        }
    
    }
	
}