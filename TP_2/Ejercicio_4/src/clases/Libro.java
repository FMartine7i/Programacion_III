package clases;

public class Libro {
    protected String titulo;
    protected String autor;
    protected double precio;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public String toString(){
        return "Título: " + titulo + "\nAutor: " + autor + "\nPrecio: $" + precio;
    }
}
