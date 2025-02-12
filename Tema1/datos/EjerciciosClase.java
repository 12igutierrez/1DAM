package datos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosClase {

	public static void main(String[] args) {
    //System.out.println("Hola Mundo");			

		
/*		int prueba; char c = 'a';
		byte pruebaDos, prueba3 = 10, prueba4;
		double prueba5 = 10.123;
		boolean aprobado = true;
		float decimal = 10.123f;
		String ciudad="Guadalajara";
				
				
		prueba = 2000;
		System.out.println(prueba);
		System.out.println(c);
		System.out.println(prueba3);
*/	

			
//CLASE LUNES 23/09
/*
	    //TABULADOR
	    System.out.println("\tValor de edad: \t+900");

			    
	    //COMILLAS
	    System.out.println("\"Valor de edad: \"+900");
		
	    //EJEMPLO PRINTF
		//printf te permite controlar como se presentan los datos en la salida
		// %s interpreta como cadena
		String nombre = "Íñigo";
		int edad = 20;
		double importe = 1234.56;
		       
		System.out.printf("Nombre del alumno: %s, Edad del alumno: %d %n", nombre, edad);  
	    System.out.printf("Importe: %f %n", importe);
*/		
		
		
//CLASE JUEVES 26/09
		
		//Numeros ordenados y sin ordenar
		
/*	    int cod;
	    double importe;
	    int dep;
	    
	    System.out.println("COD   IMPORTE     DE");
	    System.out.println("---   ---------   --");
	    
	    cod = 1; importe = 1000.87; dep = 20;
	    System.out.printf("%3d   %,9.2f   %2d%n",cod, importe, dep);
	    
	    cod = 123; importe = 3334.67; dep = 19;
	    System.out.printf("%3d   %,9.2f   %2d%n",cod, importe, dep);
	    
	    cod = 3; importe = 1234.56; dep = 11;
	    System.out.printf("%3d   %,9.2f   %2d%n",cod, importe, dep);
	    
	    cod = 100; importe = 8800.66; dep = 12;
	    System.out.printf("%d   %,f   %d%n",cod, importe, dep);
*/	    
	    

//CLASE 03/10
/*		
		//MAYOR O MENOR DE EDAD CON BOOLEAN
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba su edad: ");
		int edad = sc.nextInt(); boolean mayorEdad = edad >= 18;
		System.out.println("Mayor de edad: " + mayorEdad);
*/	    
	
		
/*		//Comprueba si dep tiene un valor entre 1 y 10 (incluidos el 1 y el 10):
			int dep = 11;
			boolean entre1y10 = (dep >= 1) && (dep <= 10);
			System.out.println("Departamento "+ dep+
			", entre 1 y 10?: " + entre1y10);
		//Comprueba si dep tiene un valor que no está entre 1 y 10:
			int dep = 11;
			boolean fuerarango = dep < 1 || dep > 10;
			System.out.println("Departamento "+ dep
			+", fuera del rango [1 a 10]?: " + fuerarango);
*/	    
	    
		
/*		//LEER POR TECLADO UN DIA Y UN MES (OPERADORES LÓGICOS)
	    Scanner sc = new Scanner (System.in);
	    int dia, mes;
	    System.out.println("Introduce un dia: ");
	    dia = sc.nextInt();
	    System.out.println("Introduce un mes: ");
	    mes = sc.nextInt();
	    //COMPROBAR SI EL DIA ESTA ENTRE 1 Y 31
	    boolean ex1 = dia>=1 && dia<=31;
	    
	    //COMPROBAR SI EL MES ESTA ENTRE 1 Y 12
	    boolean ex2 = mes>=1 && mes<=12;
	   
	    //COMPROBAR SI LAS DOS EXPRESIONES SE CUMPLEN
	    boolean valor = ex1 && ex2;
	    
	    //MOSTRAR EL VALOR
	    System.out.println("Resultado: " +valor);
*/	    
	    
		
/*		//Ejercicio 5 PDF: EJERCICIOS_operadores_expresiones
		//COMPRUEBA VALORES CON EL OPERADOR &
	    int valor = 10;
	    boolean ex1 = valor >= 1 && valor <=7;
	    System.out.println("Resultado: "+ex1);
*/	    
		
		
/*	    //Ejercicio 6
	    char car = 'a';
	    boolean ex1 = car >= '0' && car <= '9';
	    System.out.println("Resultado: "+ ex1);
*/
		
		
/*	    //Ejercicio 7 
		//DEVUELVE SI EL CARACTER ESTA DENTRO DE ESE RANGO DE CARACTERES O NO
	    char car = 'x';
	    boolean ex1 = (car == 'ñ') || (car == 'Ñ') || (car >= 'a' && car <= 'z') || (car >= 'A' && car <= 'Z');
	    System.out.println("Resultado: "+ ex1);
*/	    
	    
	    //Ejercicio 8
/*	    int mes = 12;
	    boolean ex1 = (mes>=1 && mes<=12) ? true:false;
	    String ex2 = (mes>=1 && mes<=12) ? "SI":"NO";
	    System.out.println(ex1);
	    System.out.println(ex2);
*/	    
	    
	    //Ejercicio 9
/*	    int dia = 1;
	    String ex = (dia == 1) ? "Es lunes" : 
	                (dia == 2) ? "Es martes" :
	                (dia == 3) ? "Es miercoles" :
	                (dia == 4) ? "Es jueves" :
	                (dia == 5) ? "Es viernes" :
	                (dia == 6) ? "Es sabado" :
	                (dia == 7) ? "Es domingo" : "Incorrecto" ;
	    System.out.println(ex);
*/
/*
	    //Ejercicio 10
	    int categoria = 3;
	    String exp = (categoria == 0) ? "EMPLEADO" :
	    	         (categoria == 1) ? "ENCARGADO" :
	    	         (categoria == 2) ? "DIRECTIVO" :
	    	         (categoria == 3) ? "TECNICO" : "CATEGORIA ERRONEA";
        System.out.println(exp);
*/        
        //Ejercicio 11
        
        
        
        
/*        //Ejercicio 21
        int nota1= 0, nota2= 0, nota3= 0, nota4= 0;
        
     try {   
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Dame la primera nota: ");
        nota1 = sc.nextInt();
        
        System.out.println ("Dame la segunda nota: ");
        nota1 = sc.nextInt();
        
        System.out.println ("Dame la tercera nota: ");
        nota1 = sc.nextInt();
        
        System.out.println ("Dame la cuarta nota: ");
        nota1 = sc.nextInt();
        sc.nextLine();
        
     } catch(InputMismatchException ex) {
    	 System.out.println("Error de proceso");
     }
        boolean nota= (nota1>=1 && nota1<=10) &&  (nota2>=1 && nota1<=10) 
        		&& (nota3>=1 && nota1<=10) && (nota4>=1 && nota1<=10);
        double notaFinal = nota1*0.3 + nota2*0.25 + nota3*0.15 + nota4*0.3;
        
        String media= (notaFinal<5) ?"Suspenso" :
        	          (notaFinal>= 5 && notaFinal<6) ?"Aprobado" :
        	          (notaFinal >= 6 && notaFinal <7) ?"Bien":
        	          (notaFinal >= 7 && notaFinal <9) ? "Notable":
        	          (notaFinal >= 9 && notaFinal <10) ? "Sobresaliente":
        	          (notaFinal == 10) ? "Matricula de honor": "Error de proceso";
       String notaOk= nota==true ? media : "Error de proceso";
       
       System.out.printf("Nota final : %,2.2f %n", notaFinal);
       System.out.println(notaOk);
*/     
	    
	    
//CLASE 04/10
		
/*		//COMILLAS EN UN STRING CON "\""
	    String nombre = "Maria";
	    String apellido = "Jesús";
	    int edad = 20;
	    String nombreCompleto = "\"" +nombre + "\" " + apellido + " La edad es: " + edad;
	    System.out.println(nombreCompleto);
	    
	    
	    //STRING SIEMPRE ES CADENA, SINO ES ERROR DE COMPILACION
	    String cad2 = 10 + "";
	    String cadena = 100 + cad2 + 20;
	    cadena = 100 + "";
	    System.out.println(cadena);
*/	    
	    
	    //CONVERTIR VALORES (EJEMPLO ENTERO A DECIMAL)
/*	    int a = 5;
	    double b = 6.5;
	    a = (int) b;
	    System.out.println(a);
	    System.out.println(b);


        //EJEMPLO DE BYTE A INT
	    byte y = 20;
	    int x = y;
	    y = (byte) x;
*/	    
       int x, y, z;
       x = y = z =50;
       System.out.println(x + y + z);
	    
	    
	    
	    
	    
    }
}
