package ejercicios;

public class EjercicioArreglo extends BaseInput {
    private static final int size = 5;
    private int[] arreglo = new int[size];

    public void ingresarElemento() {
        for (int i = 0; i < size; i++) {
            System.out.println("Ingresar número para el índice " + i + ": ");
            arreglo[i] = input.nextInt();
        }
    }

    public int[] deleteElemento() {
        System.out.println("Ingresar índice del elemento buscado: ");
        int index = getElemento();
        int[] nuevoArreglo = new int[arreglo.length - 1];

        for (int i = 0, j = 0; i < size - 1; i++) {
            if (i != index)
                nuevoArreglo[j] = arreglo[i];
        }
        System.out.println("Elemento en el índice " + index + " eliminado.");
        return nuevoArreglo;
    }

    public int getElemento() {
        System.out.println("Ingresar índice del elemento buscado: ");
        int index = input.nextInt();
        int n = 0;

        if (index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("Indice fuera de rango.");

        for (int i = 0; i < size; i++) {
            if (index == i)
                n = arreglo[i];
        }
        return n;
    }

    public void menuArray() {
        ingresarElemento();
        int op;

        do {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Obtener elemento por su índice");
            System.out.println("2. Eliminar elemento\n");
            op = input.nextInt();

            if (op == 1)
                System.out.println(getElemento());
            else if (op == 2)
                System.out.println(deleteElemento());
            else if (op == 0)
                System.out.println("Saliendo del menú...");
            else
                System.out.println("Opción errónea. Por favor elija [1-2]");
        } while (op != 0);
    }
}
