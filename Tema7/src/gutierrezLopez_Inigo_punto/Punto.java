package gutierrezLopez_Inigo_punto;

public class Punto {
	private int x;
	private int y;
	
	Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	public void muestra(){
		System.out.println("X: "+x+", Y: "+y); 
	}
	
	public void desplazaX(int incrementoX) {
		this.x += incrementoX;
	}
	
	public void desplazaY(int incrementoY) {
		this.y += incrementoY;
	}
	
	public void desplazaXY(int inc_X, int inc_Y) {
		this.x += inc_X;
		this.y += inc_Y;
	}
	
	public void distanciaEuclidea() {
		int d = (((x*2 - x*1)*2) + ((y*2 - y*1)*2));
		System.out.println("Distancia Euclidea : "+d);
	}

}
