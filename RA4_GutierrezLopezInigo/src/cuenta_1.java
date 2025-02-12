public class cuenta_1 {
    public static void main(String[] args) {
        llenarMatriz(3);
        llenarMatriz(12); 
    }

    public static void llenarMatriz(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j--) {
                if (j < i) {
                    matriz[i][j] = matriz[i - 1][j] + 1;
                } else {
                    matriz[i][j] = n - j + i;
                }
            }
        }

        System.out.println("CUENTA ATRÁS: " + n + "x" + n);
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j--) {
                System.out.print(matriz[i][j]);
                if (j < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println();
    }
}


    
