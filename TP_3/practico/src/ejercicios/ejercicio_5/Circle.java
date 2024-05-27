package ejercicios.ejercicio_5;

public class Circle extends Shape{
    private double radio;

    public Circle(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio " + radio + " en coordenadas X: " + x + " e Y: " + y);
    }

    @Override
    public void escalar(double factor) {
        radio *= factor;
        System.out.println("Escalando radio del círculo en " + factor + ". Nuevo radio: " + radio);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo círculo a X = " + ", Y = " + y);
    }
}
