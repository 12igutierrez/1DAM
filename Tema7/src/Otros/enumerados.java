package Otros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class enumerados {
    static Scanner sc = new Scanner(System.in);
    
    // SALIDAS DE LAS LECTURAS
    
    public static void main(String[] args) {
        DiasDeLaSemana dia = leerDiaDeLaSemana();
        System.out.println("El día seleccionado es: " + dia);

        int numero = leerNumero();
        System.out.println("El número introducido es: " + numero);
        
        String dni = leerDNI();
        System.out.println("El número introducido es: " + numero);
    }

    
    
    
    // LEER UN ENUM CON CONTROL DE EXCEPCIONES
    
    enum DiasDeLaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    public static DiasDeLaSemana leerDiaDeLaSemana() {
        DiasDeLaSemana dia = null;
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Introduce un día de la semana (LUNES, MARTES, etc.): ");
                String entrada = sc.nextLine().toUpperCase();

                // Intentamos convertir la entrada al valor del enum
                dia = DiasDeLaSemana.valueOf(entrada);

                // Si la conversión fue exitosa, cambiamos la bandera de validez
                entradaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: Día no válido. Introduce uno de los días válidos.");
            }
        } while (!entradaValida);

    return dia;
    }

    
    
    
    // LEER UN NUMERO CON CONTROL DE EXCEPCIONES
    
    public static int leerNumero() {
        boolean entradavalida = false;
        int dato = 0;
        int min = 1;
        do {
            try {
                System.out.print("Introduce un número: ");
                dato = sc.nextInt();

                if (dato >= min) {
                    entradavalida = true;
                } else {
                    System.out.println("ERROR: Entrada no válida.");
                }
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Introduce un número.");
                sc.nextLine();
            }
        } while (!entradavalida);

    return dato;
    }
    
    
    
    public static String leerDNI() {
        while (true) {
            System.out.print("Introduce un DNI: ");
            String dni = sc.nextLine().trim();
            
            if (dni.length() == 9 && Character.isLetter(dni.charAt(8)) && dni.substring(0, 8).matches("\\d{8}")) {
                return dni;
            } else {
                System.out.println("DNI inválido. Debe tener 8 dígitos seguidos de una letra.");
            }
        }
    }
    
    
    
    enum Meses {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
    enum Abecedario {a, b, c, d, e, f, g, h, i, j, k, l, m, n, ñ, o, p, q, r, s, t, u, v, w, x, y, z}
    enum Estaciones {VERANO, PRIMAVERA, OTOÑO, INVIERNO}
    enum Direccion {NORTE, SUR, ESTE, OESTE}
}


	

