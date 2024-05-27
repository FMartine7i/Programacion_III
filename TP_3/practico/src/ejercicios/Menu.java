package ejercicios;
import ejercicios.ejercicio_1.Habitacion;
import ejercicios.ejercicio_2.TallerMecanico;
import ejercicios.ejercicio_3.Casa;
import ejercicios.ejercicio_4.Ventana;
import ejercicios.ejercicio_5.*;
import ejercicios.ejercicio_6.BaseEmpleados;
import ejercicios.ejercicio_6.Empleado;

public class Menu extends BaseInput{
    public static void renderMenu() {
        int option;

        do {
            System.out.println("\nTrabajo Práctico n° 3");
            System.out.println("-----------------------------");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("0. Salir.");
            System.out.println("Seleccione [0-6]");
            System.out.println("-----------------------------");
            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("\nEjercicio 1:");
                    Habitacion habitacion = new Habitacion();
                    habitacion.menuHabitacion();
                    break;
                case 2:
                    System.out.println("\nEjercicio 2:");
                    TallerMecanico tallerMecanico = new TallerMecanico();
                    tallerMecanico.menuTaller();
                    break;
                case 3:
                    System.out.println("\nEjercicio 3:");
                    Casa casa = new Casa();
                    System.out.print(casa.toString());
                    break;
                case 4:
                    System.out.println("\nEjercicio 4:");
                    Ventana ventana = new Ventana("Ventana de texto ");
                    ventana.mostrarVentana();
                    ventana.cerrar();
                    ventana.irAtras();
                    ventana.irAdelante();
                    ventana.minimizar();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("\nEjercicio 5:");
                    shapeMenu();
                    break;
                case 6:
                    System.out.println("\nEjercicio 6:");
                    menuEmpleados();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione [0-6]");
            }
        } while (option != 0);
    }

    public static void shapeMenu() {
        ShapeList shapeList = new ShapeList();
        Shape circle = new Circle(1, 1, 8);
        Shape triangle = new Triangle(1, 1, 10, 2);
        shapeList.addShape(circle);
        shapeList.addShape(triangle);

        System.out.println("Dibujando todas las figuras: ");
        shapeList.dibujarTodo();
        System.out.println("\nMoviendo todas las figuras: ");
        shapeList.moverTodo(2, 1.5);
        System.out.println("\nEscalando todas las figuras x3: ");
        shapeList.escalarTodo(3);
        System.out.println("\nCantidad de figuras en la lista: " + shapeList.getShapeCount() + "\n");
        System.out.println("\nMoviendo círculo en (1.5, 3.6)");
        circle.mover(1.5, 3.6);

        System.out.println("\nDibujando triángulo:");
        triangle.dibujar();

        System.out.println("\nInsertando nuevo rectángulo en la posición 1");
        Shape rectangle = new Rectangle(2, 5, 8, 8);
        shapeList.insertShape(1, rectangle);

        System.out.println("\nEliminando figura en la posición 2:");
        shapeList.deleteShape(2);
        shapeList.dibujarTodo();
        System.out.println("\nCantidad de figuras en la lista: " + shapeList.getShapeCount() + "\n");
    }

    public static void menuEmpleados() {
        int opcion;
        BaseEmpleados baseEmpleados = new BaseEmpleados();

        do {
            System.out.println("\n---------------------------------------");
            System.out.println("1. Agregar empleados");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Mostrar empleado por tipo");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Mostrar empleado por nombre");
            System.out.println("6. Consultar cantidad de empleados");
            System.out.println("0. Salir");
            System.out.println("---------------------------------------\n");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    baseEmpleados.agregarEmpleado();
                    break;
                case 2:
                    baseEmpleados.mostrarEmpleados();
                    break;
                case 3:
                    baseEmpleados.mostrarEmpleadosPorTipo("A");
                    break;
                case 4:
                    System.out.println("Ingrese un número de ID: ");
                    int id = input.nextInt();
                    baseEmpleados.eliminarEmpleado(id);
                    break;
                case 5:
                    System.out.println("Ingrese un nombre existente: ");
                    input.nextLine();
                    String nombre = input.nextLine();
                    baseEmpleados.mostrarEmpleadoPorNombre(nombre);
                    break;
                case 6:
                    baseEmpleados.cantidadEmpleados();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
            }
        } while (opcion != 0);
    }
}
