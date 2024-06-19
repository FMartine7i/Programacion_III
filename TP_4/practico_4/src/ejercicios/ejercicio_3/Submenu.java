package ejercicios.ejercicio_3;

import ejercicios.BaseInput;

public class Submenu extends BaseInput {
    public static void renderMenu() {
        int option;
        do {
            System.out.println("\n1. Determinar si hay una cadena en una lista de cadenas");
            System.out.println("2. Contar cantidad de números impares en una lista");
            System.out.println("3. Determinar si lista de enteros es creciente");
            System.out.println("4. Determinar máximo de una lista de valores");
            System.out.println("0. Salir");
            System.out.println("Seleccionar [0-4]\n");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Escriba el lenguaje de programación buscado: ");
                    input.nextLine();
                    String lang = input.nextLine();
                    ListaCaracteres.resultado(lang);
                    break;
                case 2:
                    CantidadImpares.resultado();
                    break;
                case 3:
                    EsCreciente.resultado();
                    break;
                case 4:
                    ValorMaximo.resultado();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
            }
        } while (option != 0);
    }
}
