import clases.*;

public class Main {
    public static void main(String[] args) {
        Empleado administrativo = new Administrativo("Juan Román", "xx-xxx-xxx", "Caronti 128", 2019, Jornada.MEDIA);
        Empleado cajero = new Cajero("Luis Advíncula", "xx-xxx-xxx", "Alvarado 522", 2021);
        Empleado vendedor = new Vendedor("Darío Benedetto", "xx-xxx-xxx", "Zapiola 48", 2022, 5000);
        Empleado repartidor = new Repartidor("Kevin Zenón", "xx-xxx-xxx", "Alem 2233", 2023, 12);

        System.out.println(administrativo.imprimirRecibo());
        System.out.println(cajero.imprimirRecibo());
        System.out.println(vendedor.imprimirRecibo());
        System.out.println(repartidor.imprimirRecibo());
    }
}