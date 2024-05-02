import clases.*;

public class Main {
    public static void main(String[] args) {
        Animal miGato = new Gato("Yuumi", 8, "Mestiza");
        Animal miPerro = new Perro("Pipo", 10, "Husky");
        Animal miPajaro = new Pajaro("Paco", 3, "Loro");

        System.out.println(miGato);
        System.out.println(miGato.alimentarse());
        System.out.println(miPerro);
        System.out.println(miPerro.alimentarse());
        System.out.println(miPajaro);
        System.out.println(miPajaro.alimentarse());
    }
}