package clases;

public class Apartamento extends  Vivienda{
    private double valorAdministracion;
    private boolean monoambiente;

    Apartamento(int id, int area, String direccion, double valorPorMetroCuadrado, int numHabitaciones, int numBanios, double valorAdministración, boolean monoambiente){
        super(id, area, direccion, valorPorMetroCuadrado, numHabitaciones, numBanios);
        this.valorAdministracion = valorAdministracion;
        this.monoambiente = monoambiente;
    }

    @Override
    public String imprimir(){
        return "\nApartamento:" +
                "\nID: " + id +
                "\nÁrea: " + area + " m²" +
                "\nDirección: " + direccion +
                "\nValor por metro cuadrado: " + valorPorMetroCuadrado + " usd" +
                "\nNúmero de habitaciones: " + (monoambiente ? 0 : numHabitaciones) +
                "\nNúmero de baños: " + numBanios +
                "\nValor de administración: " + valorAdministracion + " usd" +
                "\nTipo: " + (monoambiente ? "Monoambiente" : "Depto. Familiar") + "\n";
    }
}
