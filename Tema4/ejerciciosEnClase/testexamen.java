package Test;
import java.util.Scanner;
import java.util.InputMismatchException;

public class testexamen {
	static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangulo();
	}
	static void triangulo() {
		String numtext="";
		int c=0;
		do {
		c++;
		int num=lectura("introduce un valor entre 0 y 9",0,9);
		if (num==0)
			break;
		numtext+=num;
		}while(true);
		c-=1;
		int m=0;
		System.out.print("salida1\n===================================");
		for(int l=0;l<c;l++) {
			for(int k=0;k<l;k++,m++) {
				if(m==c)
					break;
			System.out.print(numtext.charAt(m));
			
			}
			System.out.println();
		}
		System.out.print("salida2\n===================================\n");
		for(int i=0;i<c;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" " );
			}
			System.out.println((numtext.charAt(i)));
		}
	}
	static int lectura(String text,int min,int max) {
		int valor=0;
		do {
			valor=0;
		System.out.println(text);
		try {
		valor=0;
		valor=leer.nextInt();
		leer.nextLine();
		if(valor>max||valor<min)System.out.println("El valor introducido está fuera de rango, el rango va de "+min+" a "+max +" incluidos");
		}catch(InputMismatchException ex) {
			System.out.println("el valor introducido no es un numero");
			leer.nextLine();
			valor=max+1;
			
		}
		}while(valor>max||valor<min);
		return valor;
	}
}
