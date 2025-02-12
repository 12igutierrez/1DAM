package RepasoExamen;
import java.util.Locale;
import java.util.Scanner;//importamos la libreria del scanner
//import java.util.* -->importa todas las librerias de java.util
public class Entrada_por_consola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada=new Scanner(System.in);
		
		//ahora vamos a leer algo
		int numeross=entrada.nextInt();//lectura numeros
		System.out.print(numeross);
		
		entrada.nextLine();//despues de ler numeros es recomendable poner nextLine para evitar errores, esta linea solo evita un error que produce Scanner 
		
		char caracter=entrada.nextLine().charAt(1);//lectura de un caracter en la posición 1, la primera posición es la 0
		System.out.println(caracter);
		
		boolean option2=entrada.nextBoolean();//true or false
		System.out.println(option2);
		
		entrada.nextLine();
		
		String name=entrada.nextLine();//lectura de texto, nextline lee todo lo que escribas independientemente de los espacios
		System.out.print(name);
		
		String name2=entrada.next();//lectura de texto, lee hasta el primer espacio
		System.out.println(name2);
		
		float decimal3=entrada.nextFloat();//lectura decimal
		System.out.println(decimal3);
		
		Double decimal4=entrada.nextDouble();//lectura decimal
		System.out.println(decimal4);
		
		
		//este dos lineas de abajo sirven para que al introduce numeros en el scanner se use el punto(.) en vez de la coma(,)
		//necesita ser importado ver linea 3
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		float decimal5=sc.nextFloat();//lectura decimal
		System.out.println(decimal5);
	}

}
