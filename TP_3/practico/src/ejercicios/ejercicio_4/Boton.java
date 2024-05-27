package ejercicios.ejercicio_4;

public class Boton {
    private String tipo;

    public Boton(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){ return tipo; }

    public void click(){
        System.out.println("Botón " + tipo + " clikeado.");
    }
}
