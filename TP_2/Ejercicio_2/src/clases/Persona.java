package clases;

public class Persona {
    protected String nombre;
    protected int altura;

    public Persona(String nombre, int altura){
        this.nombre = nombre;
        this.altura = altura;
    }

    public String toString(){
        return "Nombre: " + nombre+ "\nAltura: " + altura;
    }
}
