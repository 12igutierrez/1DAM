package RepasoExamen;

public class Identificadoresprimitivosobjestosclase {//el nombre de la clase debe ser igual al nombre fichero

	public static void main(String[] args) {//aprenderse de memoria
		// TODO Auto-generated method stub
/*Comienzan por una letra, un carácter de subrayado (_) o
un carácter de dólar ($)
– Los siguientes caracteres pueden ser también dígitos
– Se distinguen las mayúsculas de las minúsculas
– Nunca espacios en blanco u otros caracteres como ?
o %
– No hay límite máximo de caracteres
• No pueden emplearse como identificadores por el
programador las palabras reservadas en Java.*/

		
		
		
		//primitivos
		byte numero1=1;//(8 bits/1 byte)
		short numero2=1234;//(16 bits/2 bytes)
		int numero3=999999999;//(32 bits/4 bytes)
		long numero4=999999999;//(64 bits/8 bytes)
		char letra1='w'; //un solo caracter, se debe usar comillas simples
		boolean option1=true;// true or false
		float decimal1=12333.3f;//decimal, necesita una f al final (32 bits/4 bytes)
		double decimal2=12.3; //no necesita una f(64 bits/8 bytes)
		//se pueden asiganar varias variables en una linea
		int numero5=2,numero6=2;
		//en una linea
		int a;int b;//podemos inicializar varias en una linea
		int g,p=3;//otra forma de inicializar
		g=2;p=2;//asignar valor a variables en una linea
		
		
		//variable tipo objeto
				String texto ="esto es una prueba";
				
				
				//constantes-->hacen que las variables o strings no se puedan modificar, una vez el valor es asignado este no se puede modificar
				//para el uso de constantes se añade antes de la palabra reservada la palabra "final"
				final int numero7=2;
				
	}

}
