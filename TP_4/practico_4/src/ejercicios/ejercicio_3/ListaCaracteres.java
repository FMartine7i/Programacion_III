package ejercicios.ejercicio_3;

public class ListaCaracteres {
    private static String[] lista = {"java", "csharp", "typescript", "c"};
    private static int index = 0;

    public static boolean estaPresente(String[] arreglo, int index) {
        if (index >= arreglo.length - 1)
            return false;
        if (arreglo[index].equals("java"))
            return true;
        return estaPresente(arreglo, index + 1);
    }

    public static void resultado() {
        System.out.print("\nArreglo: {");
        for (String lenguaje : lista) {
            System.out.print(lenguaje + " ");
        }
        if (estaPresente(lista, index))
            System.out.println("}\nLa palabra java se encuentra en la lista.");
        else
            System.out.println("}\nLa palabra java no se encuentra en la lista.");
    }
}
