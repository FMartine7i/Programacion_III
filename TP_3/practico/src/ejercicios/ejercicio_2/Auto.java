package ejercicios.ejercicio_2;

public class Auto {
    private String patente;
    private String marca;
    private int modelo;
    private Motor motor;

    public Auto(String patente, String marca, int modelo, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setPatente(String patente) { this.patente = patente; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(int modelo) { this.modelo = modelo; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public String getPatente() { return patente; }
    public int getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public String getMarca() { return marca; }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                '}';
    }
}
