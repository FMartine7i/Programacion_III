package clases;

public class Titular {
    private String nombre;
    private String apellido;
    private long dni;
    private String telefono;
    private String mail;

    public Titular(String nombre, String apellido, long dni, String telefono, String mail){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public long getDni(){
        return dni;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getMail(){
        return mail;
    }
}
