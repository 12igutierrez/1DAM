package gutierrezLopez_Inigo_tren;

public class Vagon {
    private int numeroOrden;
    private double carga_maxima;
    private double carga_actual;
    enum TipoMercancia {Mineral, Vehiculos, M_Construcción, P_Comercial}
    private TipoMercancia tipoMercancia;

    public Vagon(int numeroOrden, double carga_maxima, double carga_actual, TipoMercancia tipoMercancia) {
        this.numeroOrden = numeroOrden;
        this.carga_maxima = carga_maxima;
        this.carga_actual = carga_actual;
        this.tipoMercancia = tipoMercancia;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }
    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public double getCargaMaxima() {
        return carga_maxima;
    }
    public void setCargaMaxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public double getCargaActual() {
        return carga_actual;
    }
    public void setCargaActual(double carga_actual) {
        this.carga_actual = carga_actual;
    }

    public TipoMercancia getTipoMercancia() {
        return tipoMercancia;
    }
    public void setTipoMercancia(TipoMercancia tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }
}
