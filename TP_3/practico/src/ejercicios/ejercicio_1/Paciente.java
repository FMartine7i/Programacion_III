package ejercicios.ejercicio_1;

public class Paciente {
    private String nombre;
    private String apellido;
    private long dni;
    private boolean internado;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDni(long dni) { this.dni = dni; }
    public void setInternado(boolean internado) { this.internado = internado; }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public long getDni() { return dni; }
    public boolean isInternado() { return internado; }

    public String toString() {
        return "Nombre: " + getNombre()
                + "\nApellido: " + getApellido() +
                "\nDNI: " + getDni() +
                "\nEstá internado: " + isInternado() +
                "\n------------------------\n";
    }
}
