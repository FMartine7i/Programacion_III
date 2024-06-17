import ejercicios.BaseInput;
import ejercicios.EjercicioArreglo;
import ejercicios.Factorial;
import ejercicios.conversion_unidades.ConversionUnidades;
import ejercicios.ejercicio_3.CantidadImpares;
import ejercicios.ejercicio_3.EsCreciente;
import ejercicios.ejercicio_3.ListaCaracteres;
import ejercicios.ejercicio_3.ValorMaximo;
import ejercicios.ejercicio_7.InvertirString;

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
                case 2:
                    System.out.println("\nEjercicio 2: Arreglo");
                    EjercicioArreglo ejercicioArreglo = new EjercicioArreglo();
                    ejercicioArreglo.menuArray();
                    break;
                case 3:
                    System.out.println("\nEjercicio 3: Recursividad");
                    ListaCaracteres.resultado();
                    CantidadImpares.resultado();
                    EsCreciente.resultado();
                    ValorMaximo.resultado();
                    break;
                case 4:
                    System.out.println("\nEjercicio 4: Árbol de lista de nombres");

                    break;
                case 5:
                    System.out.println("\nEjercicio 5: Recorrido de árbol");

                    break;
                case 6:
                    System.out.println("\nEjercicio 6: Encontrar primera palabra no repetida");

                    break;
                case 7:
                    System.out.println("\nEjercicio 7: Invertir String");
                    InvertirString.resultado();
                    break;
                case 8:
                    System.out.println("\nEjercicio 8: Paréntesis balanceados");

                    break;
                case 9:
                    System.out.println("\nEjercicio 9: Conversión de unidades");
                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            ConversionUnidades conversor = new ConversionUnidades();
                            conversor.setVisible(true);
                        }
                    });
                    break;
                case 10:
                    System.out.println("\nEjercicio 10: Adivinanza");

                    break;
                case 11:
                    System.out.println("\nEjercicio 11: Administrar tareas");

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
        System.out.println("Ejercicio 2: Arreglo");
        System.out.println("Ejercicio 3: Recursividad");
        System.out.println("Ejercicio 4: Mostrar pares");
        System.out.println("Ejercicio 5: Comprobar letra mayuscula");
        System.out.println("Ejercicio 6: Comprobar triangulo");
        System.out.println("Ejercicio 7: Invertir String");
        System.out.println("Ejercicio 8: Calcular factorial");
        System.out.println("Ejercicio 9: Conversión de unidades");
        System.out.println("Ejercicio 10: Adivinanza");
        System.out.println("Ejercicio 11: Administrar tareas");
        System.out.println("0. Salir");
        System.out.println("----------------------------------------------");
        System.out.println("\nElija un ejercicio para mostrar por pantalla: ");
    }
}