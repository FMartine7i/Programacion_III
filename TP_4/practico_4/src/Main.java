import ejercicios.BaseInput;
import ejercicios.ejercicio_1.Factorial;
import ejercicios.ejercicio_11.GestorTarea;
import ejercicios.ejercicio_3.*;

public class Main extends BaseInput {
    public static void main(String[] args) {
        int op;

        do{
            mostrarMenu();
            op = input.nextInt();
            input.nextLine(); //limpia el salto de linea
            switch(op){
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("\nEjercicio 1: Calcular factorial");
                    Factorial factorial = new Factorial();
                    factorial.ingresarNum();
                    break;
                case 3:
                    System.out.println("\nEjercicio 3: Recursividad");
                    Submenu.renderMenu();
                    break;
                case 11:
                    System.out.println("\nEjercicio 11: Administrador de tareas");
                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new GestorTarea();
                        }
                    });
                    break;
                default:
                    System.out.println("Ejercicio no válido");
                    break;
            }
        }
        while(op != 0);

        input.close();
    }

    public static void mostrarMenu(){
        System.out.println();
        System.out.println("------------------- MENU ---------------------");
        System.out.println("Ejercicio 1: Calcular factorial");
        System.out.println("Ejercicio 3: Recursividad");
        System.out.println("Ejercicio 11: Administrador de tareas");
        System.out.println("0. Salir");
        System.out.println("----------------------------------------------");
        System.out.println("\nElija un ejercicio para mostrar por pantalla: ");
    }
}