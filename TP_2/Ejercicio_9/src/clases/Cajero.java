package clases;

public class Cajero extends Empleado{

    public Cajero(String nombre, String dni, String domicilio, int anioIngreso){
        super(nombre, dni, domicilio, anioIngreso);
        this.categoria = "Cajero";
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
                "\nSueldo a cobrar: " + sueldoBasico +
                "\n---------------------------------------\n"
                ;
    }
}
