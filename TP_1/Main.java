import clases.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Roberto", "Carlos", 12345678);
        Persona funcionario = new Funcionario("Javier", "Milei", 25468762, Poder.EJECUTIVO);
        Persona legislador = new Legislador("Marcela", "Pagano", 3845431, Poder.LEGISLATIVO, "Buenos Aires");
        Persona juez = new Juez("Pepe", "Sánchez", 32465548, Poder.JUDICIAL, "Buenos Aires", Jurisdiccion.NACIONAL);

        System.out.print(persona);
        System.out.print("\n\n" + funcionario);
        System.out.print("\n\n" + legislador);
        System.out.print("\n\n" + juez);
    }
}