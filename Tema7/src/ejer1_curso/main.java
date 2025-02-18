package ejer1_curso;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso cDAM = new Curso("dam1");
        
        cDAM.anyadirEstudiante("Pedro", 20, new double[]{7.5, 8.25, 6.2, 5.5, 3, 4.75, 5, 10, 9, 4});
        cDAM.anyadirEstudiante("Ana", 18, new double[]{9.0, 7.5, 8.5, 4, 3, 5.5, 7.75, 8.2, 1, 3.2});
        cDAM.anyadirEstudiante("María", 19, new double[]{6.5, 7.0, 9.0, 1.5, 2.5, 8.7, 9, 10, 4, 5.8});
        cDAM.anyadirEstudiante("Sara",31, new double[]{7.5, 8.25, 6.2, 5.5, 3, 4.75, 5, 10, 9, 4});
		cDAM.anyadirEstudiante("José",46, new double[]{9.0, 7.5, 8.5, 4, 3, 5.5, 7.75, 8.2, 1, 3.2});
		cDAM.anyadirEstudiante("Jesús",27, new double[]{7.5, 8.25, 6.2, 5.5, 3, 4.75, 5, 10, 9, 4});
		cDAM.anyadirEstudiante("Ainhoa",23, new double[]{9.0, 7.5, 8.5, 4, 3, 5.5, 7.75, 8.2, 1, 3.2});
		cDAM.anyadirEstudiante("Daniel",35, new double[]{6.5, 7.0, 9.0, 1.5, 2.5, 8.7, 9, 10, 4, 5.8});
		cDAM.anyadirEstudiante("David",41, new double[]{7.5, 8.25, 6.2, 5.5, 3, 4.75, 5, 10, 9, 4});
		cDAM.anyadirEstudiante("Mario",21, new double[]{6.5, 7.0, 9.0, 1.5, 2.5, 8.7, 9, 10, 4, 5.8});
		cDAM.anyadirEstudiante("Miguel",18, new double[]{9.0, 7.5, 8.5, 4, 3, 5.5, 7.75, 8.2, 1, 3.2});
        
		cDAM.anyadirProfesor("Julia", "Leng. de Marcas", "12345678K", "1/9/2021");
		cDAM.anyadirProfesor("Julia", "Tutorías", "12345678K", "1/9/2021");
		cDAM.anyadirProfesor("Martín", "Bases de Datos", "11223344K", "1/9/2018");
		cDAM.anyadirProfesor("Miguel", "Sistemas Informáticos", "99887766P", "1/9/2020");
		cDAM.anyadirProfesor("Alma", "Programación", "34251678K", "1/12/2024");
		cDAM.anyadirProfesor("Adela", "Digitalización", "56473829K", "1/9/2024");
		cDAM.anyadirProfesor("Luis", "Sostenibilidad", "10293847K", "1/9/2014");
		cDAM.anyadirProfesor("Llanos", "Itinerarios", "87654321K", "1/10/2018");
		cDAM.anyadirProfesor("Sara", "Ingles", "98765432K", "1/9/2023");
		cDAM.anyadirProfesor("Adela", "Entornos de desarrollo", "56473829K", "1/9/2024");
		cDAM.anyadirProfesor("María Jesús", "Acceso a Datos", "19283847K", "1/9/2016");
        
        int op = -1;
        do {
            System.out.println("\nElija su opcion");
            System.out.println("1. Buscar un alumno por su nombre");
            System.out.println("2. Eliminar un alumno por su nombre");
            System.out.println("3. Eliminar un profesor por su nombre");
            System.out.println("4. Calcular nota media");
            System.out.println("5. Mostrar toda la información");
            System.out.println("6. Salir");
            op = sc.nextInt();
            sc.nextLine();
            switch(op) {
                case 1: System.out.print("Introduce el nombre: "); cDAM.buscarEstudiante(sc.nextLine()); break;
                case 2: System.out.print("Introduce el nombre: "); cDAM.eliminarEstudiante(sc.nextLine()); break;
                case 3: System.out.print("Introduce el nombre: "); cDAM.eliminarProfesor(sc.nextLine()); break;
                case 4: cDAM.calcularMediaNotas(); break;
                case 5: cDAM.mostrarListado(); break;
            }
        } while(op != 6);
        sc.close();
    }
}
