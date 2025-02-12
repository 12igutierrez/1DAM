package gutierrez_lopez_inigo_EjerciciosNavidades;
import java.util.Scanner;

public class numero_de_la_suerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Elige la cantidad de numeros a incluir: ");
        int cantidad = sc.nextInt();

        double[] numeros = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número favorito " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }
        int s = cantidad;
        while (s > 1) {
            for (int i = 0; i < s - 1; i++) {
                for (int j = 0; j < s - 1 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        double temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
            double num1 = numeros[0];
            double num2 = numeros[1];
            double media = (num1 + num2) / 2;

            for (int i = 2; i < s; i++) {
                numeros[i - 2] = numeros[i];
            }
            numeros[s - 2] = media;
            s--;
            System.out.print("[");
            for (int i = 0; i < s; i++) {
                System.out.print(numeros[i]);
                if (i < s - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
        System.out.println("Tu número de la suerte es: " + numeros[0]);
        sc.close();
    }
}