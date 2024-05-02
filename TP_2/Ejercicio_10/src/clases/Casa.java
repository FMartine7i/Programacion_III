package clases;

public class Casa extends Vivienda{
    private boolean conjuntoCerrado;
    private double valorAdministracion;
    private boolean tieneAreasComunes;

    public Casa(int id, int area, String direccion, double valorPorMetroCuadrado, int numHabitaciones, int numBanios, boolean conjuntoCerrado, double valorAdministracion, boolean tieneAreasComunes){
        super(id, area, direccion, valorPorMetroCuadrado, numHabitaciones, numBanios);
        this.conjuntoCerrado = conjuntoCerrado;
        this.valorAdministracion = valorAdministracion;
        this.tieneAreasComunes = tieneAreasComunes;
    }

    private String tieneValorAdministracion() {
        if (conjuntoCerrado)
            return String.valueOf(valorAdministracion) + " usd";
        else
            return null;
    }

    @Override
    public String imprimir(){
        return "\nCasa:" +
                "\nID: " + id +
                "\nÁrea: " + area + " m²" +
                "\nDirección: " + direccion +
                "\nValor por metro cuadrado: " + valorPorMetroCuadrado + " usd" +
                "\nNúmero de habitaciones: " + numHabitaciones +
                "\nNúmero de baños: " + numBanios +
                "\nTipo: " + (conjuntoCerrado ? "Conjunto cerrado" : "Independiente") +
                "\nValor administración: " + tieneValorAdministracion() +
                "\nTiene áreas comunes: " + (tieneAreasComunes ? "Sí" : "No") + "\n";
    }
}
