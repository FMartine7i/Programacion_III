package clases;

public class Administrativo extends Empleado{
    private Jornada jornada;

    public Administrativo(String nombre, String dni, String domicilio, int anioIngreso, Jornada jornada){
        super(nombre, dni, domicilio, anioIngreso);
        this.jornada = jornada;
    }

    public double sueldoTotal(){
        if(jornada.equals(Jornada.MEDIA))
            return sueldoBasico + 80*500;
        else
            return sueldoBasico + 160*500;
    }

    @Override
    public String imprimirRecibo(){
        double sueldo = sueldoTotal();

        return "\n------------ RECIBO SUELDO ------------" +
                "\nNombre: " + nombre +
                "\nDNI: " + dni +
                "\nDomicilio: " + domicilio +
                "\nFecha de ingreso: " + anioIngreso +
                "\nCategoría: " + categoria +
                "\nSueldo básico: " + sueldoBasico +
                "\nPaga por jornada: " + (sueldo - sueldoBasico) +
                "\nSueldo a cobrar: " + sueldo +
                "\n---------------------------------------\n"
                ;
    }
}
