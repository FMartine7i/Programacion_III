package clases;

public class Lavadora extends Electrodomestico{
    private int revoluciones;
    private int cargaMax;

    public Lavadora(double precio, String color, char consumo, String marca, int revoluciones, int cargaMax){
        super(precio, color, consumo, marca);
        this.revoluciones = revoluciones;
        this.cargaMax = cargaMax;
    }

    @Override
    public String imprimirPorPantalla(){
        return  super.imprimirPorPantalla() + "\nRevoluciones: " + revoluciones + " rpm" + "\nCarga máxima: " + cargaMax;
    }
}
