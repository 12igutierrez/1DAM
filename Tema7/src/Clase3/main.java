package Clase3;
import java.util.Scanner;
public class main {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (hh:mm:ss): ");
        String[] tiempo = sc.next().split(":");
        int h = Integer.parseInt(tiempo[0]);
        int m = Integer.parseInt(tiempo[1]);
        int s = Integer.parseInt(tiempo[2]);
        
        System.out.print("Introduce los segundos a incrementar: ");
        int segundos = sc.nextInt();
        
        Hora horaActual = new Hora(h, m, s);
        horaActual.queHoraEs();
        
        horaActual.segundosPasados(segundos);
        horaActual.queHoraEs();
        
        sc.close();
    }

}
