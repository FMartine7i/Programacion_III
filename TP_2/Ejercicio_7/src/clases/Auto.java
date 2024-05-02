package clases;

public class Auto extends Vehiculo{
    private boolean aireEncendido;

    public Auto(String marca, int modelo, String patente, double precio, Motor motor){
        super(marca, modelo, patente, precio, motor);
        this.aireEncendido = false;
    }

    public String encenderAireAcondicionado(){
        aireEncendido = true;
        return "El aire acondicionado está encendido";
    }

    public String apagarAireAcondicionado(){
        aireEncendido = false;
        return "El aire acondicionado está apagado";
    }

    @Override
    public String encender(){
        return "El auto se ha encendido.";
    }

    @Override
    public String acelerar(){
        return "El auto está acelerando.";
    }

    @Override
    public String frenar(){
        return "El auto ha frenado.";
    }

    @Override
    public String toString(){
        return "\nMarca: " + marca + "\nModelo: " + modelo + "\nPatente: " + patente + "\nPrecio: " + precio + " usd\nMotor: " + motor;
    }
}
