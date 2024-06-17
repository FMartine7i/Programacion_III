package ejercicios.ejercicio_3;

import java.sql.SQLOutput;

public class ValorMaximo {
    private static int maximo = 0;
    private static int index = 0;
    private static int[] arreglo = {2, 8, 3, 16, 1, 11};

    public static int valorMaximo(int[] arreglo, int index) {
        if (index == arreglo.length -1)
            return arreglo[index];
        maximo = valorMaximo(arreglo, index + 1);
        return Math.max(arreglo[index], maximo);
    }

    public static void resultado() {
        System.out.print("Arreglo: {");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.print("}");
        System.out.println("\nValor máximo del arreglo: " + valorMaximo(arreglo, index));
    }
}
