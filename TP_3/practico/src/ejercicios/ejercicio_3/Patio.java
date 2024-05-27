package ejercicios.ejercicio_3;

public class Patio {
    private String frenteOFondo;
    private int metrosCuadrados;

    public Patio(String frenteOFondo, int metrosCuadrados) {
        this.frenteOFondo = frenteOFondo;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getFrenteOFondo() { return frenteOFondo; }
    public int getMetrosCuadrados() { return metrosCuadrados; }
}
