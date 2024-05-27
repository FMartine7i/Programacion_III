package ejercicios.ejercicio_5;
import java.util.List;
import java.util.ArrayList;

public class ShapeList {
    private List<Shape> shapes;

    public ShapeList(){
        this.shapes = new ArrayList<>();
    }

    public void dibujarTodo() {
        for (Shape shape : shapes) {
            shape.dibujar();
        }
    }

    public void escalarTodo(double factor) {
        for (Shape shape : shapes) {
            shape.escalar(factor);
        }
    }

    public void moverTodo(double deltaX, double deltaY) {
        for (Shape shape : shapes) {
            shape.mover(deltaX, deltaY);
        }
    }

    public void escalarFiguraElegida(int index, double factor){
        Shape figuraEncontrada = null;

        for (int i = 0; i < shapes.size(); i++) {
            if (index == i) {
                figuraEncontrada = shapes.get(i);
            }
        }
        if (figuraEncontrada != null) {
            figuraEncontrada.escalar(factor);
        }
        else
            System.out.println("Error: no se ha encontrado la figura en la posición " + index);
    }

    public void moverFiguraElegida(int index, double deltaX, double deltaY){
        Shape figuraEncontrada = null;

        for (int i = 0; i < shapes.size(); i++) {
            if (index == i) {
                figuraEncontrada = shapes.get(i);
            }
        }
        if (figuraEncontrada != null) {
            figuraEncontrada.mover(deltaX, deltaY);
        }
        else
            System.out.println("Error: no se ha encontrado la figura en la posición " + index);
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void insertShape(int index, Shape shape) {
        if (index >= 0 && index < shapes.size()) {
            shapes.add(index, shape);
        }
        else
            System.out.println("Índice fuera de rango.");
    }

    public void deleteShape(int index) {
        Shape figuraEncontrada = null;

        for (int i = 0; i < shapes.size(); i++) {
            if (index == i){
                figuraEncontrada = shapes.get(i);
            }
        }

        if (figuraEncontrada != null){
            shapes.remove(figuraEncontrada);
        }
        else
            System.out.println("Error: no se ha encontrado la figura en la posición " + index);
    }

    public int getShapeCount(){ return shapes.size(); }
}
