package gutierrezLopez_Inigo_calendario;

public class Dia {
    private int dia;
    private int mes;
    private String evento;

    public Dia(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        this.evento = null;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void mostrarEvento() {
        if (evento != null) {
            System.out.println(dia + "/" + mes + ": " + evento);
        } else {
            System.out.println(dia + "/" + mes + ": No hay evento");
        }
    }
}
