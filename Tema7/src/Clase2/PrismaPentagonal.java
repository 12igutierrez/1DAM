package Clase2;

public class PrismaPentagonal {
	
	//Variables
	double altura;
	double apotema;
	double medida_arista_base;
	double area_base;
	double area_lateral;
	
	
	//Estos son los tres ejemplos de constructores
	
	
	//Constructor sin parametros
	PrismaPentagonal(){
		altura = 1;
		apotema = 0.5;
		medida_arista_base = 2;
		calcularAreaBase();
		calcularAreaLateral();
	}
	
	//Constructor con parametros
	PrismaPentagonal(double altura, double apotema, double medida, double area_base, double area_lateral){
		this.altura = altura;
		this.apotema = apotema;
		medida_arista_base = medida;
		this.area_base = area_base;
		this.area_lateral = area_lateral;
	}
	
	/*Constructor con this por parametros, this son los parametros que se introducirán por teclado.
	  Los dos ceros son del area base y area lateral que estan inicializados en 0.*/
	PrismaPentagonal(double altura, double apotema, double medida_arista_base){
		             this (altura,apotema,medida_arista_base,0,0);
	}
	
	
	
	
	
	
	
	public void calcularAreaBase () {
		area_base = (medida_arista_base*5)*apotema;
	}
	
	public void calcularAreaLateral () {
		area_lateral = (medida_arista_base*5)*altura;
	}
	
	double areaTotal () {
		double area_total = (area_base * 2) + area_lateral;
	return area_total;
	}
	
	double volumen () {
		double volumen = area_base * altura;
	return volumen;
	}
	
	static double volumen (double areaBase, double altura1) {
		double volumen = areaBase * altura1;
	return volumen;
	}
	
	void valores() {
	System.out.print("Altura: "+altura+"\nApotema: "+apotema+"\nMedida arista base: "+medida_arista_base+"\nArea base: "+area_base+"\nArea lateral: "+area_lateral);
	}
	
}

