package ActividadesResueltasTema3;



import java.util.Scanner;

public class Main3_06 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Introduzca un número: ");
      int n = sc.nextInt();

      for (int i = 1; i <= n; i++) { 
         System.out.println(i); //mostramos i
      }
   }
}
