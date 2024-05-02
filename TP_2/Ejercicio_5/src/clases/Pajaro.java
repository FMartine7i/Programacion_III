package clases;

public class Pajaro extends Animal{
    public Pajaro(String nombre, int edad, String raza){
        super(nombre, raza, edad);
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nRaza: " + raza;
    }

    @Override
    public String alimentarse(){
        return "El Pájaro se alimenta de semillas";
    }
}
