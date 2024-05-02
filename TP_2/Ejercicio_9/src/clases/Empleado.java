package clases;

public class Empleado {
    protected String nombre;
    protected String dni;
    protected String domicilio;
    protected int anioIngreso;
    protected int sueldoBasico;
    protected String categoria;

    public Empleado(String nombre, String dni, String domicilio, int anioIngreso){
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.anioIngreso = anioIngreso;
        this.sueldoBasico = 650000;
        this.categoria = "Empleado";
    }

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
