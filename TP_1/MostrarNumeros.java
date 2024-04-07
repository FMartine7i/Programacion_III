public class MostrarNumeros {
    
    public static void imprimir(){
        int num = 100;
        do{
            System.out.print(num + " ");
            num--;
        }
        while (num >= 1);
        System.out.println(); // salto de línea
    }

    public static void contar(){
        for (int i = 500; i >= 200; i--)
            System.out.print(i + " ");

        System.out.println(); // salto de línea
    }
}
