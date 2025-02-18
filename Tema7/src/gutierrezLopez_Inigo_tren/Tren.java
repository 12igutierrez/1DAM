package gutierrezLopez_Inigo_tren;

public class Tren {
    private Vagon[] vagones;
    private int num_vagones;
    private Locomotora locomotora;
    enum Empresa {Renfe, Iryo, Ouigo};
    private Empresa empresa;

    public Tren(int num_vagones, String[] infoVagones, String[] Ma_Po_An_En, Empresa empresa) {
        this.num_vagones = num_vagones;
        this.empresa = empresa;
        
        // Crear la locomotora a partir de la info
        String[] locInfo = Ma_Po_An_En[0].split("_");
        this.locomotora = new Locomotora(locInfo[0], Integer.parseInt(locInfo[1]), Integer.parseInt(locInfo[2]));

        // Crear los vagones
        this.vagones = new Vagon[num_vagones];
        for (int i = 0; i < num_vagones; i++) {
            String[] vagonInfo = infoVagones[i].split(":");
            double cargaMaxima = Double.parseDouble(vagonInfo[0]);
            double cargaActual = Double.parseDouble(vagonInfo[1]);
            Vagon.TipoMercancia tipo = Vagon.TipoMercancia.valueOf(vagonInfo[2]);
            vagones[i] = new Vagon(i + 1, cargaMaxima, cargaActual, tipo);
        }
    }

    public Vagon[] getVagones() {
        return vagones;
    }
    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }

    public int getNumVagones() {
        return num_vagones;
    }
    public void setNumVagones(int num_vagones) {
        this.num_vagones = num_vagones;
    }

    public Locomotora getLocomotora() {
        return locomotora;
    }
    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void revisionDelTren() {
        System.out.println("Tren de la empresa " + empresa);
        System.out.println("Locomotora con matricula "+locomotora.getMatricula()+" de potencia "+locomotora.getPotencia()+
                           " fabricada en el año "+locomotora.getAnyo());
        
        for (Vagon vagon : vagones) {
            System.out.println("Vagón "+vagon.getNumeroOrden()+": Carga con "+vagon.getCargaActual() + 
                               " kilos de "+vagon.getTipoMercancia()+" siendo su carga máxima "+vagon.getCargaMaxima());
        }
    }
}
