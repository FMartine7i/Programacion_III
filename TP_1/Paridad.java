import java.util.Scanner;

public class Paridad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un número entero: ");
        int num = scanner.nextInt();

        esPar(num);
        scanner.close();
    }


    public static void esPar(int num){
        if (num % 2 == 0){
            System.out.println(num + " es par");
        }
        else{
            System.out.println(num + " es impar");
        }
    }
}
