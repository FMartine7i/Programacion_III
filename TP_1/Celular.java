public class Celular {
    private String modelo;
    private String marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    // constructor por omisión
    public Celular(){}

    public Celular(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public void realizarLlamada(){
        System.out.println("Llamando...");
    }

    public void cortarLlamada(){
        System.out.println("Llamada terminada.");
    }   
}
