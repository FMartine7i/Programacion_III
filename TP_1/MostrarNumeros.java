public class MostrarNumeros {
    
    public static void imprimir(){
        int num = 100;
        do{
            System.out.println(num);
            num--;
        }
        while (num <= 1);
    }

    public static void contar(){
        for (int i = 500; i >= 200; i--){
            System.out.println(i);
        }
    }
}
