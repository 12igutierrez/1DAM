package datos;

public class OperaYAsigna {

	public static void main(String[] args) {
		int a=6;
		int b=-2;
		int c=3;
		
		a+=5;
		System.out.println("a = "+ a);
		
		a+=b;
		System.out.println("a = "+ a);
		
		a+=b+c;
		System.out.println("a = "+ a);
		
		a*=b+c;
		System.out.println("a = "+ a);
		

	}

}
