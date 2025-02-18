package gutierrezLopez_Inigo_tren;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anyo;

    public Locomotora(String matricula, int potencia, int anyo) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyo = anyo;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
}
