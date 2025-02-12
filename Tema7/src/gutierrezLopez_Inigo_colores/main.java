package gutierrezLopez_Inigo_colores;

public class main {
    public static void main(String[] args) {
        Colores paletaColores = new Colores("","");

        // Agregar colores iniciales
        paletaColores.nuevoColorCalido();
        paletaColores.nuevoColorFrio();

        // Obtener paletas
        paletaColores.obtenPaletaMixta();
        paletaColores.obtenPaletaMonocromatica();
    }
}

