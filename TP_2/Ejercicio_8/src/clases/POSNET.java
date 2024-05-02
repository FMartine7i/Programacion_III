package clases;

public class POSNET {
    public String efectuarPago(Titular titular, TarjetaDeCredito tarjetaDeCredito, double monto, int cuotas){
        double recargo = 0.03*(cuotas - 1);
        double montoFinal = monto*(recargo + 1);

        if(tarjetaDeCredito.getSaldoDisponible() > 0){
            double montoCuota = montoFinal / cuotas;

            if(tarjetaDeCredito.realizarPago(montoFinal))
                return ticket(titular, tarjetaDeCredito, montoFinal, cuotas, montoCuota);
            else
                return "Transacción rechazada: Dinero insuficiente.";
        }
        else
            return "Transacción rechazada: No hay saldo en la tarjeta.";
    }

    private String ticket(Titular titular, TarjetaDeCredito tarjetaDeCredito, double montoTotal, int cuotas, double montoCuota){
        return  "\n-------------------- TICKET ---------------------" +
                "\nTitular: " + titular.getNombre() + " " + titular.getApellido() +
                "\nDNI: " + titular.getDni() +
                "\nTeléfono: " + titular.getTelefono() +
                "\nMonto total: " + montoTotal +
                "\nCuotas: " + cuotas +
                "\nMonto por cuota: " + montoCuota +
                "\nTarjeta: " + tarjetaDeCredito.getEntidadFinanciera() +
                "\nBanco: " + tarjetaDeCredito.getEntidadBancaria() +
                "\nNro. Tarjeta: " + tarjetaDeCredito.getNumeroTarjeta() +
                "\n-------------------------------------------------\n";
    }
}
