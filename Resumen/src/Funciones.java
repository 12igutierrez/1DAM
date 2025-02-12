import java.util.Scanner;

public class Funciones {
	// TODO Auto-generated method stub
	// las funciones nos permiten reducir las lineas de codigo
	// 1º si quiero hacer una cosa varias veces en vez de escribirlo muchas veces,
	// hago una funcion y cada vez que
	// quiera usar esa funcion la llamo, asi solo lo escribo una vez pero me evito
	// varias lineas

	static void metodo() {
		// metodo-->debe estar asociado a objeto,creamos el objeto sc
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	}

	// funcion--> no necesita estar asociado a un objeto, no hemos creado nigun
	// objeto
	static void funcion() {
		System.out.print(Math.random() * 100 + 1);
	}

	// disponibilidad de la funcion
	// si no pones public o private, la funcion se puede usar en el mismo paquete,
	// pero no en otros paquetes
	// public te deja usarla en cualquier clase de cualquier paquete, y private solo
	// en la clase donde se crea
	static void numero() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Soy una clase que vas a poder usar en el mismo paquete donde he sido creada pero fuera de el paquete no");
		}
		// podemos decirle a funcion que almacene un valor o no
		// Si no queremos que devuelva nada. Utilizamos el void.
		// Si quiero que devuelva un número. Puedo usar el int para numeros y para
		// cadenas de texto string y los demas valores igual(double,bolean,char etc...)
		// ejemplo
	

	static int numeros() {// queremos que devuelva un int
		int a = 0;// asignamos un valor a la variable a
		return a;// la funcion devuelve el valor de a que es 0, de tal forma que luego en main o
		// en otra clase podemos guardar el valor que devuelve esta funcion en otra
		// variable o imprimir por pantalla como hago en main
	}

	// podemos pasarle parametros,
	// ejemplo-->mirar funcion suma y como trbajamos con ella en el main
	static void suma(String text, int a, int b) {// cuando llameos a la funcion en main u otra funcion deberemos
		// introducir dos numeros entre los parentesis, y un texto. debe
		// introducirse en el mismo orden que aparece en los parentesis
		System.out.print(text);// imprime el texto que le pasemos por los parametros
		System.out.print(a + b);// imprimirá la suma de estos parametros, podemos ver en main lo que hacemos con
		// la funcion suma

	}
	//sobrecarga de funciones
	//podemos tener dos funciones con mismo nombre
	//para diferenciarlas java usa los parametros de dichas funciones para diferenciar
	//veamos un ejemplo
	//las dos siguientes funcione se llaman igua, pero se diferencian por los parametros
	static double numaleatorio(int n,int d) {
		return Math.random()*n+d;//generará numeros aleatorio entre n y d y lo returnará a la funcion,
		//en el main vemos como le doy los numeros como parametros
	}
	static double numaleatorio(int n) {
		return Math.random()*n;//generará numeros aleatorio entre n y 0 y lo returnará a la funcion,
		//en el main vemos como le doy el numero a la funcion
	}

	public static void main(String[] args) {
		System.out.print(numeros());// llamada a la funcion numeros,//imprime el valor que devuelve la funcion
		// numeros
		suma("hacer suma de a y b", 5, 4);// en este caso imprime el texto y suma los numeros, pero no devuelve valor
		// por usar void, ya que el print lo hace la funcion suma
		System.out.print(numaleatorio(12,1));//eclipse sabe a cual ir por los argumentos introducidos, va a ir a la primera
		System.out.print(numaleatorio(12));//como solo paso un parametro sabe que funcion ir, en este caso a la segunfa
	}

}
