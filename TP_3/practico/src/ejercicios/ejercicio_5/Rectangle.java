package ejercicios.ejercicio_5;

public class Rectangle extends Shape{
    private double altura, base;

    public Rectangle(double x, double y, double altura, double base) {
        super(x, y);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void dibujar(){
        System.out.println("Dibujando un rectángulo con altura " + altura + " y base " + base + " en coordenadas X: " + x + " e Y: " + y);
    }

    @Override
    public void escalar(double factor) {
        altura *= factor;
        base *= factor;
        System.out.println("Escalando base y altura del rectángulo en " + factor + ". Nueva base: " + base + ". Nueva altura: " + altura);
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Moviendo rectángulo a X = " + ", Y = " + y);
    }
}
