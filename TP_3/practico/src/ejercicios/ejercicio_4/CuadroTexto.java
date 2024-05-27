package ejercicios.ejercicio_4;

public class CuadroTexto {
    private String texto;

    public CuadroTexto(){
        this.texto = "";
    }

    public String mostrarTexto(){
       return texto;
    }

    public void agregarTexto(String texto){
        this.texto += texto;
    }
}
