package ejerciciosEnClase;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MetodosYControlExcepciones {
	static Scanner sc = new Scanner (System.in);
	
	
	public static void main (String[] args) {
		int hola = leerNumero("Introduce un numero: ",1,100);
	}


	public static int leerNumero(String texto, int minimo, int maximo) {
		boolean entradavalida=false;
		int dato=0;
        do{
            try {
                System.out.print(texto);
                dato = sc.nextInt();
                	
                if (dato>=minimo&&dato <= maximo) {
                    entradavalida=true;
                } else {
                    System.out.println("ERROR: Numero no valido.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Numero no valido. Por favor, ingrese un número.");
                sc.nextLine();
            }
        }while (entradavalida!=true);
        
        return dato;
    }

}