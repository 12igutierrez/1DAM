package gutierrez_lopez_inigo_EjerciciosNavidades;
import java.util.Scanner;
public class llegada_a_meta {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos corredores participan?: ");
        int numCorredores = sc.nextInt();
        int[] ranking = new int[numCorredores];
        int rankingT = 0;

        System.out.println("Escriba los dorsales que van llegando a la meta:");
        for (int i = 0; i < numCorredores; i++) {
            System.out.print("Dorsal número: ");
            int dorsal = sc.nextInt();
            ranking[rankingT++] = dorsal;
        }

        System.out.println("Dorsales de los menores de edad (-1 para acabar):");
        while (true) {
            int dorsal = sc.nextInt();
            if (dorsal == -1) break;
            for (int i = 0; i < rankingT; i++) {
                if (ranking[i] == dorsal && i > 0) {
                    int temp = ranking[i];
                    ranking[i] = ranking[i - 1];
                    ranking[i - 1] = temp;
                    break;
                }
            }
        }

        System.out.println("Dorsales positivos en antidoping (-1=fin):");
        while (true) {
            int dorsal = sc.nextInt();
            if (dorsal == -1) break;
            for (int i = 0; i < rankingT; i++) {
                if (ranking[i] == dorsal) {
                    for (int j = i; j < rankingT - 1; j++) {
                        ranking[j] = ranking[j + 1];
                    }
                    rankingT--;
                    break;
                }
            }
        }

        System.out.println("Dorsales que no han pagado (-1=fin):");
        int[] noPagaron = new int[numCorredores];
        int noPagaronSize = 0;
        while (true) {
            int dorsal = sc.nextInt();
            if (dorsal == -1) break;
            for (int i = 0; i < rankingT; i++) {
                if (ranking[i] == dorsal) {
                    noPagaron[noPagaronSize++] = dorsal;
                    for (int j = i; j < rankingT - 1; j++) {
                        ranking[j] = ranking[j + 1];
                    }
                    rankingT--;
                    break;
                }
            }
        }
        for (int i = 0; i < noPagaronSize; i++) {
            ranking[rankingT++] = noPagaron[i];
        }
        System.out.println("--- Medallero ---");
        if (rankingT > 0) System.out.println("Oro: " + ranking[0]);
        if (rankingT > 1) System.out.println("Plata: " + ranking[1]);
        if (rankingT > 2) System.out.println("Bronce: " + ranking[2]);
        sc.close();
    }
}