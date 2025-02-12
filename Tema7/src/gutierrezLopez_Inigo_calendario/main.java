package gutierrezLopez_Inigo_calendario;

public class main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        
        String[] meses = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};

        // Bucle para recorrer los meses
        for (int mes = 1; mes <= 12; mes++) {
            // Cambiar al mes actual
            calendario.cambiarMes(mes);
            // Imprimir el nombre del mes
            System.out.println(meses[mes - 1] + ": ");

            // Establecer eventos
            if (mes == 1) {
                calendario.setEvento(6, "Dia de reyes");
            } else if (mes == 2) {
                calendario.setEvento(14, "Día de San Valentín");
            } else if (mes == 3) {
                calendario.setEvento(3, "Carnaval");
            } else if (mes == 4) {
                calendario.setEvento(1, "Día de los inocentes");
            } else if (mes == 5) {
                calendario.setEvento(1, "Día del trabajo");
            } else if (mes == 6) {
                calendario.setEvento(19, "Día del padre");
            } else if (mes == 7) {
                calendario.setEvento(4, "Dia de la independencia");
            } else if (mes == 8) {
                calendario.setEvento(20, "Dia mundial de la fotografía");
            } else if (mes == 9) {
                calendario.setEvento(21, "Día de la Paz");
            } else if (mes == 10) {
                calendario.setEvento(12, "Dia de la hispanidad");
            } else if (mes == 11) {
                calendario.setEvento(1, "Dia de todos los Santos");
            } else if (mes == 12) {
                calendario.setEvento(25, "Navidad");
            }
            // Mostrar eventos del mes
            calendario.mostrarEventos();
            System.out.println();
        }
    }
}
