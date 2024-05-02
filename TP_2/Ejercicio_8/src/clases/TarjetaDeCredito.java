package clases;

public class TarjetaDeCredito {
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldoDisponible;
    private Titular titular;

    public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, String numeroTarjeta, double saldoDisponible, Titular titular){
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }

    public EntidadFinanciera getEntidadFinanciera(){
        return entidadFinanciera;
    }

    public String getEntidadBancaria(){
        return entidadBancaria;
    }

    public String getNumeroTarjeta(){
        return numeroTarjeta;
    }

    public double getSaldoDisponible(){
        return saldoDisponible;
    }

    public Titular getTitular(){
        return titular;
    }

    public boolean realizarPago(double monto){
        if(saldoDisponible >= monto){
            saldoDisponible -= monto;
            return true;
        }
        else
            return false;
    }
}
