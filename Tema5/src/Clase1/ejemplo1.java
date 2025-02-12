package Clase1;

public class ejemplo1 {

	public static void main(String[] args) {
		
		int num_longitud = 8;
		int edades[];
		edades = new int [num_longitud];
		
		edades[0] = 1;
		edades[1] = 2;
		edades[2] = 3;
		edades[3] = 4;
		edades[4] = 5;
		edades[5] = 6;
		edades[6] = 7;
		edades[7] = 8;
		
		
		//Numeros del 0-n
		for(int i = 0; i < num_longitud; i++) {
			System.out.print(edades[i]+" ");
		}
		
		System.out.println();
		
		//Numeros de n-0
		for(int i = num_longitud-1; i >= 0; i--) {
			System.out.print(edades[i]+" ");
		}
		
        System.out.println();
		
        //Numeros impares 
		for(int i = 0; i < num_longitud; i+=2) {
			System.out.print(edades[i]+" ");
		}
		
		System.out.println();
		
	}

}