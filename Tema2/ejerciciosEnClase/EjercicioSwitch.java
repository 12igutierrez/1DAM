package ejerciciosEnClase;
import java.util.Scanner;
public class EjercicioSwitch {

	public static void main(String[] args) {		
/*EJERCICIO: Leer un nombre de mes de
teclado y Mostrar el número de días que tiene. 
Si el mes es Febrero suponer que tiene 28 dias.
31    (m==1||m==3||m==5||m==7||m==8||m==10||m==12
30    (m==4||m==6||m==9||m=11)
*/
		Scanner sc= new Scanner (System.in);
		String mes;
		int dias;
		
		System.out.print("Dame el nombre del mes: ");
		mes = sc.next();
		
		switch(mes) {
		case "Enero","Marzo","Mayo","Julio","Agosto","Octubre","Diciembre":
			dias=31;
		    break;
		case "Abril","Junio","Septiembre","Noviembre":
		    dias=30;
		    break;
		case "Febrero":
			dias=28;
			break;
		default:
			dias=0;
		}
		System.out.println("El numero de dias del mes "+mes+" es "+dias+" dias");
	}

}
