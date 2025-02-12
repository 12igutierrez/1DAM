package Clase4;

import java.util.Arrays;

public class QueDiaEs {
	
	/*-  diaDeLaSemana: será un dia de la semana comprendido entre lunesy domingo (los valores posibles deben ser almacenados 
	 * en un enumerado) en la creacion de la instancia se podrá elegir en que ia de la semana comienza este año. */
	enum DiaSemana {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};
	DiaSemana diaDeLaSemana; //La variable diaDeLaSemana soló podrá almacenar el contenido de DiaSemana
	
	
	/* -  fechaDia: será un entero que alamcenará el dia del mes en el que está, al crear la clase siempre comenzará en 1. */
	int fechaDia;
	
	
	/* -  fechaMes: será un mes comprendido entre Enero y Diciembre (los valores posibles deben ser almacenados en un enumerado),
	 *    siempre comenzara en Enero */
	enum Meses {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE}
	//Meses[] m = Meses.values(); //m[0] -> Enero
	Meses fechaMes;
	
	
	
	QueDiaEs(){
		fechaDia = 1;
		diaDeLaSemana = DiaSemana.LUNES;
		fechaMes = Meses.ENERO;
	}
	
	QueDiaEs(String diaLetras, int dia, String mesLetras){
		
		//Dia en numero
		if (dia > 0 && dia < 32) {
			fechaDia = dia;
		} else {
			fechaDia = 1;
		}
		
		
		//Mes
		Meses[] meses_posibles = Meses.values();
		boolean existe = false;
		for(int i = 0; i < meses_posibles.length; i++) {
			if(mesLetras.equals(meses_posibles[i].name())) {
				fechaMes = Meses.valueOf(mesLetras);
				existe = true;
			}
		}
		if (!existe) {
			fechaMes = Meses.ENERO;
		}
		
		
		//Die en letras
		DiaSemana[] dias_posibles = DiaSemana.values();
		existe = false;
		for(int i = 0; i < dias_posibles.length && !existe; i++) {
			if(diaLetras.equals(dias_posibles[i].name())) {
				diaDeLaSemana = DiaSemana.valueOf(diaLetras);
				existe = true;
			}
		}
		if (!existe) {
			diaDeLaSemana = DiaSemana.LUNES;
		}
	}
	
	/*yaEsManyana: este metodo incrementa en 1 fechaDia y, si llega a 31, reinicia la variable a 1 e incrementa fechaMes. 
	 * Tambine modifica el valor de diaDeLaSemana siguiendo el patron; Lunes a Martes...
	 */
	public void yaEsManyana() {
		if (fechaDia == 31) { //Este if hace que si es 31 el dia cambie a 1
			fechaDia = 1;
			Meses[] meses_posibles = Meses.values();
			if (fechaMes == meses_posibles[meses_posibles.length-1]) { //Este if hace que si es dicimbre lo pase a enero
				fechaMes = meses_posibles[0];  
			} else {
				int pos = Arrays.binarySearch(meses_posibles, fechaMes); //Para los meses que no son diciembre
				fechaMes = meses_posibles[pos+1]; //Incrementa el mes (ENERO->FEBRERO)
			}	
		} else {  //Para todos los dias que no sean 31
			fechaDia++;
		}
		DiaSemana[] dias_posibles = DiaSemana.values();
		if (diaDeLaSemana == dias_posibles[dias_posibles.length-1]) { //Si es domingo lo pase a lunes
			diaDeLaSemana = dias_posibles[0];  //Lunes
		} else {
			int pos = Arrays.binarySearch(dias_posibles, diaDeLaSemana); //Para los dias que no son domingo
			diaDeLaSemana = dias_posibles[pos+1]; //Incrementa el dia (LUNES->MARTES)
		}
	}
	
	/* queDiaEs: este metodo devolverá la fecha con el formato:
	 * "diaDeLaSemana, fechaDia de fechaMes" (SABADO, 15 de ENERO)
	 */
	public String queDiaEs() {
		String fecha = diaDeLaSemana.name()+", "+fechaDia+" de "+fechaMes.name();
		
		return fecha;
	}
	
}