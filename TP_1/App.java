import java.util.Scanner;
import Persona, Auto, Celular;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        do{
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
            System.out.println("Ejercicio 19: Formar string");
            System.out.println("0. Salir");
            System.out.println("----------------------------------------------");
            System.out.println("\nElija un ejercicio para mostrar por pantalla: ");

            String op = input.nextInt();

            switch(op){
                case 1:
                    Persona persona = new Persona("Lautaro", "Martinez", 'M', 25, "Bahia Blanca");
                    persona.mayorDeEdad();   
                    break;
                case 2:
                    Auto auto = new Auto("gris", "ABC123", 2018, "Dodge", 100001);
                    auto.encender();
                    auto.kilometrajeMayor();
                    break;
                case 6:
                    Celular celular = new Celular("Samsung", "S9");
                    celular.realizarLlamada();
                    celular.cortarLlamada();
                    break;
                case 7:
                    Paridad.esPar(0);
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
        while(op != 0);

        input.close();
    }
}
