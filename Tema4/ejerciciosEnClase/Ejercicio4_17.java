package ejerciciosEnClase;

public class Ejercicio4_17 {
    public static void main(String[] args) {
        int a = 220, b = 284;
        System.out.println("¿Son amigos " + a + " y " + b + "? " + SonAmigos(a, b));

        a = 11;
        b = 11;
        System.out.println("¿Son amigos " + a + " y " + b + "? " + SonAmigos(a, b));

        a = 93;
        b = 5;
        System.out.println("¿Son amigos " + a + " y " + b + "? " + SonAmigos(a, b));
    }

    private static boolean SonAmigos(int a, int b) {
        int sumaa = SumaDivisores(a);
        int sumab = SumaDivisores(b);

        return (sumaa == b && sumab == a);
    }

    private static int SumaDivisores(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
