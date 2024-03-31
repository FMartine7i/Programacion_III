public class MostrarNumeros {
    public static void main(String[] args) {
        imprimir();
    }

    public static void imprimir(){
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }
        while (num <= 100);
    }
}
