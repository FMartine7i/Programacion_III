package ejercicios.ejercicio_3;

public class Bano {
    private boolean banera;
    private boolean anteBano;

    public Bano(boolean banera, boolean anteBano) {
        this.banera = banera;
        this.anteBano = anteBano;
    }

    public boolean tieneBanera() { return banera; }
    public boolean isAnteBano() { return anteBano; }
}
