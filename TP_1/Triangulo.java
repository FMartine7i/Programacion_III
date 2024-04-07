import java.util.Scanner;

public class Triangulo {

    public static void esTriangulo(int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Es un triángulo");
            tipoTriangulo(a, b, c);
        }
        else
            System.out.println("No es un triángulo");
    }

    public static void tipoTriangulo(int a, int b, int c)
    {
        if (a == b && b == c)
            System.out.println("El triángulo es equilátero");
        else if (a == b || b == c || a == c)
            System.out.println("El triángulo es isósceles");
        else
            System.out.println("El triángulo es escaleno");
    }

    public static void respuestaTriangulo(Scanner scanner) {
        System.out.println("Ingresar el lado A del triángulo: ");
        int a = scanner.nextInt();
        
        System.out.println("Ingresar el lado B del triángulo: ");
        int b = scanner.nextInt();

        System.out.println("Ingresar el lado C del triángulo: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0)
            esTriangulo(a, b, c);
        else
            System.out.println("Los lados deben ser mayores a 0");
    }
}
