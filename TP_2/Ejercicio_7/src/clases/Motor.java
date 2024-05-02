package clases;

public class Motor {
    private int cilindrada;
    private int numeroMotor;
    private double kilometraje;

    public Motor(int cilindrada, int numeroMotor, double kilometraje){
        this.cilindrada = cilindrada;
        this.numeroMotor = numeroMotor;
        this.kilometraje = kilometraje;
    }

    public int getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getNumeroMotor(){
        return numeroMotor;
    }

    public double getKilometraje(){
        return kilometraje;
    }

    public void setKilometraje(double kilometraje){
        this.kilometraje = kilometraje;
    }
}
