package clases;

public class Pokemon {
    private String nombre;
    private Color color;
    private double poder;
    private int salud;

    public Pokemon(){}

    public Pokemon(String nombre, Color color){
        this.nombre = nombre;
        this.color = color;
        this.poder = 50;
        this.salud = 100;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public double getPoder(){
        return poder;
    }

    public void setPoder(double poder){
        this.poder = poder;
    }

    public int getSalud(){
        return salud;
    }

    public void setSalud(int salud){
        this.salud = salud;
    }

    public String saludar(){
        return "Hola! Soy " + nombre;
    }

    public String sanar(){
        this.salud = 100;   // restaura salud al máximo
        return nombre + " ha sanado. Su nivel de salud es de " + salud;
    }

    public void evolucionar(String nuevoNombre, Color nuevoColor){
        this.nombre = nuevoNombre;
        this.color = nuevoColor;
        poder *= 1.2;
    }
}
