package gutierrezLopez_Inigo_calendario;

public class Calendario {
    private Dia[] diasDelMes;
    private int mesActual;

    public Calendario() {
        this.mesActual = 1;
        cambiarMes(mesActual);
    }

    public void cambiarMes(int mes) {
        this.mesActual = mes;
        
        switch (mesActual) {
            case 1,3,5,7,8,10,12: //enero, marzo, mayo, julio, agosto, octubre y diciembre
                diasDelMes = new Dia[31];
                break;
            case 4,6,9,11: //abril, junio, septiembre y noviembre
                diasDelMes = new Dia[30];
                break;
            case 2: // febrero
                diasDelMes = new Dia[28];
                break;
            default:
                diasDelMes = new Dia[31];  // Por defecto a 31
        }
        
        // Inicializa los dias del mes
        for (int i = 0; i < diasDelMes.length; i++) {
            diasDelMes[i] = new Dia(i + 1, mesActual);
        }
    }

    public void setEvento(int dia, String evento) {
        // Verificar si el dia es valido para el mes actual
        if (dia >= 1 && dia <= diasDelMes.length) {
            diasDelMes[dia - 1].setEvento(evento);
        } else {
            System.out.println("El día no es válido para el mes actual.");
        }
    }

    public void mostrarEventos() {
        // Recorrer el array de dias y mostrar sus eventos
        for (Dia dia : diasDelMes) {
            dia.mostrarEvento();  // Llamar al metodo mostrarEvento de cada dia
        }
    }

    public void cambiarMes() {
        cambiarMes(this.mesActual);
    }
}
