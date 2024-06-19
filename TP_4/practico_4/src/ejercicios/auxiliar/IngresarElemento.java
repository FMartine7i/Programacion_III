package ejercicios.auxiliar;

import ejercicios.BaseInput;

public class IngresarElemento extends BaseInput {
    public static int[] ingresarElementoInt() {
        int size = selectArraySize();
        int[] arreglo = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Ingresar número para el índice " + i + ": ");
            arreglo[i] = input.nextInt();
        }
        return arreglo;
    }

    public static int selectArraySize() {
        System.out.print("Determine el tamaño del arreglo: ");
        return input.nextInt();
    }
}
