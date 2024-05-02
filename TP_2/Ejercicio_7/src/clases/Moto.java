package clases;

public class Moto extends Vehiculo{

    public Moto(String marca, int modelo, String patente, double precio, Motor motor){
        super(marca, modelo, patente, precio, motor);
    }

    public boolean esGamaAlta(){
        return motor.getCilindrada() > 500;
    }

    @Override
    public String encender(){
        return "La moto está encendida.";
    }

    @Override
    public String acelerar() {
        return "La moto está acelerando.";
    }

    @Override
    public String frenar(){
        return "La moto ha frenado.";
    }

    @Override
    public String toString(){
        return "\nMarca: " + marca + "\nModelo: " + modelo + "\nPatente: " + patente + "\nPrecio: " + precio + " usd\nMotor: " + motor;
    }
}
