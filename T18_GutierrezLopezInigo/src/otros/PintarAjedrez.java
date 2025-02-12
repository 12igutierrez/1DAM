package otros;

public class PintarAjedrez {
	public static void main(String[] args) {
			for(int fila = 1; fila <= 8; fila++) {
				for(int columna = 1; columna <= 8; columna++) {
					System.out.print(((fila + columna)% 2 == 0) ? "B " : "N ");
				}
				System.out.println();
			}
		}
}