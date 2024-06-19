package ejercicios.ejercicio_3;

import ejercicios.auxiliar.IngresarElemento;

public class EsCreciente {
    private static int index = 0;
    private static int[] arreglo = IngresarElemento.ingresarElementoInt();

    private static boolean arregloEsCreciente(int[] arreglo, int index) {
        if (index == arreglo.length - 1)    // cuando llego al ultimo elemento no comparo más
            return true;
        if (arreglo.length <= 1)
            return true;
        if (arreglo[index] >= arreglo[index +1]){   // si el elemento anterior es mayor o igual al siguiente, entonces no es creciente
            return false;
        }
        return arregloEsCreciente(arreglo, index + 1);
    }

    public static void resultado() {
        System.out.print("\nArreglo: {");
        for (int num: arreglo) {
            System.out.print(num + " ");
        }
        if (arregloEsCreciente(arreglo, index))
            System.out.println("} es creciente.\n");
        else
            System.out.println("} no es una lista creciente.\n");
    }
}
