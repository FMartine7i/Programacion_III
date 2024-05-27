package ejercicios;
import ejercicios.ejercicio_1.Habitacion;
import ejercicios.ejercicio_2.TallerMecanico;
import ejercicios.ejercicio_3.Casa;
import ejercicios.ejercicio_4.Ventana;

public class Menu extends BaseInput{
    public static void renderMenu() {
        int option;

        do {
            System.out.println("Trabajo Práctico n° 3");
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
                    break;
                case 6:
                    System.out.println("\nEjercicio 6:");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione [0-6]");
            }
        } while (option != 0);
    }
}
