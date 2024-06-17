package ejercicios;

import ejercicios.excepciones.IngresaNumeroNegativoException;

public class Factorial extends BaseInput{
    public int calcularFactorial(int num) throws IngresaNumeroNegativoException {
        if (num < 0)
            throw new IngresaNumeroNegativoException("Error: número negativo ingresado.");
        if (num == 0 || num == 1)
            return 1;
        else {
            int resultado = 1;
            for (int i = 2; i <= num; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }

    public void ingresarNum() {
        System.out.println("Ingresar un número: ");
        int n = input.nextInt();
        try {
            System.out.println("El factorial de " + n + " es: " + calcularFactorial(n));
        }
        catch (IngresaNumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }
}
