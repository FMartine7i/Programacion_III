package clases;

public class Televisor extends Electrodomestico{
    private int cantPulgadas;

    public Televisor(double precio, String color, char consumo, String marca, int cantPulgadas){
        super(precio, color, consumo, marca);
        this.cantPulgadas = cantPulgadas;
    }

    @Override
    public String imprimirPorPantalla(){
        return super.imprimirPorPantalla() + "\nPulgadas: " + cantPulgadas;
    }
}
