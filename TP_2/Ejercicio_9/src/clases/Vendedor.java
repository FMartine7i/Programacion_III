package clases;

public class Vendedor extends Empleado{
    private double totalVentasMensuales;

    public Vendedor(String nombre, String dni, String domicilio, int anioIngreso, int totalVentasMensuales){
        super(nombre, dni, domicilio, anioIngreso);
        this.totalVentasMensuales = totalVentasMensuales;
    }

    public double sueldoTotal(){
        return totalVentasMensuales*0.5 + sueldoBasico;
    }

    @Override
    public String imprimirRecibo(){

        return "\n------------ RECIBO SUELDO ------------" +
                "\nNombre: " + nombre +
                "\nDNI: " + dni +
                "\nDomicilio: " + domicilio +
                "\nFecha de ingreso: " + anioIngreso +
                "\nCategoría: " + categoria +
                "\nSueldo básico: " + sueldoBasico +
                "\nComisión por ventas: " + totalVentasMensuales*0.5 +
                "\nSueldo a cobrar: " + sueldoTotal() +
                "\n---------------------------------------\n"
                ;
    }
}
