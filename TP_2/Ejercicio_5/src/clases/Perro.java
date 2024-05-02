package clases;

public class Perro extends Animal{
    public Perro(String nombre, int edad, String raza){
        super(nombre, raza, edad);
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nRaza: " + raza;
    }

    @Override
    public String alimentarse(){
        return "El perro se alimenta de comida para perros";
    }
}
