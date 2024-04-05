import java.util.Scanner;

public class Signo {

    public static void conWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un número entero (0 para salir): ");
        int num = scanner.nextInt();

        while (num > 0){           
            while (num != 0){
                if (num > 0)
                    System.out.println("El número ingresado es positivo");
                else
                    System.out.println("El número ingresado es negativo");
                
                System.out.println("Ingresar otro número entero (0 para salir): ");
                num = scanner.nextInt();
            }
            scanner.close();
        }
    }

    public static void conDoWhile(){
        Scanner scanner = new Scanner(System.in);
        int num;

        do{
            System.out.println("Ingresar un número entero (0 para salir): ");
            num = scanner.nextInt();
            
            if(num != 0){
                if (num > 0)
                        System.out.println("El número ingresado es positivo");
                    else
                        System.out.println("El número ingresado es negativo");
            }
        }
        while(num != 0);

        scanner.close();
    }

    public static void conOpcionString(){
        Scanner input = new Scanner(System.in);
        String option = input.nextLine();
        String op = option.toUpperCase(); 

        do{
            System.out.println("Ingresar un número entero: ");
            int num = input.nextInt();
            
            if(num != 0){
                if (num > 0)
                        System.out.println("El número ingresado es positivo");
                    else
                        System.out.println("El número ingresado es negativo");
            }
            
            System.out.println("¿Desea introducir más números? (S/N): ");
        }
        while(op != "N");

        input.close();
    } 
}
