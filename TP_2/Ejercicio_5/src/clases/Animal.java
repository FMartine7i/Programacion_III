package clases;

public class Animal {
    protected String nombre;
    protected String raza;
    protected int edad;

    public Animal(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getRaza(){
        return raza;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nRaza: " + raza;
    }

    public String alimentarse(){
        return "El animal se alimenta de comida general";
    }
}
