package gutierrezLopez_Inigo_tren;

public class main {
    public static void main(String[] args) {
        // Información de los vagones
        String[] infoVagones = {"12000:7450.8:Mineral","10000:10632.6:Vehiculos"};
        
        // Información de la locomotora
        String[] Ma_Po_An_En = {"1324MA_5000_1998"};

        // Crear el tren
        Tren tren = new Tren(2, infoVagones, Ma_Po_An_En, Tren.Empresa.Renfe);
        tren.revisionDelTren();
    }
}
