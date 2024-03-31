public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    // constructor por defecto
    public Persona(){}

    // constructor con todos los parámetros
    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
        }

    // constructor solo con nombre y apellido
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);            
    }

    public void mayorDeEdad(){
        if (edad >= 18){
            mostrarDatos();
        }
        else{
            System.out.println("Es menor de edad");
        }
    }

    public static void main(String[] args){
        Persona persona = new Persona("Lautaro", "Martinez", 'M', 25, "Bahia Blanca");
        persona.mayorDeEdad();
    }
}


