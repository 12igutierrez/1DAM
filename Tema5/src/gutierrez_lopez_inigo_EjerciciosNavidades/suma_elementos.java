package gutierrez_lopez_inigo_EjerciciosNavidades;
import java.util.Scanner;

public class suma_elementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los elementos del array (introduce -1 para terminar): ");
        int[] t = new int[100];
        int c = 0;

        while (true) {
            System.out.print("Introduzca un numero: ");
            int num = sc.nextInt();
            if (num == -1) break;
            t[c++] = num;
        }

        int[] tabla = new int[c];
        for (int i = 0; i < c; i++) {
            tabla[i] = t[i];
        }

        System.out.print("Agrupar ");
        int numElementos = sc.nextInt();

        int[] result = suma(tabla, numElementos);

        System.out.println("La suma de " + java.util.Arrays.toString(tabla));
        System.out.println("Agrupando " + numElementos + " elementos");
        System.out.println(java.util.Arrays.toString(result));
        sc.close();
    }

    public static int[] suma(int[] t, int numElementos) {
        if (numElementos > t.length) {
            return new int[0];
        }
        int[] resultado = new int[t.length - numElementos + 1];

        for (int i = 0; i <= t.length - numElementos; i++) {
            int sum = 0;
            for (int j = 0; j < numElementos; j++) {
                sum += t[i + j];
            }
            resultado[i] = sum;
        }
        return resultado;
    }
}