import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
                    System.out.println("\nEjercicio 1: Persona");
                    Persona persona = new Persona("Lautaro", "Martinez", 'M', 25, "Bahia Blanca");
                    persona.mayorDeEdad();   
                    break;
                case 2:
                    System.out.println("\nEjercicio 2: Auto");
                    Auto auto = new Auto("gris", "ABC123", 2018, "Dodge", 100001);
                    auto.encender();
                    auto.kilometrajeMayor();
                    break;
                case 6:
                    System.out.println("\nEjercicio 6: Celular");
                    Celular celular = new Celular("Samsung", "S9");
                    celular.realizarLlamada();
                    celular.cortarLlamada();
                    break;
                case 7:
                    System.out.println("\nEjercicio 7: Mostrar pares");
                    Paridad.devolverParidad(input);
                    break;
                case 8:
                    System.out.println("\nEjercicio 8: Comprobar letra mayuscula");
                    LeerCaracter.comprobarMayuscula(input);
                    break;
                case 9:
                    System.out.println("\nEjercicio 9: Comprobar triangulo");
                    Triangulo.respuestaTriangulo(input);
                    break;
                case 11:
                    System.out.println("\nEjercicio 11: Contar de 100 a 1");
                    MostrarNumeros.imprimir();
                    break;
                case 12:
                    System.out.println("\nEjercicio 12: Calcular factorial");
                    Factorial.imprimirFactorial(input);
                    break;
                case 13:
                    System.out.println("\nEjercicio 13: Contar del 500 al 200");
                    MostrarNumeros.contar();
                    break;
                case 14:
                    System.out.println("\nEjercicio 14: Mostrar pares entre A y B");
                    ParesAB.imprimirPares(input);
                    break;
                case 15:
                    System.out.println("\nEjercicio 15: Indicar signo y paridad");
                    System.out.println("Bucle While");
                    Signo.conWhile(input);
                    System.out.println("\nBucle Do-While");
                    Signo.conDoWhile(input);
                    System.out.println("\nBucle con opcion String");
                    Signo.conOpcionString(input);
                    break;
                case 16:
                    System.out.println("\nEjercicio 16: Convertir millas a kilometros");
                    ConvertirDistancia.ingresarDistancia(input);
                    break;
                case 17:
                    System.out.println("\nEjercicio 17: Mostrar día de la semana");
                    Day.mostrarDia(input);
                    break;
                case 19:
                    System.out.println("Ejercicio 19: Formar texto");
                    FormarTexto.ingresarString(input);
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
        System.out.println("Ejercicio 1: Persona");
        System.out.println("Ejercicio 2: Auto");
        System.out.println("Ejercicio 6: Celular");
        System.out.println("Ejercicio 7: Mostrar pares");
        System.out.println("Ejercicio 8: Comprobar letra mayuscula");
        System.out.println("Ejercicio 9: Comprobar triangulo");
        System.out.println("Ejercicio 11: Contar de 100 a 1");
        System.out.println("Ejercicio 12: Calcular factorial");
        System.out.println("Ejercicio 13: Contar del 500 al 200");
        System.out.println("Ejercicio 14: Mostrar pares entre A y B");
        System.out.println("Ejercicio 15: Indicar signo y paridad");
        System.out.println("Ejercicio 16: Convertir millas a kilometros");
        System.out.println("Ejercicio 17: Mostrar día de la semana");
        System.out.println("Ejercicio 19: Formar texto");
        System.out.println("0. Salir");
        System.out.println("----------------------------------------------");
        System.out.println("\nElija un ejercicio para mostrar por pantalla: ");
    }
}
