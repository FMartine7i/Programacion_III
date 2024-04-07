import java.util.Scanner;

public class Day {
    
    public static void esDia(int num){
        switch (num){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }

    public static void esDiaLaboral(int num){
        switch (num){
            case 2, 3, 4, 5:
                System.out.println("Es día laboral.");
                break;
            case 1, 7:
                System.out.println("Es fin de semana.");
                break;
            default:
                System.out.println();
        }
    }

    public static void mostrarDia(Scanner input) {
        System.out.println("Ingrese día de la semana (1-7): ");
        int day = input.nextInt();

        esDia(day);
        esDiaLaboral(day);
    }
    
}
