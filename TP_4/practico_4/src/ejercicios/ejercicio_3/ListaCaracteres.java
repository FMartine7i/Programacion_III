package ejercicios.ejercicio_3;

public class ListaCaracteres {
    private static String[] lenguajes = {"java", "csharp", "typescript", "c", "javascript", "golang"};
    private static int index = 0;

    public static boolean estaPresente(String[] arreglo, int index, String str) {
        if (index >= arreglo.length)
            return false;
        if (arreglo[index].equals(str))
            return true;
        return estaPresente(arreglo, index + 1, str);
    }

    public static void resultado(String str) {
        System.out.print("\nArreglo: {");
        for (String lenguaje : lenguajes) {
            System.out.print(lenguaje + " ");
        }
        if (estaPresente(lenguajes, index, str))
            System.out.println("}\nLa palabra " + str + " se encuentra en la lista.");
        else
            System.out.println("}\nLa palabra " + str + " no se encuentra en la lista.");
    }
}
