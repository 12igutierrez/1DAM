import java.util.Arrays;

public class pruebaEj1 {

    public static void main(String[] args) {
    	
        int[] tabla = new int[4];
        
        tabla[0] = 1;
        tabla[1] = 2;
        tabla[2] = 3;
        System.out.println(Arrays.toString(tabla));
        int length = tabla.length;
        
        Arrays.toString(tabla);
        String cad = String.valueOf(tabla);
        cad = cad.toUpperCase();
        
        cad = String.valueOf(false);
        System.out.println(cad);
        
        String cad2 = "Hola";
        String cad3 = "HolA";
        
        boolean boolignora = true;
		boolean respuesta = cad.regionMatches (boolignora ,0,cad3,0,5);
		System.out.println(respuesta);
		
		String nombre = "Miguel";
		String apellidos = "de Cervantes";
		String nombreCompleto = nombre + " "+ apellidos;
		nombre.length( ); // 6
		apellidos.length( ); // 12
		nombreCompleto.length( ); // 19
		System.out.println(nombreCompleto.length());
		
		
		
		
		
    }
}