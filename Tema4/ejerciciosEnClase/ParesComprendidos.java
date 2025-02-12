package ejerciciosEnClase;
import java.util.Scanner;
public class ParesComprendidos {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        paresEntre(-5,20);
		paresEntre(20,1);
		paresEntre(1,30);
	}
    private static void paresEntre(int desde,int hasta) {
    	if (desde <0 )
    		desde = -desde;
    	
    	if (hasta < 0)
    		hasta = -hasta;
    	
    	if (desde > hasta) {
    		int aux = desde;
    		desde = hasta;
    		hasta = aux;
    	}
    	
    	System.out.println("Numeros pares desde: "+desde+" hasta "+hasta);
    	
    	for(int i=desde;i<=hasta;i+=2) {
    		if(i%2==0)
    			System.out.println();
    	}
    }
}
