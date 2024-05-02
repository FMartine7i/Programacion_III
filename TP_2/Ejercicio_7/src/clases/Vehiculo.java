package clases;

public abstract class Vehiculo {
    protected String marca;
    protected int modelo;
    protected String patente;
    protected double precio;
    protected Motor motor;

    public Vehiculo(String marca, int modelo, String patente, double precio, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.precio = precio;
        this.motor = motor;
    }

    public abstract String encender();
    public abstract String acelerar();
    public abstract String frenar();
    public abstract String toString();
}
