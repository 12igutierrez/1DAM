package ejerciciosEnClase;

public class ifAnidadoEjemplo {

	public static void main(String[] args) {
		int a=0,b=5,c=93;
		
		if (a>b && b>c) //a b c
			System.out.println("El número mas grande es "+a+" el numero mediano es "+b+" y el numero mas pequeño es "+c);
			else //a c b
		    if (a>b && c>b) 
				System.out.println("El número mas grande es "+a+" el numero mediano es "+c+" y el numero mas pequeño es "+b);
			else //b a c
			if (b>a && a>c)
				System.out.println("El número mas grande es "+b+" el numero mediano es "+a+" y el numero mas pequeño es "+c);
			else //b c a
			if (b>c && c>a)
				System.out.println("El número mas grande es "+b+" el numero mediano es "+c+" y el numero mas pequeño es "+a);
			else //c a b
			if (c>a && a>b)
				System.out.println("El número mas grande es "+c+" el numero mediano es "+a+" y el numero mas pequeño es "+b);
			else //c b a
			if (c>b && b>a)
				System.out.println("El número mas grande es "+c+" el numero mediano es "+b+" y el numero mas pequeño es "+a);
		
		

	}

}
