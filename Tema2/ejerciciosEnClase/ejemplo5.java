package ejerciciosEnClase;
import java.util.Scanner;
public class ejemplo5 {

	public static void main(String[] args) {
		
	//El programa indica si el numero es capicua o no, para numeros de
	//1, 2, 3 o 4 cifras
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce un numero: ");
    int num = sc.nextInt();
    
    if(num<0 || num>9999) {
    	System.out.println("El numero no está en el rango");
    	System.exit(0);
    }
    int valorInicial =num;
    int r1,r2,r3,c3;
    r1 = num%10;
    num = num/10;
    
    r2 = num%10;
    num = num/10;
    
    r3 = num%10;
    c3 = num/10;
    
    //Para 4 cifras
    if(r1==c3 && r2==r3) {
    	System.out.println("El numero "+valorInicial+", es capicua");
    } 
    //Para 3 cifras
    if ((valorInicial>=100 && valorInicial<=999) && (r1==r3)){
    	System.out.println("El numero "+valorInicial+", no es capicua");
    }
    //Para 2 cifras
    if ((valorInicial >= 10 && valorInicial<=99) && (r1==r2)) {
    	System.out.println("El numero "+valorInicial+", es capicua");
    }
    //Para 1 cifra
    if ((valorInicial<10)) {
        System.out.println("El numero "+valorInicial+", no es capicua");
    }
    
    
    
	}
}

