package Clase1;
import java.util.Scanner;
public class Ejercicio2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        char[] digitos = new char[15];
	        char[] letrasMinusculas = new char[15];
	        char[] letrasMayusculas = new char[15];
	        char[] otrosCaracteres = new char[15];

	        int countDigitos = 0, countMinusculas = 0, countMayusculas = 0, countOtros = 0;

	        System.out.println("Introduce caracteres uno por uno (ingresa '*' para terminar):");

	        while (true) {
	            String entrada = sc.nextLine();

	            // Verificar si el usuario ingresó el carácter '*'
	            if (entrada.length() == 1 && entrada.charAt(0) == '*') {
	                break;
	            }
	            if (entrada.length() != 1) {
	                System.out.println("Por favor, introduce solo un carácter.");
	                continue;
	            }
	            char caracter = entrada.charAt(0);

	            // Clasificar el carácter en los grupos
	            if (Character.isDigit(caracter) && countDigitos < 15) {
	                digitos[countDigitos] = caracter;
	                countDigitos++;
	            } else if (Character.isLowerCase(caracter) && countMinusculas < 15) {
	                letrasMinusculas[countMinusculas] = caracter;
	                countMinusculas++;
	            } else if (Character.isUpperCase(caracter) && countMayusculas < 15) {
	                letrasMayusculas[countMayusculas] = caracter;
	                countMayusculas++;
	            } else if (countOtros < 15) {
	                otrosCaracteres[countOtros] = caracter;
	                countOtros++;
	            }
	        }

	        // Imprimir los resultados
	        System.out.println("\nClasificación de caracteres:");
	        System.out.print("Dígitos: ");
	        imprimirArray(digitos, countDigitos);

	        System.out.print("Letras minúsculas: ");
	        imprimirArray(letrasMinusculas, countMinusculas);

	        System.out.print("Letras mayúsculas: ");
	        imprimirArray(letrasMayusculas, countMayusculas);

	        System.out.print("Otros caracteres: ");
	        imprimirArray(otrosCaracteres, countOtros);
	        
	        sc.close();
	    }

	    // Método auxiliar para imprimir los caracteres almacenados en un arreglo
	    private static void imprimirArray(char[] array, int count) {
	        for (int i = 0; i < count; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}