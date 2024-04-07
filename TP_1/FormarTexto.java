import java.util.Scanner;

 public class FormarTexto {
     public static void ingresarString(Scanner input){
         String palabra;
         String texto = "";

         do{
             System.out.println("Ingresar una palabra (string vacío para salir): ");
             palabra = input.nextLine();
             if(palabra.length() != 0)
                texto += palabra + " ";
         }
         while(palabra != "");
        
         System.out.println(texto);
    }
}
