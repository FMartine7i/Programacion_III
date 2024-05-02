package clases;

public class Vivienda extends Inmueble{
    protected int numHabitaciones;
    protected int numBanios;

    public Vivienda(int id, int area, String direccion, double valorPorMetroCuadrado, int numHabitaciones, int numBanios){
        super(id, area, direccion, valorPorMetroCuadrado);
        this.numHabitaciones = numHabitaciones;
        this.numBanios = numBanios;
    }

    @Override
    public String imprimir(){
        return "\nVivienda:" +
                "\nID: " + id +
                "\nÁrea: " + area + " m²\n" +
                "Dirección: " + direccion +
                "\nValor por metro cuadrado: " + valorPorMetroCuadrado + " usd\n" +
                "Número de habitaciones: " + numHabitaciones +
                "\nNúmero de baños: " + numBanios;
    }
}
