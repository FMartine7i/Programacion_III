import java.util.Scanner;

public class Signo {

    public static void conWhile(Scanner scanner){
        System.out.println("Ingresar un número entero (0 para salir): ");
        int num = scanner.nextInt();

        while (num > 0){           
            while (num != 0){
                if (num > 0)
                    System.out.print("El número ingresado es positivo");
                else
                    System.out.print("El número ingresado es negativo");
                
                esPar(num);
                System.out.println("\nIngresar otro número entero (0 para salir): ");
                num = scanner.nextInt();
            }
        }
    }

    public static void conDoWhile(Scanner scanner){
        int num;

        do{
            System.out.println("Ingresar un número entero (0 para salir): ");
            num = scanner.nextInt();
            
            if(num != 0){
                if (num > 0)
                        System.out.print("El número ingresado es positivo");
                    else
                        System.out.print("El número ingresado es negativo");

                esPar(num);
            }
        }
        while(num != 0);
    }

    public static void conOpcionString(Scanner input){
        String option; 

        do{
            System.out.println("Ingresar un número entero: ");
            int num = input.nextInt();
            
            if(num != 0){
                if (num > 0)
                        System.out.print("El número ingresado es positivo");
                    else
                        System.out.print("El número ingresado es negativo");
            }
            esPar(num);
            
            System.out.println("\n¿Desea introducir más números? (S/N): ");
            option = input.next().toUpperCase();
        }
        while(!option.equals("N"));
    }
    
    public static void esPar(int num){
        if (num % 2 == 0)
            System.out.println(" y par");
        else
            System.out.println(" e impar");
    }
}
