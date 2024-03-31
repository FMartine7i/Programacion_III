public class Auto {
    private String color;
    private String patente;
    private int anio;
    private String modelo;
    private int km;

    // constructor por omisión
    public Auto(){}

    // constructor con todos los parámetros
    public Auto(String color, String patente, int anio, String modelo, int km){
        this.color = color;
        this.patente = patente;
        this.anio = anio;
        this.modelo = modelo;
        this.km = km;
    }

    public void encender(){
        System.out.println("El auto se encendio");
    }

    public void kilometrajeMayor(){
        if (km >= 100000){
            System.out.println("Color: " + color + ", patente: " + patente + ", año: " + anio + ", modelo: " + modelo + ", km: " + km);;
        }
        else
            System.out.println("No hay autos que superen los 100000 km");
    }

    public static void main(String[] args){
        Auto auto = new Auto("gris", "ABC123", 2018, "Dodge", 100001);
        auto.encender();
        auto.kilometrajeMayor();
    }
}