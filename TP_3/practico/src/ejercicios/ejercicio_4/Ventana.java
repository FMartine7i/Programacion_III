package ejercicios.ejercicio_4;
import ejercicios.BaseInput;

public class Ventana extends BaseInput{
    private String titulo;
    private Boton botonCerrar;
    private Boton botonMinimizar;
    private Boton botonAgregarComentario;
    private Boton irAtras;
    private Boton irAdelante;
    private Boton botonAyuda;
    private CuadroTexto cuadroTexto;
    private BarraDesplazamiento barraDesplazamiento;

    public Ventana(String titulo){
        this.titulo = titulo;
        this.botonCerrar = new Boton("Cerrar");
        this.botonMinimizar = new Boton("Minimizar");
        this.botonAgregarComentario = new Boton("Agregar comentario");
        this.irAtras = new Boton("Ir atrás");
        this.irAdelante = new Boton("Ir adelante");
        this.botonAyuda = new Boton("Ver ayuda");
        this.cuadroTexto = new CuadroTexto();
        this.barraDesplazamiento = new BarraDesplazamiento();
    }

    public void mostrarVentana() {
        agregarComentario();
        System.out.println("\n" + getTitulo() + "-".repeat(35) + " " + botonMinimizar.getTipo() + " " + botonCerrar.getTipo());
        System.out.println("| " + " ".repeat(65) + " |");
        System.out.println("| " + cuadroTexto.mostrarTexto() + " " + barraDesplazamiento.desplazar() + " ".repeat(52) + " |");
        System.out.println("| "  + " ".repeat(65) + " |");
        System.out.println("| " + irAtras.getTipo() + "  " + irAdelante.getTipo() + "  " + botonAyuda.getTipo() + " ".repeat(33) +" |");
        System.out.println("-".repeat(70) + "\n");
    }

    public String getTitulo() { return titulo; }
    public void cerrar() {
        botonCerrar.click();
        System.out.println("Cerrando ventana...");
    }

    public void minimizar() {
        botonMinimizar.click();
        System.out.println("Ventana minimizada.");
    }

    public void agregarComentario() {
        System.out.println("Ingresar comentario: ");
        String comentario = input.nextLine();
        input.nextLine(); // consume salto de línea
        botonAgregarComentario.click();
        cuadroTexto.agregarTexto(comentario);
    }

    public void irAtras() {
        irAtras.click();
    }

    public void irAdelante() {
        irAdelante.click();
    }

    public void verAyuda() {
        botonAyuda.click();
    }
}
