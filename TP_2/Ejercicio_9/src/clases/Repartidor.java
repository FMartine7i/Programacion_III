package clases;

public class Repartidor extends Empleado{
    private int repartosMensuales;

    public Repartidor(String nombre, String dni, String domicilio, int anioIngreso, int repartosMensuales){
        super(nombre, dni, domicilio, anioIngreso);
        this.categoria = "Repartidor";
        this.repartosMensuales = repartosMensuales;
    }

    public double sueldoTotal(int repartosMensuales){
        return repartosMensuales*500 + sueldoBasico;
    }

    @Override
    public String imprimirRecibo(){
        double sueldo = sueldoTotal(repartosMensuales);

        return "\n------------ RECIBO SUELDO ------------" +
                "\nNombre: " + nombre +
                "\nDNI: " + dni +
                "\nDomicilio: " + domicilio +
                "\nFecha de ingreso: " + anioIngreso +
                "\nCategoría: " + categoria +
                "\nSueldo básico: " + sueldoBasico +
                "\nComisiones por ventas: "+ repartosMensuales*500 +
                "\nSueldo a cobrar: " + sueldo +
                "\n---------------------------------------\n"
                ;
    }
}
