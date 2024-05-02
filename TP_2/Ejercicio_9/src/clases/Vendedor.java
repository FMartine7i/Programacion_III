package clases;

public class Vendendor extends Empleado{
    private int ventasMensuales;

    public Vendendor(String nombre, String dni, String domicilio, int anioIngreso, int ventasMensuales){
        super(nombre, dni, domicilio, anioIngreso);
        this.ventasMensuales = ventasMensuales;
    }

    public double sueldoTotal(){
        return ventasMensuales
    }

    @Override
    public String reciboSueldo(){

        return "\n------------ RECIBO SUELDO ------------" +
                "\nNombre: " + nombre +
                "\nDNI: " + dni +
                "\nDomicilio: " + domicilio +
                "\nFecha de ingreso: " + anioIngreso +
                "\nCategoría: " + categoria +
                "\nSueldo básico: " + sueldoBasico +
                "\nComisión por ventas: " +
                "\nSueldo a cobrar: " + sueldoTotal() +
                "\n---------------------------------------\n"
                ;
    }
}
