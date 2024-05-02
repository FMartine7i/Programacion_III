package clases;

public class Novela extends LibroFisico{
    protected Genero genero;

    public Novela(String titulo, String autor, TipoTapa tipoTapa, Genero genero){
        super(titulo, autor, tipoTapa);
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Título: " + titulo + "\nAutor: " + autor + "\nPrecio: $" + precio + "\nTapa: " + tipoTapa + "\nGénero: " + genero;
    }
}
