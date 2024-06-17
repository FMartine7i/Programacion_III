package ejercicios.ejercicio_3;

public class CantidadImpares {
    private static int index = 0;
    private static int contador = 0;
    private static int[] numeros = {2, 3, 4, 5, 10, 11};

    public static int contarImpares(int[] arreglo, int index) {
        if (index >= arreglo.length)
            return contador;
        if (arreglo[index] % 2 != 0) {
            contador++;
        }
        return contarImpares(arreglo, index + 1);
    }

    public static void resultado(){
        System.out.print("\nArreglo: {");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("}\nCantidad impares: " + contarImpares(numeros, index));
    }
}
