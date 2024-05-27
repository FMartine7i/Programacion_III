package ejercicios.ejercicio_2;

public class Motor {
    private int numeroMotor;
    private int kilometraje;
    private int cilindrada;

    public Motor(int numeroMotor, int kilometraje, int cilindrada) {
        this.numeroMotor = numeroMotor;
        this.kilometraje = kilometraje;
        this.cilindrada = cilindrada;
    }

    public void setNumeroMotor(int numeroMotor) { this.numeroMotor = numeroMotor; }
    public void setKilometraje(int kilometraje) { this.kilometraje = kilometraje; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

    public int getNumeroMotor() { return numeroMotor; }
    public int getKilometraje() { return kilometraje; }
    public int getCilindrada() { return cilindrada; }

    @Override
    public String toString() {
        return "Motor{" +
                "numeroMotor='" + numeroMotor + '\'' +
                ", kilometraje=" + kilometraje +
                ", cilindrada='" + cilindrada + '\'' +
                '}';
    }
}
