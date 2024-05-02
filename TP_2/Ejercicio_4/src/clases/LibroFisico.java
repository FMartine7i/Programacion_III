package clases;

public class LibroFisico extends Libro{
    protected TipoTapa tipoTapa;

    public LibroFisico(String titulo, String autor, TipoTapa tipoTapa){
        super(titulo, autor);
        this.tipoTapa = tipoTapa;
    }

    @Override
    public String toString(){
        return "Título: " + titulo + "\nAutor: " + autor + "\nPrecio: $" + precio + "\nTapa: " + tipoTapa;
    }
}
