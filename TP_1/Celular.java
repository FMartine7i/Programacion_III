public class Celular {
    private String modelo;
    private String marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    // constructor por omisión
    public Celular(){}

    // constructor con todos los parámetros
    public Celular(String modelo, String marca, int memoria, boolean radio, int nroCelular){
        this.modelo = modelo;
        this.marca = marca;
        this.memoria = memoria;
        this.radio = radio;
        this.nroCelular = nroCelular;
    }

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

    public static void main(String[] args){
        Celular celular = new Celular("Samsung", "S9");
        celular.realizarLlamada();
        celular.cortarLlamada();
    }
    
}
