package gutierrezLopez_Inigo_grado;

public class EcuacionSegundoGrado {
	private int a;
	private int b;
	private int c;
	
	EcuacionSegundoGrado(int a, int b, int c){
	this.a = a;
	this.b = b;
	this.c = c;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	public int getB() {
		return b;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	public int getC() {
		return c;
	}
	
	
	public double[] solucion(){
		double dentro_raiz = (b*b) - (4*a*c);
		if (dentro_raiz < 0) {
			System.out.println("ERROR: La raiz cuadrada es negativa");
			return new double[] {0,0};
		}
		double solucion1 = (-b + Math.sqrt(dentro_raiz)) / (2*a);
		double solucion2 = (-b - Math.sqrt(dentro_raiz)) / (2*a);
		
	return new double[] {solucion1,solucion2};
	}
	
}
