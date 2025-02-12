package ejerciciosEnClase;

public class tablaDeMultiplicarParesImpares {

	public static void main(String[] args) {
	
        double sumap = 0, sumai = 0; 
        for (int i = 1; i <= 10; i++){
            int impar = 2 * i - 1;
            sumai += impar; 
            System.out.print(impar+"   ");
            
            int par= 2 * i -2;
            sumap += par;
            System.out.println(par);
        }
        System.out.println();
        System.out.println("La suma de los 10 primeros impares es: " + sumai);
        System.out.println("La suma de los 10 primeros pares es: " + sumap);
   
    }

}