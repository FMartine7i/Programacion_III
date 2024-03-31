import java.util.Scanner;

public class ParesAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA, numB;

        do{
            System.out.println("El primer número debe ser menor que el segundo");               
            System.out.println("Ingrese un número: ");
            numA = scanner.nextInt();
            System.out.println("Ingrese otro número: ");
            numB = scanner.nextInt();         
        }
        while(numA >= numB);

        mostrarPares(numA, numB);

        scanner.close();
    }

    public static void mostrarPares(int numA, int numB){
        for (int i = numA; i < numB; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
