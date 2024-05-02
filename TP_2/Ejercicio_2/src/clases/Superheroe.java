package clases;

public class Superheroe extends Persona {
    protected String nombFicticio;
    protected String tipoPoder;

    public Superheroe(String nombre, int altura, String nombFicticio, String tipoPoder){
        super(nombre, altura);
        this.nombFicticio = nombFicticio;
        this.tipoPoder = tipoPoder;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre+ "\nAltura: " + altura + "cm\nAlias: " + nombFicticio + "\nPoder: " + tipoPoder;
    }
}
