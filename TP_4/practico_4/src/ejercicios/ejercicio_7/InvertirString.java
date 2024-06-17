package ejercicios.ejercicio_7;

import java.util.Stack;

public class InvertirString {
    public static String reverseStr(String str) {
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int i =0;
        while (!stack.isEmpty()) {
            reverseString[i++] = stack.pop();
        }
        return new String(reverseString);
    }

    public static void resultado() {
        String str = "Hola mundo";
        System.out.println("\nString: " + str +
                "\nReverse string: " + reverseStr(str) + "\n");
    }
}
