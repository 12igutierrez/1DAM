
public class Ejercicio1 {

	public static void main(String[] args) {
        
        int dia = 40, mes = 39;
        System.out.println(NombreDiaSemana(dia, mes));

    }
	
    public static String NombreDiaSemana(int dia, int mes) {
    	
        // Número de días acumulados hasta el inicio de cada mes
        int diasDelMes = 0;
        
        switch (mes) {
            case 1:  diasDelMes = 0; break;
            case 2:  diasDelMes = 31; break;
            case 3:  diasDelMes = 59; break;
            case 4:  diasDelMes = 90; break;
            case 5:  diasDelMes = 120; break;
            case 6:  diasDelMes = 151; break;
            case 7:  diasDelMes = 181; break;
            case 8:  diasDelMes = 212; break;
            case 9:  diasDelMes = 243; break;
            case 10: diasDelMes = 273; break;
            case 11: diasDelMes = 304; break;
            case 12: diasDelMes = 334; break;
        }

        // Calcular el día del año
        int diaDelAno = diasDelMes + dia - 1;

        
        int diaSemana = diaDelAno % 7;

        // Determinar el nombre del día de la semana
        String nombreDia = "";
        
        switch (diaSemana) {
            case 0: nombreDia = "Viernes"; break;
            case 1: nombreDia = "Sábado"; break;
            case 2: nombreDia = "Domingo"; break;
            case 3: nombreDia = "Lunes"; break;
            case 4: nombreDia = "Martes"; break;
            case 5: nombreDia = "Miércoles"; break;
            case 6: nombreDia = "Jueves"; break;
        }

        String nombreMes = "";
        
        switch (mes) {
            case 1:  nombreMes = "Enero"; break;
            case 2:  nombreMes = "Febrero"; break;
            case 3:  nombreMes = "Marzo"; break;
            case 4:  nombreMes = "Abril"; break;
            case 5:  nombreMes = "Mayo"; break;
            case 6:  nombreMes = "Junio"; break;
            case 7:  nombreMes = "Julio"; break;
            case 8:  nombreMes = "Agosto"; break;
            case 9:  nombreMes = "Septiembre"; break;
            case 10: nombreMes = "Octubre"; break;
            case 11: nombreMes = "Noviembre"; break;
            case 12: nombreMes = "Diciembre"; break;
            default: nombreMes = "(ERROR: Mes incorrecto)"; break;
        }
        return "El día " + dia + " de " + nombreMes + " es " + nombreDia + ".";
    }

}