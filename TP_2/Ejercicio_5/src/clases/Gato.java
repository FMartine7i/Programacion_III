package clases;

public class Gato extends Animal{
    public Gato(String nombre, int edad, String raza){
        super(nombre, raza, edad);
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nRaza: " + raza;
    }

    @Override
    public String alimentarse(){
        return "El gato se alimenta de comida para gatos";
    }
}
