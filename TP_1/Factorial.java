import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un número entero: ");
        int num = scanner.nextInt();
        System.out.println(factorial(num));
        
        scanner.close();
    }

    public static int factorial(int num){
        if (num == 0 || num == 1)
            return 1;
        else{
            int resultado = 1;
            for (int i = 2; i <= num; i++){
                resultado *= i;
            }
            return resultado;
        }
    }    
}
