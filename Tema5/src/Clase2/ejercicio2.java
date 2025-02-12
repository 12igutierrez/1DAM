package Clase2;

public class ejercicio2 {

	public static void main(String[] args) {
		int [] a = new int [10], b;
		b = a;
		System.out.print("A está en: "+a+" y B está en: "+b);
		a[7]=5;
		b[4]=12;
		for(int i = 0; i < a.length; i++) {
			System.out.println("A-"+i+":"+a[i]+" B-"+i+":"+b[i]);
		}

	}

}
