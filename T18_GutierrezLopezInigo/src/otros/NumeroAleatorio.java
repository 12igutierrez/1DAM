package otros;
public class NumeroAleatorio {

	public static void main(String[] args) {
		
		 //GENERA UN ENTERO ALEATORIO ENTRE  1 y 99

		 int n1 = (int) (Math.random() * 99 + 1);
		 int n2 = (int) (Math.random() * 99 + 1);
		 
		 //GENERA UN ENTERO ALEATORIO ENTRE  0 y 99

		  int n3 = (int) (Math.random() * 100);
		  
		 //GENERA UN ENTERO ALEATORIO ENTRE 1 y 3

		  int n4 = (int) (Math.random() * 3 + 1);
		  
		//GENERA UN ENTERO ALEATORIO ENTRE min y max

		  int max = 45;
		  int min = 1;
		  
		  int n5 = (int) (Math.random() * (max - min + 1) + min);
		  
	}

}
