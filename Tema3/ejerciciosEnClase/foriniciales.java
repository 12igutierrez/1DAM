package ejerciciosEnClase;
import java.util.Scanner;
public class foriniciales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*		for (int n = 1; n <= 10; n++) {
			//Utilizamos el operador ternario para que después del numero 10
			//no aparezca la ","
			System.out.print(n + (n==10 ?"":", "));
		}
		
		
		System.out.println();System.out.println();
		
		
		
		
		//Visualizar numeros de 1-X:
		int x=25;
		for (int n2= 1; n2<= x; n2++) {
			System.out.print(n2+ (n2== x?"":", "));
		}
		
		
		System.out.println();System.out.println();
		
		
		
		
		//Calcular y mostrar la suma de 1 a X, X se lee por teclado.
		
		System.out.println("Introduce un numero: ");
		int x=sc.nextInt();
		int suma=0;
		
		for (int n= 1; n<=x; suma+=n , n++) {
			System.out.print(n + (n==x ? "": " + "));
		}
		System.out.print(" = "+suma);
*/		
		
		
		
		
		//Proceso repetitivo donde se lee un numero, el proceso finaliza
		//si es 0
		//calcular y mostrar la suma de 1 a ESE NUMERO LEIDO POR TECLADO
		
		System.out.print("Dame un numero: ");
		int X= sc.nextInt();
		sc.nextLine();
		
		while(X !=0) {
			if (X < 0)
				X = -X;
			int suma =0;
			for(int i=1;i<=X;i++) {
				System.out.print(i+(i==X ? "":" +"));
				suma +=i;
			}
			System.out.print(" = "+suma);
			System.out.print("\n\nDame un numero (0 para terminar): ");
			X= sc.nextInt();
			sc.nextLine();
			}
		System.out.println("FIN DE PROGRAMA");
		}

}
