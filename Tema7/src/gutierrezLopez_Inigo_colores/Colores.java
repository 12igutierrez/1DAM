package gutierrezLopez_Inigo_colores;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Colores {
	static Scanner sc = new Scanner (System.in);
	private String [] coloresCalidos;
	private String [] coloresFrios;
	
	Colores (String coloresCalidos, String coloresFrios){
		this.coloresCalidos = new String[0];
		this.coloresFrios = new String[0];
	}
	
	public void setColoresCalidos(String [] coloresCalidos) {
		this.coloresCalidos = coloresCalidos;
	}
	public String [] getColoresCalidos() {
		return coloresCalidos;
	}
	
	public void setColoresFrios(String [] coloresFrios) {
		this.coloresFrios = coloresFrios;
	}
	public String [] getColoresFrios() {
		return coloresFrios;
	}
	
	public void nuevoColorCalido() {
		String colorCalido;
		while (true) {
            System.out.print("Añade un nuevo color cálido: ");
            colorCalido = sc.nextLine();

            if (colorCalido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                break;
            } else {
                System.out.println("ERROR. Introduce solo letras.");
            }
        }
		//Nuevo array para agregar un nuevo color
		String [] copiarColor = new String[coloresCalidos.length +1];
		
		//Bucle para copiar de coloresCalidos a copiarColor
		for (int i = 0; i < coloresCalidos.length; i++) {
			copiarColor[i] = coloresCalidos[i];
		}
		//Agregar el nuevo color en la ultima posicion
		copiarColor[copiarColor.length - 1] = colorCalido;
		coloresCalidos = copiarColor;
		
		System.out.println("Colores calidos: "+Arrays.toString(coloresCalidos));
		System.out.println();
	}
	
	public void nuevoColorFrio() {
		String colorFrio;
		while (true) {
			System.out.print("Añade un nuevo color frio: ");
			colorFrio = sc.nextLine();
			
			if (colorFrio.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                break;
            } else {
                System.out.println("ERROR. Introduce solo letras.");
            }
		}
		
		String [] copiarColor = new String[coloresFrios.length +1];
		
		for (int i = 0; i < coloresFrios.length; i++) {
			copiarColor[i] = coloresFrios[i];
		}
		copiarColor[copiarColor.length - 1] = colorFrio;
		coloresFrios = copiarColor;
		
		System.out.println("Colores frios: "+Arrays.toString(coloresFrios));
		System.out.println();
	}
	
	public void obtenPaletaMixta(){
		this.coloresCalidos = new String [] {"rosas","rojos","naranjas","marrones","amarillo"};
		this.coloresFrios = new String [] {"verdes","azules","morados","grises"};
		String [] paleta = new String[4];
		
		Random random = new Random();
		
		//2 colores calidos aleatorios
		for (int i = 0; i < 2; i++) {
			int indiceCalido = random.nextInt(coloresCalidos.length);
			paleta[i] = coloresCalidos[indiceCalido];
		}
		
		//2 colores frios aleatorios (a partir de la posicion 2)
		for (int i = 0; i < 2; i++) {
			int indiceFrio = random.nextInt(coloresFrios.length);
			paleta[i + 2] = coloresFrios[indiceFrio];
		}
		
		//Imprimir por pantalla los 4 colores
		System.out.println("Paleta mixta: "+Arrays.toString(paleta));
		System.out.println();	
		
	}
	
	public void obtenPaletaMonocromatica() {
		this.coloresCalidos = new String [] {"rosas","rojos","naranjas","marrones","amarillo"};
		this.coloresFrios = new String [] {"verdes","azules","morados","grises"};
		String [] paleta = new String[4];
		
		Random random = new Random();
		
		for (int i = 0; i < 4; i++) {
			System.out.print("¿Que tipo de color quieres? ('f' frio 'c' calido): ");
			char tipoColor = sc.nextLine().charAt(0);
			if (tipoColor == 'c') {
				int indiceCalido = random.nextInt(coloresCalidos.length);
				paleta[i] = coloresCalidos[indiceCalido];
			} else if (tipoColor == 'f') {
				int indiceFrio = random.nextInt(coloresFrios.length);
				paleta[i] = coloresFrios[indiceFrio];
			} else {
				System.out.println("ERROR: Introduce un tipo valido (valor null).");
			}
			
		}
		System.out.println();
		System.out.println("Paleta monocromática: "+Arrays.toString(paleta));
	}
	
}
