import java.util.Scanner;

public class Factorial {

    public static int calcular(int num){
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
    
    public static void imprimirFactorial(Scanner input) {
        System.out.println("Ingresar un número entero: ");
        int num = input.nextInt();
        System.out.println(calcular(num));
    }
}
