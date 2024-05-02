import clases.*;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Radamel", "Falcao", 12354684, "45-2588887", "falcao@mail.com");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(EntidadFinanciera.VISA, "Banco Macro", "42588-4579-7771", 1500, titular);
        POSNET posnet = new POSNET();
        System.out.println(posnet.efectuarPago(titular, tarjetaDeCredito, 1000, 5));
    }
}