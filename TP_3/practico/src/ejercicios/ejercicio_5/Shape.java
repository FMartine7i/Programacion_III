package ejercicios.ejercicio_5;

public abstract class Shape {
    protected double x, y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void dibujar();
    public abstract void escalar(double factor);
    public abstract void mover(double deltaX, double deltaY);
}
