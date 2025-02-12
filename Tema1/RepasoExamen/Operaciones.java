package RepasoExamen;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operaciones aritmeticas
		int a=3,b=4,c=8;
		int d;
		d=a+b;//suma
		d=a-b;//resta
		d=a/c;//division
		d=c*b;//multiplicación
		d=c%b;//da el resto de la división de c/b
		d=-c; //le asigna a d el contrario de c
		
		
		//operadores unarios
		a=++b;//primero incrementauno a la variable(b)  y luego asigna
		b=a++;//primero asigna y luego incrementa(a), en este caso el 
		//ejemplo ejercicios clase
		int x = 10; int z = x++%5;
		
		
		//opera y asigna
		a+=b+c;//funcionamiento-->a=a+(b+c), (a) suma a todo lo que está a la derecha no solo a b
		a-=b-c;//funcionamiento-->a=a-(b-c)
		a*=b*c;//funcionamiento-->a=a*(b*c)
		a/=b/c;//funcionamiento-->a=a/(b/c)
		a%=b%c;//funcionamiento-->a=a%(b%c)
		b=2;a=3;
		int t,e=3;
		
		
		//operaciones relaccionales
		boolean comprobar=7==8;//si la condición se cumple se guardará true, si no false, en este caso false ya que 7 no es igual a 8
		comprobar=7!=8;//lo contrario, comprueba si es desigual
		comprobar=7<8;//comprueba si 7 es menorque 8
		comprobar=7>8;//comprueba si 7 es mayor que 8
		comprobar=7<=8;//comprueba si 7 es igual o menor
		comprobar=7>=8;//comprueba si 7 es igual o mayor
		
		
		//operadores logicos
		//&& se tienen que cumplir todas las condiciones para true, si no será false
		comprobar=(5==5 && 6==6);//si 5 es igual a 5 y 6 es igual a 6, entonces true
		// || con que se cumpla una ya es true
		comprobar=(5==5 && 6==6);//si 5 es igual a 5 o 6 es igual a 6, entonces true
		// ! devuelve el contrario
		comprobar=!true;//guardará en comprobar false
		
		
		//operador ternario
		//(operacion a comprobar)? " devuelve esto en caso de true":y esto otro en caso de false";
		String Result=(5==5) ? "si es true, este texto se guardará": "si es false este otro se guardará";
		
		
		//concatenar--> une uno detrás de otro, por ejemplo -->string+int+String
		String nombre="guille";
		String apellido="gonzalez";
		byte edad=19;
		String nombreCompleto = nombre + " " + apellido + " La edad es: " + edad;
		
		//conversion tipos
		//ensanchamiento-->por ejemplo de entero a real
		//estrechamiento-->por ejemplo de real a entero
		//imagen de tabla --> https://1drv.ms/i/s!Ag7EgK10lmS21SzQCvzD6HIaS6X8?e=QP4ejt
		byte num1=3;
		int num2=(int) num1;//convertimos int1(byte) a int
	}

}
