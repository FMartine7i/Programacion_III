import java.util.Scanner;

public class ConvertirDistancia {
    public static void ingresarDistancia(Scanner input){
        double distancia;

        do{
            System.out.println("Ingresar una distancia en millas (0 para salir): ");
            distancia = input.nextDouble();
            if(distancia > 0){
                double distanciaEnKm = distancia*1.6093;
                System.out.println("El equivalente a " + distancia + " millas es " + distanciaEnKm + " kilómetros");
            }
            else
                System.out.println("La distancia debe ser mayor a 0.");
        }
        while(distancia != 0);       
    }
}
