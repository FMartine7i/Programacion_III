package ejercicios.ejercicio_3;

public class Cocina {
    private TipoHorno tipoHorno;
    private int metrosCuadrados;

    public Cocina(TipoHorno tipoHorno, int metrosCuadrados) {
        this.tipoHorno = tipoHorno;
        this.metrosCuadrados = metrosCuadrados;
    }

    public TipoHorno getTipoHorno() { return tipoHorno; }
    public int getMetrosCuadrados() { return metrosCuadrados; }
}
