package ejercicios.ejercicio_6;

import java.time.LocalDate;

public abstract class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaIngreso;
    private double sueldo;

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }
    public double getSueldo() { return sueldo; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) {this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    public abstract String realizarTarea();
}
