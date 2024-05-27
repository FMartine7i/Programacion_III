package ejercicios.ejercicio_3;

public class Casa {
    private Dormitorio dormitorio;
    private Bano bano;
    private Patio patio;
    private Cocina cocina;

    public Casa() {
        dormitorio = new Dormitorio(30, true, 1);
        bano = new Bano(true, true);
        patio = new Patio("Fondo", 45);
        cocina = new Cocina(TipoHorno.ELECTRICO, 40);
    }

    public String toString() {
        return "\tCASA\nDormitorio: \nMetros cuadrados: " + dormitorio.getMetrosCuadrados() +
                "\nTiene baño en suit: " + dormitorio.isBanoEnSuit() +
                "\nCantidad de ventanas: " + dormitorio.getCantidadVentanas() +
                "\nBaño: \nTiene Bañera: " + bano.tieneBanera() +
                "\nTiene antebaño: " + bano.isAnteBano() +
                "\nPatio: " + patio.getFrenteOFondo() +
                "\nMetros cuadrados: " + patio.getMetrosCuadrados() +
                "\nCocina: \nTipo horno: " + cocina.getTipoHorno()+
                "\nMetros cuadrados: " + cocina.getMetrosCuadrados()
                + "\n------------------------\n";
    }
}
