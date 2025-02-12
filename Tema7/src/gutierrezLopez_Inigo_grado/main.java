package gutierrezLopez_Inigo_grado;

public class main {

	public static void main(String[] args) {
		EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(4,6,1);
		double[] soluciones = ecuacion.solucion();
		
		System.out.println(soluciones[0]);
		System.out.println(soluciones[1]);

	}

}
