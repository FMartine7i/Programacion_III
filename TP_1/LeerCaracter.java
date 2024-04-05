import java.util.Scanner;

public class LeerCaracter {

    public static void esMayuscula(char c){

        if(Character.isLowerCase(c))
            System.out.println(c + " es una letra minúscula");
        else if(Character.isUpperCase(c))
            System.out.println(c + " es una letra mayúscula");
        else
            System.out.println(c + " no es una letra");
    }

    public static void comprobarMayuscula() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un caracter: ");
        String input = scanner.next();

        if(input.length() == 1){
            char c = input.charAt(0);
            esMayuscula(c);
        }
        else
            System.out.println("Debe ingresar un solo caracter del alfabeto.");
        
        scanner.close();
    }
}