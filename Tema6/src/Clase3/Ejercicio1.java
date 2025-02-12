package Clase3;
public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1: Crea una función que reciba una direccion de correo electronico y compruebe que es
		 * correcta siguiendo:
		 * Que contenga un @
		 * Que lo que haya despues se corresponda con gmail.com / educastillalamancha.es
		 * Metodos: 
		 * cad.indexOf('m', 4); cad.lastIndexOf('m', 4);
		 * Comparacion: cad1.equals(cad2);
		 */
		System.out.println(compruebaCorreo("correotrue@gmail.com"));
		System.out.println(compruebaCorreo("correotrue@educastillalamancha.es"));
		System.out.println(compruebaCorreo("correofalse@hotmail.com"));
	}
	
	static boolean compruebaCorreo (String correo) {
		boolean com = false;
		String [] formatos_correctos = {"gmail.com", "educastillalamancha.es"};
		int pos = correo.lastIndexOf('@');
		if (pos != -1) {
			for(String formato : formatos_correctos) {
				com = correo.regionMatches(pos+1,formato,0,formato.length());
				if (com == true) {
					break;
				}
			}
		}
		return com;
	}
}