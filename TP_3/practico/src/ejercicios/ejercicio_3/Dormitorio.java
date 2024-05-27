package ejercicios.ejercicio_3;

public class Dormitorio {
    private int metrosCuadrados;
    private boolean banoEnSuit;
    private int cantidadVentanas;

    public Dormitorio(int metrosCuadrados, boolean banoEnSuit, int cantidadVentanas) {
        this.metrosCuadrados = metrosCuadrados;
        this.banoEnSuit = banoEnSuit;
        this.cantidadVentanas = cantidadVentanas;
    }

    public int getMetrosCuadrados() { return metrosCuadrados; }
    public boolean isBanoEnSuit() { return banoEnSuit; }
    public int getCantidadVentanas() { return cantidadVentanas; }
}
