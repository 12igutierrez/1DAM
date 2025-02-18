
public class Restaurante {
    Plato[] platos;
    Empleado[] empleados;
    private Cliente[] clientes;
    private int[][] comandas;
    private boolean[] mesasLibres;

    public Restaurante() {
        this.platos = new Plato[6];
        this.empleados = new Empleado[5];
        this.clientes = new Cliente[15];
        this.comandas = new int[4][3];
        this.mesasLibres = new boolean[15];

        for (int i = 0; i < mesasLibres.length; i++) {
            mesasLibres[i] = true; // Todas las mesas empiezan libres
        }
    }
    
    
    public int entradaCliente(String nombre) {
        for (int i = 0; i < clientes.length; i++) {
            if (mesasLibres[i]) {
                clientes[i] = new Cliente(nombre, 1, 1);
                mesasLibres[i] = false;
                return i;
            }
        }
        return -1; // No hay mesas disponibles
    }

    public void mostrarMenu() {
        System.out.println("Menú del Restaurante:");
        for (Plato plato : platos) {
            if (plato != null) {
                plato.mostrarInformacion();
            }
        }
    }

    public void apuntaComanda(int platoId, int mesa) {
        if (mesa >= 0 && mesa < 15 && !mesasLibres[mesa]) {
            for (int i = 0; i < comandas.length; i++) {
                if (comandas[i][2] == 0) { // Busca una comanda libre
                    comandas[i][0] = platoId;
                    comandas[i][1] = mesa;
                    comandas[i][2] = 0;
                    System.out.println("Pedido registrado: " + platos[platoId].getNombre() + " para la mesa " + mesa);
                    return;
                }
            }
            System.out.println("No se pueden tomar más comandas por ahora.");
        } else {
            System.out.println("Mesa no válida.");
        }
    }

    public void tandaDeCocina() {
        for (int i = 0; i < comandas.length; i++) {
            if (comandas[i][2] == 0) { // Si la comanda está pendiente
                for (Empleado e : empleados) {
                    if (e != null && e.isCocinero()) {
                        e.cocinaComanda(platos[comandas[i][0]].getIngredientes());
                        comandas[i][2] = 1; // Comanda lista
                        System.out.println("Comanda lista: " + platos[comandas[i][0]].getNombre());
                        break;
                    }
                }
            }
        }
    }

    public void entregarComanda() {
        for (int i = 0; i < comandas.length; i++) {
            if (comandas[i][2] == 1) { // Si la comanda está lista
                int mesa = comandas[i][1];
                clientes[mesa].anyadirACuenta(platos[comandas[i][0]].getPrecio());
                comandas[i][2] = 0; // Liberar la comanda
                System.out.println("Pedido entregado a la mesa " + mesa);
                break;
            }
        }
    }

    public void salidaCliente(int mesa) {
        if (mesa >= 0 && mesa < 15 && !mesasLibres[mesa]) {
            clientes[mesa].mostrarCuenta();
            clientes[mesa] = null;
            mesasLibres[mesa] = true;
        } else {
            System.out.println("Mesa no válida.");
        }
    }

    public void resumenDia() {
        for (Empleado e : empleados) {
            if (e != null) {
                e.mostrarResumen();
            }
        }
    }
}