import clases.*;

public class Main {
    public static void main(String[] args) {
        Inmueble casa = new Casa(25, 300, "Casanova 1122", 200, 4, 2, false, 48800, true);
        Inmueble comercial = new Comercial(89, 600, "Sarmiento 2510", 500, TipoComercial.SALIDA_CALLE, "Plaza Shopping");

        System.out.println(casa.imprimir());
        System.out.println(casa.precioDeVenta());
        System.out.println(comercial.imprimir());
        System.out.println(comercial.precioDeVenta());
    }
}