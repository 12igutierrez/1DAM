package gutierrez_lopez_inigo_EjerciciosNavidades;
import java.util.Random;
import java.util.Scanner;

public class hunde_la_flota {
    public static void main(String[] args) {
        final int tamanio = 7;
        final int n_barcos = 10;
        char[][] jugador = new char[tamanio][tamanio];
        char[][] oponente = new char[tamanio][tamanio];
        char[][] oponenteVisible = new char[tamanio][tamanio];

        inicializarTablero(jugador);
        inicializarTablero(oponente);
        inicializarTablero(oponenteVisible);
        colocarBarcosJugador(jugador, n_barcos);
        colocarBarcosAleatorios(oponente, n_barcos);

        int puntosJugador = 0;
        int puntosOponente = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        while (puntosJugador < n_barcos && puntosOponente < n_barcos) {
            System.out.println("Tus barcos (l en pie, x hundidos):");
            mostrarTablero(jugador);
            System.out.println("Los barcos del oponente (x hundidos, z posiciones vacías):");
            mostrarTablero(oponenteVisible);

            System.out.println("Elija la posición a atacar");
            int fila, columna;
            while (true) {
                System.out.print("Fila (entre 0 y " + (tamanio - 1) + "): ");
                fila = sc.nextInt();
                System.out.print("Columna (entre 0 y " + (tamanio - 1) + "): ");
                columna = sc.nextInt();
                if (fila >= 0 && fila < tamanio && columna >= 0 && columna < tamanio) {
                    if (oponenteVisible[fila][columna] == 'n') {
                        break;
                    } else {
                        System.out.println("Ya has atacado esa posición. Intente de nuevo.");
                    }
                } else {
                    System.out.println("Posición fuera de rango. Intente de nuevo.");
                }
            }

            if (oponente[fila][columna] == 'l') {
                System.out.println("¡ACIERTO!");
                oponente[fila][columna] = 'x';
                oponenteVisible[fila][columna] = 'x';
                puntosJugador++;
            } else {
                System.out.println("¡FALLASTE!");
                oponenteVisible[fila][columna] = 'z';
            }

            System.out.println("Turno del oponente...");
            while (true) {
                fila = random.nextInt(tamanio);
                columna = random.nextInt(tamanio);
                if (jugador[fila][columna] == 'l' || jugador[fila][columna] == 'n') {
                    break;
                }
            }

            if (jugador[fila][columna] == 'l') {
                System.out.println("¡La máquina ha acertado!");
                jugador[fila][columna] = 'x';
                puntosOponente++;
            } else {
                System.out.println("¡La máquina ha fallado!");
            }
        }

        
        if (puntosJugador == n_barcos) {
            System.out.println("¡Enhorabuena, has ganado!");
        } else {
            System.out.println("Lo siento, has perdido. ¡Mejor suerte la próxima vez!");
        }
        sc.close();
    }

    private static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 'n';
            }
        }
    }

    private static void mostrarTablero(char[][] tablero) {
        for (char[] fila : tablero) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    private static void colocarBarcosJugador(char[][] tablero, int numBarcos) {
        Scanner sc = new Scanner(System.in);
        int barcosColocados = 0;
        while (barcosColocados < numBarcos) {
            System.out.print("Fila (entre 0 y " + (tablero.length - 1) + "): ");
            int fila = sc.nextInt();
            System.out.print("Columna (entre 0 y " + (tablero[0].length - 1) + "): ");
            int columna = sc.nextInt();
            if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero[0].length) {
                if (tablero[fila][columna] == 'n') {
                    tablero[fila][columna] = 'l';
                    barcosColocados++;
                } else {
                    System.out.println("Esta posición ya está elegida. Introduce otra distinta.");
                }
            } else {
                System.out.println("Esta posicion no está dentro del rango (0-6). Introduce de nuevo.");
            }
        }
    }

    private static void colocarBarcosAleatorios(char[][] tablero, int numBarcos) {
        Random random = new Random();
        int barcosColocados = 0;
        while (barcosColocados < numBarcos) {
            int fila = random.nextInt(tablero.length);
            int columna = random.nextInt(tablero[0].length);
            if (tablero[fila][columna] == 'n') {
                tablero[fila][columna] = 'l';
                barcosColocados++;
            }
        }
    }
}