package ejerciciosEnClase;
import java.util.Scanner;
public class EjercicioVariosMetodosIniciales {
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int p= funcion1(5,8);
		System.out.println("El producto de la funcion 1 es:"+p);
		
		funcion2(9,8);
		
		short s=7;
		System.out.println("El resultado es: "+funcion3(s));
		
		short d=4;
		System.out.println("El dia de la semana es: "+funcion4(d));
	}

	
	
	
	static int funcion1(int a, int b) {
		return a%b;
	}
	
	static void funcion2(int a, int b) {
		System.out.println("El producto de "+a+" por "+b+" = "+(a*b));
	}
	
	static boolean funcion3 (short a) {
		return (a>=1 && a<=12) ? true: false;
	}
	
	static String funcion4 (short a) {
		return (a==1) ? "Lunes":
			   (a==2) ? "Martes":
			   (a==3) ? "Miercoles":
			   (a==4) ? "Jueves":
			   (a==5) ? "Viernes":
			   (a==6) ? "Sabado":
			   (a==7) ? "Domingo":"Incorrecto";		   
	}
	
	
	
	
}
